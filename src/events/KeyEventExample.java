package events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventExample implements KeyListener {
    private JFrame frame;
    private JLabel label;

    public KeyEventExample() {
        frame = new JFrame();
        label = new JLabel("Press a key");

        frame.addKeyListener(this);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
