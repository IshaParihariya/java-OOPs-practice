/*
private method accessing through an another method in the same class.

*/

package accessModifiers;

class hello1
{
    private int add(int a,int b) //private method
    {
        return a+b;
    }
    
    public int sum()
    {
       return add(1,2);
    }
}
public class PrivateMethodUsingOtherMethod
{
    public static void main(String[] args)
    {
       hello1 h=new hello1();
      int a= h.sum();
      System.out.println(a);
    }   
}
