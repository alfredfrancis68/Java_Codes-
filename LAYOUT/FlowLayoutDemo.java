import java.awt.*;  
import javax.swing.*;  
  
public class FlowLayoutDemo 
{  
JFrame f;  
FlowLayoutDemo()
{  
    f=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
   	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);  
    
      FlowLayout x=new FlowLayout(FlowLayout.RIGHT,50,100);
	
    f.setLayout(x);  
  
    f.setSize(600,600);  
    f.setVisible(true);  
}  
public static void main(String[] args) 
{  
    new FlowLayoutDemo();  
}  
} 