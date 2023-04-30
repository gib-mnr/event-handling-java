import events.KeyEventExample;
import events.MouseEventExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // From this we get click Event
        // Now we need to attach a listener to this event source

        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hurray I am clicked");
            }
        });

//        button.addActionListener(e -> System.out.println(" I clicked the Button "));

        frame.add(button);
        frame.pack();
        frame.setVisible(true);


    }
}


//        KeyEventExample keyEventExample = new KeyEventExample();
//        MouseEventExample mouseEventExample = new MouseEventExample();

// Run the key event example
//        keyEventExample.keyPressed(new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A, 'A'));

// Run the mouse event example
//        mouseEventExample.mouseClicked(new MouseEvent(new JFrame(), MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, 50, 50, 1, false));

