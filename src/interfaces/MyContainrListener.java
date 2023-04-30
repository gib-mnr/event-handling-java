package interfaces;



import java.awt.Component;
        import java.awt.Container;
        import java.awt.event.ContainerEvent;
        import java.awt.event.ContainerListener;
        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import javax.swing.JTextField;

public class MyContainrListener extends JFrame implements ContainerListener {
    private JPanel myPanel;

    public MyContainrListener() {
        myPanel = new JPanel();
        myPanel.addContainerListener(this); // Add the ContainerListener to the panel
        JTextField myTextField = new JTextField("Hello, world!");
        myPanel.add(myTextField); // Add a text field to the panel
        add(myPanel);
        pack();
        setVisible(true);
    }

    public void componentAdded(ContainerEvent e) {
        Component c = e.getChild();
        System.out.println("Component added: " + c.getClass().getName());
    }

    public void componentRemoved(ContainerEvent e) {
        Component c = e.getChild();
        System.out.println("Component removed: " + c.getClass().getName());
    }

    public static void main(String[] args) {
        new MyContainrListener();
    }
}

