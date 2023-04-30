package interfaces;

import java.awt.event.MouseEvent;
        import java.awt.event.MouseListener;
        import javax.swing.JFrame;
        import javax.swing.JPanel;

public class MyMouseListener extends JFrame implements MouseListener {
    private JPanel myPanel;

    public MyMouseListener() {
        myPanel = new JPanel();
        myPanel.addMouseListener(this); // Add the MouseListener to the panel
        add(myPanel);
        pack();
        setVisible(true);
    }

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

    public static void main(String[] args) {
        new MyMouseListener();
    }
}

