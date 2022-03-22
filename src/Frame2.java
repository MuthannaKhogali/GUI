import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2 {

    JFrame frame2 = new JFrame();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame2 window = new Frame2();
                    window.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Frame2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame2 = new JFrame();
        frame2.getContentPane().setBackground(Color.PINK);
        frame2.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(221, 160, 221));
        panel.setBounds(0, 0, 434, 51);
        frame2.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Settings");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(184, 11, 129, 29);
        panel.add(lblNewLabel);

        JButton btnNewButton = new JButton("English");
        btnNewButton.setBounds(77, 66, 89, 23);
        frame2.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Spanish");
        btnNewButton_1.setBounds(176, 66, 89, 23);
        frame2.getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel_1 = new JLabel("Language:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1.setBounds(10, 65, 69, 23);
        frame2.getContentPane().add(lblNewLabel_1);

        JButton gobackButton = new JButton("Go Back");
        gobackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame1 f1 = new Frame1();
                f1.frame.show();
                frame2.dispose();
            }
        });
        gobackButton.setBounds(335, 227, 89, 23);
        frame2.getContentPane().add(gobackButton);

        JButton addButton = new JButton("Add Word");
        addButton.setBounds(10, 113, 127, 23);
        frame2.getContentPane().add(addButton);

        JButton deleteButton = new JButton("Delete Word");
        deleteButton.setBounds(147, 113, 131, 23);
        frame2.getContentPane().add(deleteButton);

        JButton unknownButton = new JButton("Toggle Unknown");
        unknownButton.setBounds(288, 113, 136, 23);
        frame2.getContentPane().add(unknownButton);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(10, 168, 127, 23);
        frame2.getContentPane().add(saveButton);

        JButton loadButton = new JButton("Load");
        loadButton.setBounds(147, 168, 131, 23);
        frame2.getContentPane().add(loadButton);

        JButton processButton = new JButton("Process file");
        processButton.setBounds(288, 168, 136, 23);
        frame2.getContentPane().add(processButton);
        frame2.setBounds(100, 100, 450, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
