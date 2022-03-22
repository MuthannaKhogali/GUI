import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import java.awt.Window;
public class Frame1 {

    JFrame frame = new JFrame();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame1 window = new Frame1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Frame1() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.PINK);
        frame.getContentPane().setForeground(Color.DARK_GRAY);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(221, 160, 221));
        panel.setBounds(0, 0, 167, 261);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JButton startButton = new JButton("Write Text");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame3 f3 = new Frame3();
                f3.frame3.show();
                frame.dispose();

            }
        });
        startButton.setBounds(10, 68, 104, 23);
        panel.add(startButton);

        JButton settingButton = new JButton("Settings");
        settingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame2 f2 = new Frame2();
                f2.frame2.show();
                frame.dispose();


            }
        });
        settingButton.setBounds(10, 113, 104, 23);
        panel.add(settingButton);

        JLabel lblNewLabel = new JLabel("Predective Text ");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(10, 36, 133, 14);
        panel.add(lblNewLabel);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitButton.setBounds(335, 227, 89, 23);
        frame.getContentPane().add(exitButton);

        JLabel lblThisProgramPredicts = new JLabel("This program predicts words or ");
        lblThisProgramPredicts.setForeground(Color.BLACK);
        lblThisProgramPredicts.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblThisProgramPredicts.setBackground(Color.BLACK);
        lblThisProgramPredicts.setBounds(177, 31, 342, 41);
        frame.getContentPane().add(lblThisProgramPredicts);

        JLabel lblPharesesTheUser = new JLabel("phareses the user trys to input");
        lblPharesesTheUser.setForeground(Color.BLACK);
        lblPharesesTheUser.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPharesesTheUser.setBackground(Color.BLACK);
        lblPharesesTheUser.setBounds(177, 65, 342, 41);
        frame.getContentPane().add(lblPharesesTheUser);

        JLabel lblPressWriteText = new JLabel("Press write text to begin");
        lblPressWriteText.setForeground(Color.BLACK);
        lblPressWriteText.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPressWriteText.setBackground(Color.BLACK);
        lblPressWriteText.setBounds(177, 154, 342, 41);
        frame.getContentPane().add(lblPressWriteText);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
