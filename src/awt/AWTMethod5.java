package awt;

import java.awt.*;
import java.awt.event.*;

public class AWTMethod5 extends Frame implements ActionListener, WindowListener {

    // Components
    Label title, l1, l2, l3;
    TextField tf1, tf2, tf3;
    Button submit, clear;

    // Constructor
    public AWTMethod5() {

        super("Student Form - AWTMethod5");

        // Layout
        setLayout(new GridLayout(6, 2, 10, 10));

        // Title
        title = new Label("Student Registration Form", Label.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setForeground(Color.BLUE);

        // Labels
        l1 = new Label("Name");
        l2 = new Label("Email");
        l3 = new Label("Mobile");

        // TextFields
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);

        // Buttons
        submit = new Button("Submit");
        clear = new Button("Clear");

        // Background Colors
        l1.setBackground(Color.PINK);
        l2.setBackground(Color.PINK);
        l3.setBackground(Color.PINK);

        // Add Components
        add(title);
        add(new Label(""));

        add(l1);
        add(tf1);

        add(l2);
        add(tf2);

        add(l3);
        add(tf3);

        add(submit);
        add(clear);

        // Add Listeners
        submit.addActionListener(this);
        clear.addActionListener(this);
        addWindowListener(this);

        // Frame Settings
        setSize(500, 350);
        setVisible(true);
    }

    // Button Click Handling
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String name = tf1.getText();
            String email = tf2.getText();
            String mobile = tf3.getText();

            if (name.isEmpty() || email.isEmpty() || mobile.isEmpty()) {

                showDialog("⚠ Please fill all fields!");

            } else {

                String msg =
                        "Submitted Successfully!\n\n" +
                        "Name: " + name +
                        "\nEmail: " + email +
                        "\nMobile: " + mobile;

                showDialog(msg);
            }
        }

        if (e.getSource() == clear) {

            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }

    // Custom Dialog Box
    void showDialog(String message) {

        Dialog d = new Dialog(this, "Message", true);

        d.setLayout(new FlowLayout());

        Label msg = new Label(message);
        Button ok = new Button("OK");

        ok.addActionListener(ev -> d.setVisible(false));

        d.add(msg);
        d.add(ok);

        d.setSize(300, 180);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }

    // Window Closing
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    // Unused methods
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    // Main Method
    public static void main(String[] args) {

        new AWTMethod5();
    }
}
