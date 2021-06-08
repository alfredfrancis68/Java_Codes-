import java.awt.*;
import java.awt.event.*;  
import javax.swing.*; 
   
public class SwingListener1 extends JFrame implements ActionListener
{  
JTextField tf1;
 	SwingListener1()
	{
 	 setTitle("Button Example");  
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	 tf1=new JTextField();  
   	 tf1.setBounds(50,50,150,20);  
   	 JButton b=new JButton("Click Here");  
   	 b.setBounds(250,400,95,30); 
         add(b); 
   	 b.addActionListener(this);
    	 
         add(tf1);  
   	 setSize(400,400);
       //  FlowLayout f1=new FlowLayout();  
   	 setLayout(null);  
   	 setVisible(true);
	 }  
	
	public static void main(String[] args) 
	{   
	   SwingListener1 s=new SwingListener1(); //creating any frame
	} 
           
	public void actionPerformed(ActionEvent e)
       {  
            tf1.setText("Welcome to Javatpoint.");  
        }  
      
       
}  