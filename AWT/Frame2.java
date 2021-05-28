import java.awt.*;
//import java.awt.event.*;

public class Frame2 extends Frame 
{
  public Frame2() 
 {
  Label lb = new Label("welcome to java graphics");		
  add(lb); 		                    //.
  Button B=new Button("CLICK");
  add(B);  
setSize(400, 500);                       //setting size.
  setTitle("My First Graphics Program");  //setting title.
  setLayout(new FlowLayout());	         //set default layout for frame.	    	
  setVisible(true);                     //set frame visibilty true.	  	
 }
 
 public static void main (String[] args)
 {
  Frame2 ta = new Frame2();   //creating a frame.
 }
}
