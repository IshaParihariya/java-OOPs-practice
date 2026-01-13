/*
note : in a package there cannot be multiple classes with the same name
Default access modifiers :

Default access modifier allows members to be accessed
only within the same package. It is applied when no access modifier is specified.

Can we write default explicitly as an access modifier in Java?
❌ NO — Java does NOT allow writing default as a keyword***

default int x = 10;   // ❌ INVALID
default class A { }  // ❌ INVALID

Where Default Members Can Be Accessed

✔ Within the same class
✔ Within the same package

❌ Outside the package
❌ Subclass in another package
*/
/*
NOTE : Java does NOT allow methods outside a class.
Unlike C/C++, every method must belong to a class.
*/
package accessModifiers;

class hi
{
    int a;  //NO access modifier SPECIFIED so DEAFAULT IS APPLIED
    int b;
    hi(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}
class B
{
    hi h=new hi(2,3); //object of hi class
    int mult() //method 
{
return h.a*h.b;
}
}
public class Default
{
    public static void main(String[] args)
    {
        B a=new B();
        int c = a.mult();
         System.out.println(c);
    }
}
/*
ERROR I HAD IN THIS CODE : 

NoSuchMethodError => occurs when the JVM cannot find a method or constructor 
at runtime due to mismatch between compiled class files and source code.
It is a runtime error caused by using outdated class files.**

TO RESOLVE THIS :
1. Run → Clean and Build Project
  then Run → RUN PROJECT
2. A manual method
-> Close NetBeans
-> Go to your project folder
-   Delete:

    build/
    dist/
-> Reopen NetBeans
-> Run the project again

STILL IT WASNT RESOLVED :
PROBLEM : multiple classes with the same name in the package ** INORRECT
->> in a package there cannot be multiple classes with the same name
*/