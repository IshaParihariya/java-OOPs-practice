/*
BufferedWriter : 

flush(); ** 
close(); 

File may be empty or partially written
Because:
BufferedWriter writes to memory first
Data is written to file only on flush or close
*/
package filehandling.bufferedreaderwriter;
import java.io.*;
public class BufferedWriter1 
{
    public static void main(String[] args)
    {
        try
        {
        //write char
        FileWriter fw=new FileWriter("C:\\Users\\ishh1\\OneDrive\\Desktop\\java\\BufferedWriter1.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        
        char c[]={'a','b','c','d','a','b','c','d','a','b','c','d','a','b','c','d'};
        bw.write(c, 0, 7);
        bw.flush();
        fw.close();
        bw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
