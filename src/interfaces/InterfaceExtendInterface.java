
// extending an interface :

// -> NOTE:** an parent interface having an abstract method cannot be overridden by the child interface
//          as both are interfaces.
//-> as cat is extendded from dog so no need to implement both 
//   u can onlt implement the cat interface as its inherited from the dog interface.
package interfaces;

interface dog  // parent interface
{
    static void walk() //static method->cant be overridden
    {
        System.out.println("dog is walking");
    }
    default void sound() //default method-> can be overridden
    {
        System.out.println("dog is barking");
    }
    void eat(); //abstract method->need to be overriddden
}
interface cat extends dog 
{
    @Override //default overridden method
    default void sound()
    {
       System.out.println("cat is meowing");  
    }
    void drink(); //another abstract method->need to be overriddden
}
class animal implements cat //class implemnting the interfaces and overridding the methods
{
    @Override
    public void eat() // abstract method of dog interface overridden
    {
        System.out.println("animals are eating");
    }
    @Override
    public void drink() // abstract method of cat interface overridden
    {
        System.out.println("animals are drinking water");
    }
}

public class InterfaceExtendInterface
{
   public static void main(String[] args)
   {
       animal a=new animal();  //obj of animal class
       a.drink(); //animals are drinking water
       a.eat(); //animals are eating
       a.sound(); //cat is meowing
       
       dog.walk(); // static method : dog is walking
   }
}
