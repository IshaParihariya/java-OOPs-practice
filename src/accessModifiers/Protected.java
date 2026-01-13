/*
PROTECTED :
A protected member is accessible:
Within the same class.
Within the same package =>only public can be accessed in another package unless (inheritance-> protected)**
In subclasses (child classes) even if they are in different packages.**

protected behaves like public within the package**
*/
package accessModifiers;
class nmste // parent class
{
        protected int a; // can be accessed outside the class using object h of nmste class in the SAME PACKAGE
        protected int b;
}
class nmste1 extends nmste// child class
{  
   nmste h=new nmste();  //object of nmste 
    nmste1(int a,int b) //constructor nmste1 to access a and b from nmste class
            {
                h.a=a; //using object a and b are accessed
                h.b=b;
            }
    public int  sum()
    {
        return h.a+h.b; //using object a and b are accessed
    }
}
public class Protected 
{
    public static void main(String[] args)
    {
       nmste1 h1=new nmste1(1,2); //object of nmste1
       int sum= h1.sum();
       System.out.println(sum);  //o/p: 3
       
       int c=h1.h.a; //c : 1  protected behaves like public within the package**
         System.out.println(c);
    }
    
}
