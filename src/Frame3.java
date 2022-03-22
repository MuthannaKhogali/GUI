import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3 {

    JFrame frame3 = new JFrame();
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame3 window = new Frame3();
                    window.frame3.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Frame3() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame3 = new JFrame();
        frame3.getContentPane().setBackground(Color.PINK);
        frame3.setBounds(100, 100, 450, 300);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(45, 69, 323, 41);
        frame3.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(45, 36, 89, 23);
        frame3.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setBounds(165, 36, 89, 23);
        frame3.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setBounds(279, 35, 89, 23);
        frame3.getContentPane().add(btnNewButton_2);

        JButton homeButton = new JButton("Go Back");
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame1 f1 = new Frame1();
                f1.frame.show();
                frame3.dispose();
            }
        });
        homeButton.setBounds(279, 143, 89, 23);
        frame3.getContentPane().add(homeButton);
    }
}
