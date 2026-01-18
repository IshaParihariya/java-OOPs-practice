/*
markSupported returns boolean value 
-true : if mark is supported 
-false : mark not supported 
mark is a point we mark and from there we can re read out stream as stream can be read only once
but buffered and byte array and char array streams can be re read by reset() or creating again 

mark() : //Maximum number of characters that can be read after mark before the mark becomes invalid.
Always give a large readAheadLimit when using mark/reset.**
*/
package filehandling.buffered_streams;
import java.io.*;
public class BufferedInputStream2 
{
    public static void main(String[] args)
    {
        try
        {
        //read mode
        FileInputStream fis=new FileInputStream("C:\\Users\\ishh1\\OneDrive\\Desktop\\java\\FileWriter1.txt");
        //buffer
        BufferedInputStream bis=new BufferedInputStream(fis);
        
        boolean file=fis.markSupported();
        boolean buffer=bis.markSupported();
        System.out.println("file : "+file);//false 
        System.out.println("buffer : "+buffer); // true : mark supported on bufferesstreams
         
        //read 2 bytes then put a mark 
        System.out.println((char)bis.read()); // I
        System.out.println((char)bis.read()); // S
        System.out.println((char)bis.read()); // H 
        System.out.println((char)bis.read()); // A 
        System.out.println((char)bis.read()); //
        //put mark on P till 3 bytes : limit till 3 bytes
        bis.mark(20); // mark on P 
        System.out.println((char)bis.read()); // P
        System.out.println((char)bis.read()); // A
        //reset so points to the mark again : P
        bis.reset();
        System.out.println((char)bis.read()); // P
        System.out.println((char)bis.read()); // A
        System.out.println((char)bis.read()); // R
        System.out.println((char)bis.read()); // I
        bis.mark(20);
        System.out.println((char)bis.read()); // H
        System.out.println((char)bis.read()); // A
        bis.reset();
        System.out.println((char)bis.read()); // H
        System.out.println((char)bis.read()); // A
        System.out.println((char)bis.read()); // R
        System.out.println((char)bis.read()); // I
        System.out.println((char)bis.read()); // Y
        System.out.println((char)bis.read()); // A
                
         fis.close();
         bis.close();
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
