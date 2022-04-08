import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class labels {
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("Daco_4224754.png");
        Border border= BorderFactory.createLineBorder(Color.green,3);
        JFrame frame=new JFrame();
        JLabel label=new JLabel();
        



        label.setText("Hello :)");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setForeground(new Color(0x00ff00));
        label.setFont(new Font("MV Boli",Font.PLAIN,50));
        label.setIconTextGap(10);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 100, 350, 350);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

       
        
    }
    
}
