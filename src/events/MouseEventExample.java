package events;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventExample implements MouseListener {
    private JFrame frame;
    private JLabel label;

    public MouseEventExample() {
        frame = new JFrame();
        label = new JLabel("Click the mouse");

        label.addMouseListener(this);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered the label");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited the label");
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventExample();
    }
}

