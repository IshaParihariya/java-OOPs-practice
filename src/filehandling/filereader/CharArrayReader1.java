/*

CharArrayReader : 

CharArrayReader is a character input stream that reads data from a character array (char[]) instead of a file.
CharArrayReader reads characters, while ByteArrayInputStream reads bytes.

reset(); : resets pointer to beginning so the array can be read again**
After calling reset(), the same variable can be reused because reset() repositions the stream, not the variable.

NOTE : Only streams that support marking can be reset.
Check using markSupported().

IN-MEMORY  → reset ✅
BUFFERED   → reset ✅
FILE-BASED → reset ❌

*/
package filehandling.filereader;

import java.io.*;

public class CharArrayReader1 
{
    public static void main(String[] args) throws Exception
    {
        char c[]={'a','s','d','f','y'};
        //reads from char array
        CharArrayReader cr=new CharArrayReader(c);
        //read and print one by one
        int x;
        while((x=cr.read())!=-1)//lpop condition
        {
            System.out.print((char)x);//type casting as read returns int 
        }
        
        System.out.println();
        System.out.println("read again by creating again");
        
        /*

        once a stream is read it cant be re-read automatically 
        */
        //for reading create again
        cr=new CharArrayReader(c);
        int t;
        while((t=cr.read())!=-1)//lpop condition
        {
            System.out.print((char)t);//type casting as read returns int 
        }
        /*
        ALTERNATIVE AND PREFERRABLE WAY :
        // resets pointer to beginning
        cr.reset();
        */
        System.out.println();
        System.out.println("read again by reseting pointer to beginning");
        
        cr.reset(); //pointer to beginning reseted
       // again using the same variable as earlier cuz its just reseted so variable doesnt change**
        while((x=cr.read())!=-1)//lpop condition
        {
            System.out.print((char)x);//type casting as read returns int 
        }
        
        System.out.println();
        cr.close();
    }
}
