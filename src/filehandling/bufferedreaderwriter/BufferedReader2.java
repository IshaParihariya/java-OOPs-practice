/*
BufferedReader had this read() :
Reads one full line of text
Stops at:
\n
\r
\r\n
and returns a String

Lines are a text concept, not a byte concept
That’s why readLine() exists only in BufferedReader and not in BufferedInputStream.
*/
package filehandling.bufferedreaderwriter;
import java.io.*;
public class BufferedReader2
{
    public static void main(String[] args)
    {
        try
        {
        //read mode
        FileReader fis=new FileReader("C:\\Users\\ishh1\\OneDrive\\Desktop\\java\\FileWriter1.txt");
        //buffer
        BufferedReader bis=new BufferedReader(fis);
        //Read one full line of text
        String str=bis.readLine(); //returns string 
        System.out.println(str);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("error :"+e);
        }
        catch(IOException e)
        {
            System.out.println("error :"+e);
        }
    }
}
