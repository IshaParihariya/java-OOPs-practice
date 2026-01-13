/*
PRIVATE : 

private is used for DATA HIDING-> Prevents direct access to data
private is used for ENCAPSULATION-> Wrapping data + methods together and controlling access

Can private members be inherited?**
-> NO

Private data cannot be accessed directly outside the class.***
It can be accessed only indirectly through public (or protected) methods of the same class.
*/

// private data members being accessed through the public method in the other class
package accessModifiers;

class hello   //hello class
{
    private int a; //data members (private)
    private int b;
    private int c;
    
    hello(int a,int b) //cconstructor
    {
        //Java does not allow default arguments in constructors***=> hello(int a,int b,int c=2) INCORRECT
        //To achieve default values, Java uses constructor overloading
       this.a=a;
       this.b=b;
       this.c=2;
    }
    
    public int sum() //public method
    {
        return a+b+c;
    }
}
public class Private 
{
    public static void main(String[] args)
    {
       hello h=new hello(2,3); 
       h.sum();
       System.out.println(h.sum());
    }
}
