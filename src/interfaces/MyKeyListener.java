package interfaces;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyListener extends JFrame implements KeyListener, MouseListener {
    private JTextArea myTextArea;

    public MyKeyListener() {
        myTextArea = new JTextArea();
//        myTextArea.setPreferredSize(new Dimension(200, 120));
        myTextArea.addKeyListener(this); // Add the KeyListener to the text area
        add(myTextArea);
        pack();
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new MyKeyListener();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
