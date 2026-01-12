
// accessing using object in diff class
/*
ACCESS MODIFIERS  :
-WHO can access a class / method / variable.
-FROM WHERE (same class, same package, subclass, anywhere)

PUBLIC :
-can be accessed from anywhere USING OBJECT or INHERITANCE.
-A public class name must match file name.

*/
package accessModifiers;

class rectangle //class
{
    public int length=2; 
    public int breadth;
    //constructor
    rectangle(int length,int breadth) //no garbage value now
    {
        //this keyword
        this.length=length;
        this.breadth=breadth;
    }
    public int area() //area method
    {
        int a=length*breadth;
        return a;
    }
}
/* INCORRECT WAY =>without an object a public variable , method cant be accessed 
                                  OR
                     inheritance of the classes
class reactangle1
{
    reactangle1()
    {
        int area=length*length;  =>***Access modifier (public) does NOT mean “automatic access”
                                        It only means accessible THROUGH an object
        System.out.println("");
    }
}
*/

class rect //class rect
{
    public int area()
    {
        rectangle r=new rectangle(4,3); //object of rectangle can help us accessing length
        int area=r.length*r.breadth;
        return area;
    }
}
public class Public //-A public class name must match file name** -> Public.java

{
    public static void main(String[] args)
    {
      rectangle r=new rectangle(2,3); //constructor calling
      System.out.println("area of the reactangle : "+r.area());
      
      rect r1=new rect(); //rect constructor calling
     System.out.println("area of the reactangle : "+r1.area());
      
      
      
    }
}
