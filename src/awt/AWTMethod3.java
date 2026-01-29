// method 3 : for small and simple applications 
// a single class (has main)

package awt;
import java.awt.*;

public class AWTMethod3 extends Frame
{
   Label l; // label
   TextArea ta; // for multiple lines
   Button b; // button
   
   // constructor
   public AWTMethod3()
   {
       setLayout(new FlowLayout()); // setting Layout
       
       l=new Label("Name ");
       ta=new TextArea(5,20); // text area size
       b=new Button("submit");
       
       // adding the components on the Frame
       add(l);
       add(ta);
       add(b);

   }
   public static void main(String[] args) // main method
   {
       AWTMethod3 am=new AWTMethod3(); // object creation
       am.setSize(500, 500);
       am.setVisible(true);
   }
}
