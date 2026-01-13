
/* 
protected WITHOUT INHERITANCE

protected behaves like public within the package**
*/
package accessModifiers;

class A         // NO INHERITANCE 
{
    protected int a;
    protected int b;
}
class B
{
    A obj=new A(); //object of A 
    
    B(int a,int b) //constructor of B
    {
        obj.a=a;  //protected accessed in another class WITHOUT INHERITANCE using Object as its in the SAME PACKAGE**
        obj.b=b;        
    }
    public int sum()
    {
        return obj.a+obj.b;
    }
}

public class Protected1 
{
    public static void main(String[] args)
    {
        B obj1=new B(2,3); // object of B
        int c=obj1.sum();
        System.out.print(c+"\n");
    }
}
