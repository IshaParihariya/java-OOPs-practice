/*
FlowLayout is a layout manager in AWT that arranges components:

 Left → Right
 Then moves to next line if space is full
 Center aligned
*/
package awt.layoutmanagers;
import java.awt.*;

class FlowLayoutDemo extends Frame
{
    Button b1,b2,b3,b4,b5,b6;
    // constructor
   public FlowLayoutDemo()
   {
       super("FlowLayout");
       
       // layout
       FlowLayout fl=new FlowLayout();
       fl.setAlignment(FlowLayout.RIGHT); // bydeault centre
       // horizontal and verticle gaps can be set as well
       setLayout(fl);//setting the Layout
       
       b1=new Button("one");
       b2=new Button("two");
       b3=new Button("three");
       b4=new Button("four");
       b5=new Button("five");
       b6=new Button("Six");
       
       // adding 
       add(b1);
        add(b2);
         add(b3);
          add(b4);
           add(b5);
            add(b6);
   }
}
public class FlowLayout_
{
    public static void main(String[] args)
    {
        FlowLayoutDemo fld=new FlowLayoutDemo();
        fld.setSize(200,200);
        fld.setVisible(true);
    }
}
