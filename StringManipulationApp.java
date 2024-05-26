import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringManipulationApp extends JFrame {
    private JTextField textField1, textField2;
    private JLabel resultLabel;

    public StringManipulationApp() {
        setTitle("String Manipulation App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 1));
        textField1 = new JTextField();
        textField2 = new JTextField();
        JButton concatButton = new JButton("Concatenate");
        JButton compareButton = new JButton("Compare");
        resultLabel = new JLabel();
        concatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String concatenated = textField1.getText() + textField2.getText();
                resultLabel.setText("Concatenated string: " + concatenated);
            }
        });
        compareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str1 = textField1.getText();
                String str2 = textField2.getText();
                if (str1.equals(str2)) {
                    resultLabel.setText("Strings are equal");
                } else {
                    resultLabel.setText("Strings are not equal");
                }
            }
        });
        add(new JLabel("Enter String 1:"));
        add(textField1);
        add(new JLabel("Enter String 2:"));
        add(textField2);
        add(concatButton);
        add(compareButton);
        add(resultLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StringManipulationApp();
            }
        });
    }
}
