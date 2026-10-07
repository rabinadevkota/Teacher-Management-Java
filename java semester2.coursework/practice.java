import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class practice
{
    public static void M1() {
        //Creating a frame
        JFrame jf = new JFrame("Login Page");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Welcome"));
        panel1.setBounds(0,0,500,500);
        panel1.setLayout(null);
        panel1.setBackground(Color.LIGHT_GRAY);
        jf.add(panel1);

        JLabel l1 = new JLabel("Welcome");
        l1.setBounds(450,40,100,50);
        l1.setFont(new Font("BOLD",Font.BOLD,25));
        panel1.add(l1);

        
    }
}