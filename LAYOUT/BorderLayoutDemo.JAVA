import java.awt.*;
import javax.swing.*;
public class BorderLayoutDemo
{
      JFrame frame = new JFrame("BorderLayout");
      JButton b1, b2, b3, b4, b5;
      BorderLayoutDemo()
      {
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           b1 = new JButton("BINEESH");
           b2 = new JButton("ANEESH");
           b3 = new JButton("SOBHA");
           b4 = new JButton("ASWATHI");
           b5 = new JButton("RESHMA");
           frame.add(b1, BorderLayout.NORTH);
           frame.add(b2, BorderLayout.SOUTH);
           frame.add(b3, BorderLayout.EAST);
           frame.add(b4, BorderLayout.WEST);
           frame.add(b5, BorderLayout.CENTER);
           frame.setSize(250, 250);
           frame.setVisible(true);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public static void main(String args[])
      {
           new BorderLayoutDemo();
      }
}