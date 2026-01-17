/*
CharArrayWriter is a character output stream that writes characters into a char array in memory, not into a file.
char → int  (automatic widening)
int  → char (needs casting)

*/
package filehandling.filewriter;
import java.io.*;
public class CharArrayWriter1
{
    public static void main(String[] args) throws Exception
    {
        
        //write mode
        CharArrayWriter cw=new CharArrayWriter();
        //writing one by one char
        cw.write('a');
        cw.write('a');
        cw.write('a');
        cw.write('a');
        cw.write('a');
        cw.write('a');
        //Extracts all written characters as a char[]
        char c[]=cw.toCharArray();
        for(int x:c)
        {/*
            x is declared as int
          Each char from c is automatically widened to int
          System.out.print(int) prints a number
          To print the character, you must cast back to char
            */
            System.out.print((char)x); /*
            char → int  (automatic widening)
            int  → char (needs casting)

            */
        }
        /*
        ALterntate way :
        **
        for(char x:c)
        {
            System.out.print(x);
        }
        */
        cw.close();
    }
}
