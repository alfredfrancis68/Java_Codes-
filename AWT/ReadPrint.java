import java.awt.*;
import java.awt.event.*;

public class ReadPrint extends Frame implements ActionListener
{
 TextField tf1,tf2;
  public ReadPrint() 
 {
  Button b1 = new Button("PRESS ME");
  tf1=new TextField();
  tf2=new TextField();
  //b1.setBounds(100,120,80,30);  
  b1.addActionListener(this);                         
  
  add(b1); 	
   add(tf1);
  add(tf2);	                   
  setSize(400, 500);                       //setting size.
  

  setLayout(new FlowLayout());	         //set default layout for frame.	  	
  setVisible(true);                     //set frame visibilty true.	  	
 }

  public void actionPerformed(ActionEvent e)
  {  
    String s1=tf1.getText();
    int n=Integer.parseInt(s1);	
    n=n+1;
    tf2.setText(n+"");
  }
 public static void main (String[] args)
 {
  ReadPrint ta = new ReadPrint();   //creating a frame.
 }
}
