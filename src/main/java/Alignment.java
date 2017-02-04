/**
 * Created by randallcrame on 2/4/17.
 */

    import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

    public class Alignment {
        public static void main(String args[]) {
            JFrame frame = new JFrame("Alignment Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container content = frame.getContentPane();
            content.setLayout(new GridLayout(0, 1));
            JTextField textField = new JTextField("Left");
            textField.setHorizontalAlignment(JTextField.LEFT);
            content.add(textField);
            textField = new JTextField("Center");
            textField.setHorizontalAlignment(JTextField.CENTER);
            content.add(textField);
            textField = new JTextField("Right");
            textField.setHorizontalAlignment(JTextField.RIGHT);
            content.add(textField);
            textField = new JTextField("Leading");
            textField.setHorizontalAlignment(JTextField.LEADING);
            content.add(textField);
            textField = new JTextField("Trailing");
            textField.setHorizontalAlignment(JTextField.TRAILING);
            content.add(textField);
            frame.pack();
            frame.setSize(250, (int) frame.getSize().getHeight());
            frame.setVisible(true);
        }
    }

