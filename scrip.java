import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class scrip {
 
static int kzy=0;
 
public static void main(String[] args) throws Exception {
 
 
try{
 
Scanner kbd = new Scanner(new File("people.txt"));
PrintWriter writer = new PrintWriter("patient.txt"); 
 
while (kbd.hasNextLine()) 
 
{
    
   /*take the whole txt */ 
   String mLines = kbd.nextLine();
    
   /*split the txt into an arr at , */ 
   String[] mArr= mLines.split(",");
    
    String name = mArr[0];
 
    Double height = Double.parseDouble(mArr[1]);
 
    double weight= Double.parseDouble(mArr[2]);
 
    double subBMI = weight / (height*height);
 
 
    if (subBMI < 18.5) 
    
    {
    
    writer.println(name+" is underweight");
    
    kzy++;
    
    }
    
    else if(subBMI>=18.5 && subBMI<= 24.9)
    
    {
    
    writer.println(name+" is normal weight");
    
    }
    
    else if (subBMI>= 25.0 && subBMI<=29.9) 
    
    {
    
    writer.println(name+" is overweight"); 
    
    }
    
    else if (subBMI >= 30.0 ) 
    
    {
    
    writer.println(name+ "is Very Overweight"); 
    
    }
 }
 
    writer.println("There is "+ kzy+" number of underweight people ");

    writer.close();
 
    }
    catch(Exception e )
    {
        System.out.println("coundn't find the file");
    }
    }
}