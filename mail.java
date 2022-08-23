import java.util.ArrayList;
import java.util.Scanner;

public class mail {

   public static void main(String[] args) {
	
	           ArrayList<String> emailID = new ArrayList<String>();
	           
	           emailID.add("roland@gmail.com");
	           emailID.add("stephen@gmail.com");
	           emailID.add("chris@gmail.com");
	           emailID.add("eddie@outlook.com");
	           emailID.add("suzan@yahoo.com");
	           emailID.add("jack@abc.com");
	           emailID.add("ragnar@xyz.com");
	           emailID.add("caris@ahm.com");
	                     
	      
	           Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	           System.out.print("Enter a string: ");  
	           String mail= sc.nextLine(); 
	          
	           if(emailID.contains(mail)){
	                 System.out.println("email ID " + mail + " found");
	             }
	             else{
	                 System.out.println( "email ID " + mail + " not found");
	             }
	        

	                   
	       }
   }

