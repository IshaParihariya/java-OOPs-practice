/*
BufferedReader and BufferedInputStream use the same buffering concept, but BufferedReader works with characters 
and encoding, while BufferedInputStream works with raw bytes.

mark() : //Maximum number of characters that can be read after mark before the mark becomes invalid.
Always give a large readAheadLimit when using mark/reset.**
*/
package filehandling.bufferedreaderwriter;
import java.io.*;
public class BufferedReader1 
{
    public static void main(String[] args)
    {
    try
        {
        //read mode
        FileReader fis=new FileReader("C:\\Users\\ishh1\\OneDrive\\Desktop\\java\\FileWriter1.txt");
        //buffer
        BufferedReader bis=new BufferedReader(fis);
        
        boolean file=fis.markSupported();
        boolean buffer=bis.markSupported();
        System.out.println("file : "+file);//false 
        System.out.println("buffer : "+buffer); // true : mark supported on bufferedReader
         
        //read 2 bytes then put a mark 
        System.out.println((char)bis.read()); // I
        System.out.println((char)bis.read()); // S
        System.out.println((char)bis.read()); // H 
        System.out.println((char)bis.read()); // A 
        System.out.println((char)bis.read()); //
        //Maximum number of characters that can be read after mark before the mark becomes invalid.
        //Always give a large readAheadLimit when using mark/reset.
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
