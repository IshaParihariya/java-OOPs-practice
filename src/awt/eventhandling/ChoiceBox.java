
package awt.eventhandling;
import java.awt.*;
import java.awt.event.*;

class MyChoiceBox extends Frame implements ItemListener {

    Label l;
    Choice ch;

    public MyChoiceBox()
    {
        super("choic box");
        setLayout(new FlowLayout());

        l = new Label("Select a language");

        ch = new Choice();
          
        // background color
        ch.setBackground(Color.YELLOW);
        // Add items
        ch.add("Java");
        ch.add("Python");
        ch.add("C++");
        ch.add("HTML");

        // Add listener
        ch.addItemListener(this);

        // Add components
        add(l);
        add(ch);
    }

    // When selection changes
    @Override
    public void itemStateChanged(ItemEvent e) 
    {

        String item = ch.getSelectedItem();
        l.setText("You selected: " + item);
    }

}
public class ChoiceBox 
{
    public static void main(String[] args)
    {
        MyChoiceBox mc=new MyChoiceBox();
        mc.setSize(300, 200);
        mc.setVisible(true);  
    }
}
