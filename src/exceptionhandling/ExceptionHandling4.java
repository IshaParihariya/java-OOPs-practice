/*

same 3rd one question with RuntimeException

RuntimeException :
RuntimeException = Error caused by wrong logic or bad input
-Happens while the program is running
-Java does NOT force you to handle it**
-That’s why it’s called unchecked exception.
-Why does the compiler NOT force it?
-Because RuntimeExceptions are considered programming or input mistakes, not system failures.
-RuntimeExceptions are unchecked, so the compiler does not require try–catch or throws, though 
handling them is recommended.

UNHANDLED RuntimeException : program crashes at runtime**
What happens?
Code compiles ✔
Program runs ❌
JVM prints error
*/
/*
Question with built-in and user-defined RuntimeException
*/
package exceptionhandling;

import java.util.Scanner;

class Markruntime {
    public int totalMarks;
    public int obtainedMarks;

    public void marksinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter totalMarks : ");
        totalMarks = sc.nextInt();
        System.out.print("Enter obtainedMarks : ");
        obtainedMarks = sc.nextInt();
    }

    public void exception() {
        try {
            if (totalMarks <= 0) {
                throw new ArithmeticException("Total marks must be greater than zero");
            }
            else if (obtainedMarks < 0 || obtainedMarks > totalMarks) {
                throw new InvalidMarksException("Invalid obtained marks");
            }
            else {
                double per = (obtainedMarks * 100.0) / totalMarks;
                System.out.println("Percentage : " + per);
            }
        }
        catch (InvalidMarksException e) {
            System.out.println("USER ERROR : " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("BUILT-IN ERROR : " + e.getMessage());
        }
        finally {
            System.out.println("Evaluation completed");
        }
    }
}

/* USER-DEFINED RUNTIME EXCEPTION */
class InvalidMarksException extends RuntimeException {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling4 {
    public static void main(String[] args) {
        Markruntime m = new Markruntime();
        m.marksinput();
        m.exception();
    }
}

