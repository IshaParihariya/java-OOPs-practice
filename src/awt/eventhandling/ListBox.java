/*
list : can select multiple or single option 

choice : can select only one option 
*/
package awt.eventhandling;
import java.awt.*;
import java.awt.event.*;

class MyListBoxFrame extends Frame
{
    //data members
    Label l;
    List lb;
    //constructor
    public MyListBoxFrame()
    {
       super("ListBox");
       setLayout(new FlowLayout());
       l=new Label("Select from the List Box. No option selected yet");
       // no of rows here that can be seen without SCROLLING ** : 4
       // true means multiple selection is allowed (false : only one item can be selected)*
       lb=new List(4,true);
       
       // background color
       lb.setBackground(Color.pink);
       
       // adding the components
       add(l);
      // adding the list
      lb.add("Monday");
      lb.add("Tuesday");
      lb.add("Wednesday");
      lb.add("Thursday");
      lb.add("Friday");
      lb.add("Saturday");
      lb.add("Sunday");
      add(lb);
      
      // listeners
      Handler h=new Handler();
      lb.addActionListener(h);
      lb.addItemListener(h);
    }
   //Handler
    class Handler implements ActionListener,ItemListener
    {
        // on sleecting and hitting
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // on electiong and hitting enter label will be changed
            l.setText("Selected!!");
        }
        
        // on selecting
        @Override
        public void itemStateChanged(ItemEvent e)
        {
            //will changed the label to the selectedItem selected
            l.setText("Item selected");
        }
    }
    }
public class ListBox 
{
    public static void main(String[] args)
    {
        MyListBoxFrame mf=new MyListBoxFrame();
        mf.setSize(600,600);
        mf.setVisible(true);
    }
}
