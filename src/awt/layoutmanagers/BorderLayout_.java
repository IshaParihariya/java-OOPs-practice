/*
BorderLayout :
BorderLayout divides the window into 5 areas (regions):

   NORTH
-----------------
|               |
|   CENTER      |
|               |
|WEST       EAST|
-----------------
   SOUTH

add(component, BorderLayout.NORTH);


by default the Frame is BorderLayout**
*/
package awt.layoutmanagers;

import java.awt.*;

class BorderLayoutDemo extends Frame
{
     Button b1,b2,b3,b4,b5;
    // constructor
   public BorderLayoutDemo()
   {
       super("BorderLayout");
      
       b1=new Button("one");
       b2=new Button("two");
       b3=new Button("three");
       b4=new Button("four");
       b5=new Button("five");
       
       
       // adding 
       add(b1,BorderLayout.CENTER);
        add(b2,BorderLayout.EAST);
         add(b3,BorderLayout.NORTH);
          add(b4,BorderLayout.SOUTH);
           add(b5,BorderLayout.WEST);
            
   }
}
public class BorderLayout_ 
{
    public static void main(String[] args)
    {
        BorderLayoutDemo fld=new BorderLayoutDemo();
        fld.setSize(500,500);
        fld.setVisible(true);
    }
}
