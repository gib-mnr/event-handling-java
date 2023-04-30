package interfaces;


import java.awt.event.MouseEvent;
        import java.awt.event.MouseListener;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JPanel;

public class MyMouseDeligationListener extends JFrame {
    private JPanel myPanel;

    public MyMouseDeligationListener() {
        myPanel = new JPanel();
        JButton myButton = new JButton("Click me!");
        myButton.addMouseListener(new MyMouseListener()); // Register the listener object with the source object
        myPanel.add(myButton);
        add(myPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    private class MyMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked!");
        }

        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed!");
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse released!");
        }

        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse entered!");
        }

        public void mouseExited(MouseEvent e) {
            System.out.println("Mouse exited!");
        }
    }
}
