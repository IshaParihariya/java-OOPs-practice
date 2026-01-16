/*
copy content of source1.txt and source2.txt to a new file named destination

No type casting is required while writing because
FileOutputStream.write() accepts an integer value, which is exactly
what read() returns.Type casting is required only when converting the data
for display or for a method that expects a different type.**

Printing → needs (char) 
Writing to file → does NOT need casting 

write.write(x);   // int → int  
write.write(y);   // int → int  
NO type casting required**

Why DID we use casting earlier?
When printing to console :
System.out.print((char)x);
Why?
System.out.print(int) → prints a NUMBER (65)
System.out.print(char) → prints a CHARACTER (A)

write.write('\n'); //new line 
'\n' → char
Java automatically converts char → int
This is implicit casting (widening)***
*/
package filehandling.questions;
import java.io.*;
public class Question3 
{
    public static void main(String[] args)
    {
        try
        {
        //create a new file destination
        FileOutputStream write=new FileOutputStream("C://Users//ishh1//OneDrive//Desktop//java/destination.txt");
        //read from source1.txt
        FileInputStream read1=new FileInputStream("source1.txt");
        //read from source2.txt
        FileInputStream read2=new FileInputStream("source2.txt");
        // as read() return as int so define a int x
        int x;
        //read and print from source1.txt
        while((x=read1.read())!=-1)
        {
            write.write(x);
        }
        //int y
        
        write.write('\n'); // new line**
        /*
        write.write("\n".getBytes());

        */
        int y;
        //read from source2.txt
        while((y=read2.read())!=-1)
        {
            write.write(y);
        }
        write.close();
        read1.close();
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
/*
output on command prompt :

C:\Users\ishh1\OneDrive\Documents\NetBeansProjects\java oops practice questions>type destination.txt
LEARN JAVA PROGRAMMING
learn java programming
*/