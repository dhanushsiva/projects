import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class filehanding
{
    public static void main(String args[]) throws FileNotFoundException, IOException 
    {
        System.out.println("Select any one of the following mode");
        System.out.println(" w for write mode ");
        System.out.println(" r for read mode ");
        System.out.println(" a for append mode ");
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        if(s.equalsIgnoreCase("r"))
        {
            new ForReading();
        }
        else if(s.equalsIgnoreCase("w")||s.equalsIgnoreCase("a"))
        {
            writingToFile(s);
            
            
        }
        else
        {
            System.out.println("You entered wrong keyword to select the mode ");
        }
        
        
        in.close();
        
    }
    //to write
    public static void writingToFile(String s)
    {
        Scanner in=null;
        try
        {
            String source = "";
            File f=new File("file1.txt");
            
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            FileWriter f0 =null;
            if(s.equalsIgnoreCase("w"))
            {
                f0 = new FileWriter(f,false);
                System.out.println("CAUTION >> Please understand it will overwrite the content of the file ");
                System.out.println("Type 'no' to exit");
                System.out.println("Type 'yes' to proceed ");
                in=new Scanner(System.in);
                String s1=in.nextLine();
                if(s1.equals("no"))
                System.exit(0);
                System.out.println("Type below and when you finished writing please type'stop' ");
                f.delete();
                f.createNewFile();
                while(!(source=bf.readLine()).equalsIgnoreCase("stop"))
                {
                    f0.write(source + System.getProperty("line.separator"));
                    
                }
                in.close();
            }
           
            else
            {  f0 = new FileWriter(f,true);
                System.out.println("Type below and when you finished appending please type'stop' ");
                while(!(source=bf.readLine()).equalsIgnoreCase("stop"))
                {
                    f0.append(source+ System.getProperty("line.separator"));
                }
            }
            f0.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Error : " );
            e.printStackTrace();
        }
    }        
}
//to read
class ForReading {
    public static String str="";
    
    public ForReading() 
    {
        try
        {
            File f5=new File("file1.txt");
            if(! f5.exists())
            f5.createNewFile();
            FileReader fl=new FileReader(f5);
            BufferedReader bf=new BufferedReader(fl);
            //For reading till end
            while((str=bf.readLine())!=null)
            {
                System.out.println(str);
            }
            fl.close();
            }
        catch(Exception e)
        {
            System.out.println("Error : " );
            e.printStackTrace();
        }
     }
    }