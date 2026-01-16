/*
question1 with diff approach : ASCII based
*/
package filehandling.questions;
import java.io.*;
public class Question2
{
    public static void main(String[] args)
    {
        try
       {
       //create a new file source3.txt - write mode
       FileOutputStream fos=new FileOutputStream("source3.txt");
       //read from file source1.txt - read mode
       FileInputStream fis=new FileInputStream("source1.txt");
       //indiviadually each byte
       int x;
       //till it do not have anything left to read that is return -1
       while((x=fis.read())!=-1) // Reads one byte (ASCII value) at a time
       {
           /*
           ASCII range:
             65–90 → 'A' to 'Z'
            */
           if(x>=65&&x<=90)  // Checks if character is uppercase
           { /*
               In ASCII:
                 'A' (65) + 32 = 'a' (97)
                 'Z' (90) + 32 = 'z' (122)
               */
               fos.write(x+32); //Converts uppercase → lowercase
           }
           else
           {
               fos.write(x);
           }
           /*
           ALTERNATIVE :  More readable
           if (x >= 'A' && x <= 'Z')
          { 
            fos.write(x + 32);
           
           }

           */
       }
       fos.close();
       fis.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println(e);
       }
       catch(IOException e)
       {
           System.out.println(e);
       }
    }
    
}
