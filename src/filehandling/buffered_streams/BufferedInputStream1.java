/*
BufferedInputStream is a wrapper stream that reads data from another input stream using a memory 
buffer to make reading fast and efficient.

- It does NOT read from a file directly
- It wraps another stream (usually FileInputStream)

Disk File
   ↑
FileInputStream      (talks to OS / disk)
   ↑
BufferedInputStream  (holds data in memory)
   ↑
Your Java Code

What happens internally ???
BufferedInputStream creates an 8 KB buffer (default)
Reads 8 KB at once from FileInputStream
Serves bytes one by one from buffer
When buffer is empty → refills automatically
*/
package filehandling.buffered_streams;

import java.io.*;
public class BufferedInputStream1 
{
    public static void main(String[] args) 
    {
        try
        {
        //read mode
        FileInputStream fis=new FileInputStream("C:\\Users\\ishh1\\OneDrive\\Desktop\\java\\FileWriter1.txt");
        //buffer
        BufferedInputStream bis=new BufferedInputStream(fis);
        //read and print byte by byte
        int x;
        //loop condition 
        while((x=bis.read())!=-1) //reading through BufferedStream 
        {
           System.out.println((char)x);//type casting as read() returns int 
        }
        bis.close();
        fis.close();
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
/*
run : 
I
S
H
A
 
P
A
R
I
H
A
R
I
Y
A
*/