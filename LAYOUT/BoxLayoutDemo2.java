import javax.swing.*; 

//import javax.swing.BoxLayout; 



public class BoxLayoutDemo2 extends JFrame
{ 
	BoxLayoutDemo2()
	{	
		JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5; 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400,500);

		BoxLayout boxlayout = new BoxLayout(getContentPane(),BoxLayout.Y_AXIS); 
		setLayout(boxlayout); 

		jbtn1 = new JButton("Button 1"); 
		jbtn2 = new JButton("Button 2");
		jbtn3 = new JButton("Button 3"); 
		jbtn4 = new JButton("Button 4"); 
		jbtn5 = new JButton("Button 5"); 
		add(jbtn1);  
		add(jbtn2); 
		add(jbtn3); 
		add(jbtn4); 
		add(jbtn5);
		setVisible(true); 
	}

	
	public static void main(String[] args) 
	{ 
	  new BoxLayoutDemo2(); 
		
	} 
} 