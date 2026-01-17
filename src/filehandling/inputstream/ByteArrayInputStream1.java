/*
read()           → returns int (single byte)
read(byte[])     → returns int (count)
readAllBytes()   → returns byte[]

A stream can be read only once.***
Once all bytes are consumed, every further read() returns -1.
*/
package filehandling.inputstream;
import java.io.*;
public class ByteArrayInputStream1 
{
    public static void main(String[] args) throws Exception
            /*
            Even though ByteArrayInputStream does not actually throw IOException, methods like read(byte[]) inherit
            a declaration that throws IOException, so the compiler forces handling at compile time.
            */
    {
        byte b[]={'j','i','h','g','f','e','d','c','b','a'}; 
        
        //read mode
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        System.out.println("read all bytes ");
        //read all bytes and store in a string by converting the byte array to string
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        
        
        /*
        A stream can be read only once.
        Once all bytes are consumed, every further read() returns -1.
        */
        System.out.println("the stream has already been read so the count of reading strean now willl be -1 ");
        int n=bis.read(b);//count of bytes read
        System.out.println(n); //-1
        bis.close();
    }
}
