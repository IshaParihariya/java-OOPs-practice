/*
ByteArrayInputStream_ : reads byte array data
It is a byte stream that reads data from a byte array instead of a file

-returns -1 when stream ends
-read() returns int
-reads from memeory (byte array)
-similar to FileInputStream

ByteArrayInputStream.read() does not throw IOException because 
it reads data from memory, not from an external I/O source, so no I/O failure can occur.
*/
package filehandling.inputstream;

import java.io.*;

public class ByteArrayInputStream_ 
{
    public static void main(String[] args) throws Exception
    {
        byte b[]={'a','b',2,'c',4,'h'};
        
        //read from b byte
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        // read byte by byte
        int x;
        //loop 
        while((x=bis.read())!=-1)
        {
          System.out.print((char)x+" ");  //2 and 4 not printed cuz we converted them to char**
        }
        bis.close();
    }    
}
