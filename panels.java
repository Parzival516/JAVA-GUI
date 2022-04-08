import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class panels {
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("Daco_4224754.png");
        JLabel label=new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);

        JPanel RedPanel=new JPanel();
        RedPanel.setBackground(Color.red);
        RedPanel.setBounds(0,0,250,250);

        JPanel BluePanel=new JPanel();
        BluePanel.setBackground(Color.blue);
        BluePanel.setBounds(250,0,250,250);

        JPanel GreenPanel=new JPanel();
        GreenPanel.setBackground(Color.green);
        GreenPanel.setBounds(0,250,500,250);


        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        RedPanel.add(label);
        frame.add(RedPanel);
        frame.add(BluePanel);
        frame.add(GreenPanel);
    }
    
}
