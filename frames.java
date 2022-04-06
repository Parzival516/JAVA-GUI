import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class frames {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("MyFrame!");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(true);
        ImageIcon image=new ImageIcon("Daco_4224754.png");
        frame.getContentPane().setBackground(Color.green);;
        frame.getContentPane().setBackground(new Color(0,0,0));;
        frame.setIconImage(image.getImage());
        frame.setSize(420, 420);
        frame.setVisible(true);
    }
    
}
