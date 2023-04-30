package interfaces;

import java.awt.event.WindowEvent;
        import java.awt.event.WindowListener;
        import javax.swing.JFrame;

public class MyWindowListener extends JFrame implements WindowListener {
    public MyWindowListener() {
        addWindowListener(this); // Add the WindowListener to the frame
        setSize(400, 400);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened!");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing!");
        dispose(); // Close the window
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed!");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window minimized!");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window restored!");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated!");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated!");
    }

    public static void main(String[] arg){

        new MyWindowListener();
    }
}

