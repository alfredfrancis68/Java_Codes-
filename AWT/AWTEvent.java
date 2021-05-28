import java.awt.*;  
import java.awt.event.*;  
class AWTEvent extends Frame implements ActionListener
{  
TextField tf;
	AWTEvent()
	{   
	//create components  
	tf=new TextField();  
	tf.setBounds(60,50,170,20);  
	Button b=new Button("click meeeee");  
	b.setBounds(100,120,80,30);  
	  	  
	b.addActionListener(this);//passing current instance           register listener
  
	//add components and set size, layout and visibility  
	add(b);
	add(tf);  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true); 
	}  
public void actionPerformed(ActionEvent e)
{  
	tf.setText("Welcome");  
}  

public static void main(String args[])
{  
	AWTEvent A=new AWTEvent();  
}  
}  