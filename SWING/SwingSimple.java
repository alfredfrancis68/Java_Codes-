import javax.swing.*;  
import java.awt.*;  
public class SwingSimple extends JFrame
{  

SwingSimple()
{
       setTitle("FIRST SWING PGM");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(500,300);
       JButton b1 = new JButton("BUTTON 1");
       add(b1);
       JButton b2 = new JButton("BUTTON 2");
       add(b2);
       FlowLayout x=new FlowLayout();
       setLayout(x);
       setVisible(true);
}
public static void main(String args[])
{
   SwingSimple s1=new SwingSimple();   //JFrame created 
}
} 