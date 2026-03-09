
package accessModifiers;

public class AccessModifierExample
{
    private int a = 10;      // private
    int b = 20;              // default
    protected int c = 30;    // protected
    public int d = 40;       // public

    public static void main(String[] args) {

        AccessModifierExample obj = new AccessModifierExample();

        System.out.println("Private variable: " + obj.a);
        System.out.println("Default variable: " + obj.b);
        System.out.println("Protected variable: " + obj.c);
        System.out.println("Public variable: " + obj.d);
    }
}
