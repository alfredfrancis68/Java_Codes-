import java.awt.*;
import javax.swing.*;
public class GridDemo
{
      String title;
      JFrame frame;
      JButton b1, b2, b3, b4, b5, b6;
      GridDemo()
      {
           frame = new JFrame("GridLayoutDemo");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           b1 = new JButton("A");
           b2 = new JButton("B");
           b3 = new JButton("C");
           b4 = new JButton("D");
           b5 = new JButton("E");
           b6 = new JButton("F");
           frame.add(b1);
           frame.add(b2);
           frame.add(b3);
           frame.add(b4);
           frame.add(b5);
           frame.add(b6);
          GridLayout x=new GridLayout(3,2,15,15);
           frame.setLayout(x);
           frame.setSize(200, 200);
           frame.setVisible(true);
      }
      public static void main(String args[])
      {
           new GridDemo();
      }
}