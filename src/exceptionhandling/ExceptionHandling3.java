/*
question with both built-in and user-defined Exceptions

NOTE: Correct order of catch blocks (child → parent)**
CUZ Because Java checks catch blocks top-down, and a parent can catch child exceptions.**

***Force floating-point division:
            double per=(obtainedMarks*100)/totalMarks;
*/
package exceptionhandling;
import java.util.Scanner; //for Scanner 
import java.lang.Exception; //for exceptionhandling
/* 
java.lang.
❌ Not required
✔ java.lang is imported automatically
*/

class marks
{
    public int totalMarks;
    public int obtainedMarks;//data members
    public void marksinput() //method marksinput
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter totalMarks : ");
        totalMarks=sc.nextInt();
        System.out.print("Enter obtainedMarks : ");
        obtainedMarks=sc.nextInt();
    }
    public void exception() //exception method
    {
        try //try block
        {
        if(totalMarks <= 0)
        {
            throw new Exception("built-in exception"); //throw built in exception
        }
        else if(obtainedMarks < 0||obtainedMarks > totalMarks)
        {
            throw new InvalidMarksException("user defined exception"); //throw user defined exception 
        }
        else 
        {/* as 
             double per=(obtainedMarks/totalMarks)*100; => obtainedMarks/totalMarks = 0.sum = 0 for double => 0*100 = 0
            so
            ***Force floating-point division:
            double per=(obtainedMarks*100)/totalMarks;
            */
            double per=(obtainedMarks*100)/totalMarks;
            System.out.println("percentage : " +per);
        }
        }
        catch(InvalidMarksException e) //catch for InvalidMarksException
        {
            System.out.println("ERROR : "+e.getMessage());
        }
        catch(Exception e) //catch for Exception
        {
            System.out.println("ERROR : "+e.getMessage());
        }
        
        finally //finally block
        {
            System.out.println("Evaluation completed");
        }
    }
}
class InvalidMarksException extends Exception
{
    InvalidMarksException(String error)
    {
        super(error);
    }
}
public class ExceptionHandling3 
{
    public static void main(String[] args)
    {
        marks m=new marks();
        m.marksinput();
        m.exception();
    }
}
