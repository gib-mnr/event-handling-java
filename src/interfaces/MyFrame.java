package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    private JButton myButton;

    public MyFrame() {
        myButton = new JButton("Click me!");
        myButton.addActionListener(this); // Add the ActionListener to the button
        add(myButton);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
