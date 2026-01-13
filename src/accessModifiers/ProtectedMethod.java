/*
Protected Method

*/
package accessModifiers;
class A //class A
{
    protected int sum(int a,int b) //ptotected method 
    {
        return a*b;
    }
}
public class ProtectedMethod 
{
   public static void main(String[] args)
   {
       A a=new A();
      int c= a.sum(1,2); //protected behaves like public within the package** so accessed using object anywhere in the 
                             // SAME PACKAGE
      System.out.println(c);
   }
}
