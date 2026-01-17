/*
write(byte[] b) writes all the bytes from the given byte array into the output stream at once.

bos.write(b, 0, 2);   // writes 'a','b'
-from array b
-from index 0 
-take 2 bytes from 0 index 
*/
package filehandling.outputstream;

import java.io.*;
public class ByteArrayOutputStream1 
{
   public static void main(String[] args) throws Exception
   {
       //write mode
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        
        byte b[]={'a','b','c','d'};
        //Writes the entire byte array b into the ByteArrayOutputStream.
        bos.write(b);
        /*
        writeTo() copies all data stored in bos
        Sends it to the given FileOutputStream
        File is created (if not already present)
        */
        bos.writeTo(new FileOutputStream("C:\\Users\\ishh1\\OneDrive\\Desktop\\java\\ByteArrayOutputSream1.txt")); 
        System.out.println("File written successfully");
        bos.close();
        
   }
}
