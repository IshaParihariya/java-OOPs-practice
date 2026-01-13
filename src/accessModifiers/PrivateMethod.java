
/*
Accessing a Private Method using a constructor 
*/
/*
A private method can be accessed within the same class. In this example, the private 
method sum() is accessed inside the constructor of the same class, which is allowed in Java.
*/
package accessModifiers;

class hey  //class hey
{
    private int a; //private data members 
    private int b;
    hey(int a ,int b)
    {
       this.a=a;
       this.b=b;
       System.out.println(a+" + "+b+" : "+sum());
    }
    private int sum() //private method
    {
        return a+b;
    }     
}
public class PrivateMethod
{
   public static void main(String[] args)
   {
     hey h;
     h=new hey(2,3);
   }
}
