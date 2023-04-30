package interfaces;
import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;
        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import javax.swing.JTextField;

public class MyKeyboardDeigationListener extends JFrame {
    private JPanel myPanel;
    private JTextField myTextField;

    public MyKeyboardDeigationListener() {
        myPanel = new JPanel();
        myTextField = new JTextField();
        myTextField.addKeyListener(new MyKeyListener()); // Register the listener object with the source object
        myPanel.add(myTextField);
        add(myPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyKeyboardDeigationListener();
    }

    private class MyKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            System.out.println("Key typed: " + c);
        }

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            System.out.println("Key pressed: " + keyCode);
        }

        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            System.out.println("Key released: " + keyCode);
        }
    }
}


