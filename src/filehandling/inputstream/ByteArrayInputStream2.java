/*
read(byte[] b, int off, int len) reads up to len bytes from the stream and
stores them in array b starting at index off, returning the number of bytes read.
*/
package filehandling.inputstream;
import java.io.*;
import java.util.*;

public class ByteArrayInputStream2
{
    public static void main(String[] args) throws Exception
    {
        byte source[]={'j','i','h','g','f','e','d','c','b','a'};  //size 10
        
        //read mode
        ByteArrayInputStream bis=new ByteArrayInputStream(source);
        int n=bis.available(); //available or size
        System.out.println(n);
      
        byte b[]=new byte[bis.available()];//new byte to store the array in 
        bis.read(b, 5, 5);//reads from bis. and stores at b byte array
        System.out.print("type casted to char : ");
        for(int i=0;i<=b.length-1;i++)
        {
            System.out.print((char)b[i]+" ");
        }
        System.out.print("\n");
        System.out.print("not type casted to char ASCII values of the char : ");
        System.out.println(Arrays.toString(b));
        
            
    }
}
