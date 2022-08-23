

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Product_id = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String Product_id = request.getParameter("Product_id");
		PrintWriter pw = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root", "Spacetime@1915");
	    	PreparedStatement pstmt=con.prepareStatement("Select * from products where Product_id ="+Product_id);
	    	 ResultSet rs=pstmt.executeQuery();
	 		 if(rs.next()) {
	 		
	 		pw.println("Product_id = "+ rs.getInt(1)+";    Product_name = "+rs.getString(2)+";    Product_price = "+rs.getInt(3));
	 		}else {
	 			pw.println("Please enter the correct ID");
	 		}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
