import java.awt.*;
import java.awt.event.*;

public class Addition extends Frame implements ActionListener
{
 TextField tf1,tf2,tf3;
  public Addition() 
 {
  Button b1 = new Button("ADD");
  tf1=new TextField();
  tf2=new TextField();
   tf3=new TextField();
  b1.setBounds(100,120,80,30);  
  b1.addActionListener(this);                //passing current instance           register listener
  
  add(b1); 	
   add(tf1);
  add(tf2);
add(tf3);	                   
  setSize(1000, 1000);                       //setting size.
  

  setLayout(new FlowLayout());	         //set default layout for frame.	  	
  setVisible(true);                     //set frame visibilty true.	  	
 }

  public void actionPerformed(ActionEvent e)
  {  
    String s1=tf1.getText();
    String s2=tf2.getText();
 
    int n1=Integer.parseInt(s1);
    int n2=Integer.parseInt(s2);
    int sum=n1+n2;
   
    String s3=""+sum;
    tf3.setText(s3);
  }
 public static void main (String[] args)
 {
  Addition ta = new Addition();   //creating a frame.
 }
}
