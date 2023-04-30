package events;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowEventExample implements WindowListener {
    private JFrame frame;

    public WindowEventExample() {
        frame = new JFrame("My Window");

        frame.addWindowListener(this);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public void windowActivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}

    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new WindowEventExample();
    }
}
