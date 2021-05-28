import java.awt.*;
import java.awt.event.*;

public class AddSub extends Frame implements ActionListener
{
 TextField tf1,tf2,tf3;
 Button b1,b2;
  public AddSub() 
 {
  b1 = new Button("ADD");
  b2 = new Button("SUB");
  tf1=new TextField();
  tf2=new TextField();
   tf3=new TextField();
  //b1.setBounds(100,120,80,30);  
  b1.addActionListener(this); 
  add(b1); 
//   b2.setBounds(100,120,80,30);  
  b2.addActionListener(this); 
  add(b2);	

  add(tf1);
  add(tf2);
  add(tf3);	                   
  setSize(800, 800);                       //setting size.
  

  setLayout(new FlowLayout());	         //set default layout for frame.	  	
  setVisible(true);                     //set frame visibilty true.	  	
 }

  public void actionPerformed(ActionEvent e)
  {  
    String s1=tf1.getText();
    String s2=tf2.getText();
 
    int n1=Integer.parseInt(s1);
    int n2=Integer.parseInt(s2);
    int output;
    if(e.getSource()==b1)
	{
	 output=n1+n2;
	}
    else
       {
         output=n1-n2;
       }
   
    String s3=""+output;
    tf3.setText(s3);
  }
 public static void main (String[] args)
 {
  AddSub a = new AddSub();   //creating a frame.
 }
}
