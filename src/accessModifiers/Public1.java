
// accessing using inheritance concept 

//NOTE: Child constructors must call parent constructors using super()**

//Access modifier controls visibility, inheritance controls availability.


package accessModifiers;

class rect1 //class rect1
{
    public int length;
    public int breadth;
    rect1(int length,int breadth) //rect1 constructor
    {
        this.length=length; //this keyword
        this.breadth=breadth;
    } 
    public int area1() //method of rect1
    {
        int area=length*breadth;
        return area;
    }
}
class rect2 extends rect1  //extending rect1
{
    rect2(int l,int b) //rect2 constructor 
    {
       super(l,b); /*
       super(l, b) calls parent constructor
Ensures parent variables are properly initialized
Required because parent has a parameterized constructor
       */
    }
    public int area2() //method rect2
    {
        int area=length*breadth;
        return area;
    }
}

public class Public1 
{
    public static void main(String[] args)
    {
        rect1 r1=new rect1(3,4); //object rect1
        System.out.println("area of rect1 : "+r1.area1());
        
        rect2 r2=new rect2(2,7); //object rect2
         System.out.println("area of rect1 : "+r2.area2());
        
         // r2.area1(); => this can be called cuz its inherited
    }
}
