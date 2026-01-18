/*
###flush() : remember this cuz data ay loose if not flushed
NOTE : 

## FOR FileInputStream and ByteReader :

BufferedReader cannot directly wrap FileInputStream; it must use InputStreamReader to convert bytes into characters.**

Disk File
   ↓
FileInputStream   (bytes)
   ↓
InputStreamReader (byte → char) -> Acts as a bridge between byte streams and character streams
                                   -> This is why it’s called a bridge class.**
   ↓
BufferedReader    (buffered chars)
   ↓
Java Code

FileInputStream fis = new FileInputStream("data.txt");
InputStreamReader isr = new InputStreamReader(fis);
BufferedReader br = new BufferedReader(isr);

## FOR FileOutputStream and ByteWriter :

Java Code (char data)
        ↓
BufferedWriter        (buffered chars)
     +++   ↓
OutputStreamWriter    (char → byte)
        ↓
FileOutputStream      (writes bytes)
        ↓
Disk File

Reader ↔ InputStream → InputStreamReader
Writer ↔ OutputStream → OutputStreamWriter**

*/
package filehandling.buffered_streams;
import java.io.*;
public class BufferedOutputStream1 
{
    public static void main(String[] args)
    {
        try
        {
        //write mode
        FileOutputStream fos =new FileOutputStream("C:\\Users\\ishh1\\OneDrive\\Desktop\\java\\BufferedOutputStream1.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte b[]={'a','b','c','d','e','f','g'};
        bos.write(b);
        bos.flush();
        bos.close();
        fos.close();
        }
        catch(IOException e)
        {
           System.out.println(e); 
        }
    }
    
}
