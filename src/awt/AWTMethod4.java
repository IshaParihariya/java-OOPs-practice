/*
// mf.setShape(new Line2D.Double(10, 10, 100, 100));
AWT cannot create non-rectangular windows NEED TO USE SWING *
*/
package awt;
import java.awt.*; // importing awt package
import java.awt.geom.Line2D;

class MyFrame extends Frame  // MyFrame extending from Frame
{
    // data members
    Label l;
    TextField tf;
    
    Label l1;
    TextField tf1;
    
    Label l2;
    TextField tf2;
    Button b;
    
    
    // constructor 
    public MyFrame()
    {
        super("My AWT App");
        setLayout(new GridLayout(4,2,10,10)); // setting the layout to FlowLayout
        //  1 
        l=new Label("Name"); // label
        tf=new TextField(50); // TextField
        // 2
        l1 = new Label("Father's Name");
        tf1=new TextField(50);
        // 3
        l2 = new Label("Mother's Name");
        tf2=new TextField(50);
        b=new Button("Submit");
        
        // adding the components on the Frame
        add(l);
        add(tf);
        
        add(l1);
        add(tf1);
        
        add(l2);
        add(tf2);
        add(b);
        // props
        l.setBackground(Color.pink);
        l1.setBackground(Color.pink);
        l2.setBackground(Color.pink);
    }
}
public class AWTMethod4
{
    // main method 
    public static void main(String[] args)
    {
        MyFrame mf=new MyFrame();// object 
        mf.setSize(580,200);
        mf.setVisible(true); // setting visibility
        
    }
}
