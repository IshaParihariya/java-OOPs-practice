/*
SequenceInputStream : SequenceInputStream is used to read data 
sequentially from multiple input streams as if they were a single continuous stream.

SequenceInputStream sis=new SequenceInputStream(read1,read2);

SequenceInputStream does not automatically insert a newline
It simply concatenates files

*/
package filehandling.questions;
import java.io.*;
public class Question4
{
    public static void main(String[] args)
    {
        try
        {
        //create a new file destination
        FileOutputStream write=new FileOutputStream("destination1.txt");
        //read from source1.txt
        FileInputStream read1=new FileInputStream("source1.txt");
        //read from source2.txt
        FileInputStream read2=new FileInputStream("source2.txt");
        //sequence wise write from files
        //Combines read1 → then read2
        //Reads sequentially as if they were one file
        SequenceInputStream sis=new SequenceInputStream(read1,read2);
        //int x 
        int x;
        while((x=sis.read())!=-1)
        {
            write.write(x);
        }
        
        write.close();
        sis.close();
        read1.close(); //(Closing read1 & read2 separately is optional after closing sis.)
        read2.close();
        
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.print(e);
        }
    }
}
