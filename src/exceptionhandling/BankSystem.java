
package exceptionhandling;
// for insufficient exception handling

import java.util.Scanner;

class ieh extends Exception
{
    // constructor
  public ieh(String message)
  {
      super(message);
  }
}
public class BankSystem
{
    static double balance=1000;
    
    // throws
    static void withdraw(double amount) throws ieh
    {
        if (amount>balance)
        {
            throw new ieh("NOT ENOUGH BALANCE!!");
        }
        balance-=amount;
        System.out.println("WITHDRAW SUCCESSFUL");
    }
    static void deposit(double amount)
    {
        balance+=amount;
         System.out.println("DEPOSIT SUCCESSFUL");
    }
    
     // main class
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1. Deposition \n2. Withdraw \n3. Check balance \n4. Exit ");
            System.out.println("Enter the choice : ");
            
            // try and catch blocks
            try
            {
                int choice=sc.nextInt();
                // switch case
                switch(choice)
                {
                    case 1:
                        System.out.print("enter amount :");
                        double dep=sc.nextDouble();
                        deposit(dep);
                        break;
                     
                        case 2:
                        System.out.print("enter amount :");
                        double amt=sc.nextDouble();
                        withdraw(amt);
                        break;
                        
                        case 3:
                            System.out.println("Balance : "+balance);
                            break;
                        
                        case 4:
                            System.out.println("THANK YOU!!!");
                            
                        default :
                            System.out.println("INVALID CHOICE");
                            break;
                }
            }
            catch(ieh e)
            {
                e.printStackTrace();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            // finally
            finally
            {
                System.out.println("Transaction processed");
            }
        }
    }
    }

