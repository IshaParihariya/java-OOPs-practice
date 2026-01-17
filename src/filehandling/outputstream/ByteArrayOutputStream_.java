/*
The size passed to ByteArrayOutputStream is only the initial capacity and the stream can grow dynamically.**

//toByteArray() returns a new byte array containing the data written to the stream(the initial array).
*/
package filehandling.outputstream;

import java.io.*;
public class ByteArrayOutputStream_ 
{
    public static void main(String[] args) throws Exception
    {
        //write mode for byte array
        //The size passed to ByteArrayOutputStream is only the initial capacity and the stream can grow dynamically.
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);//size of the array 20 
        //writing one byte at once
        bos.write('a');
         bos.write('b');
          bos.write('c');
           bos.write('d');
           //toByteArray() returns a new byte array containing the data written to the stream.
           byte b[]=bos.toByteArray();
           //printing the new b array
           for(int x:b)
           {
               System.out.print((char)x);
           }
           bos.close();
    }
    
}
