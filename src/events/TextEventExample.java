package events;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextEventExample implements TextListener, DocumentListener {
    private JFrame frame;
    private JTextField textField;

    public TextEventExample() {
        frame = new JFrame();
        textField = new JTextField("Type something here");

        textField.getDocument().addDocumentListener(TextEventExample.this);
        frame.add(textField);

//        textField.addTextListener(this);
//        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void textValueChanged(TextEvent e) {
        System.out.println("Text changed: " + textField.getText());
    }

    public static void main(String[] args) {
        new TextEventExample();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
