/*
source1.txt has LEARN JAVA PROGRAMMING so copy it in source2.txt in lower case letters
*/
package filehandling.questions;

import java.io.*;
public class Question1 
{
   public static void main(String[] args)
   {
       try
       {
       //create a new file source2.txt - write mode
       FileOutputStream fos=new FileOutputStream("source2.txt");
       //read from file source1.txt - read mode
       FileInputStream fis=new FileInputStream("source1.txt");
       //indiviadually each byte
       int x;
       //till it do not have anything left to read that is return -1
       while((x=fis.read())!=-1)//reads one byte
       {
            char ch=Character.toLowerCase((char)x); // to lower case convert 
                                                    // before that convert to char from byte i.e., type casting
            fos.write(ch);
       }
       fos.close();
       fis.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println(e);
       }
       catch(IOException e)
       {
           System.out.println(e);
       }
   }
}
