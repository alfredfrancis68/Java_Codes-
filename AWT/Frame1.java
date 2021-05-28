import java.awt.*;
public class Frame1
{
 Frame1()
 {
  Frame fm=new Frame();                                  //Creating a frame.
  Label lb = new Label("welcome to java graphics");     //Creating a label
  fm.setTitle("First GUI Program");  
  fm.add(lb);		                               //adding label to the frame.
  fm.setSize(300, 300);                               //setting frame size.
  fm.setVisible(true);                               //set frame visibilty true.
 }
 
public static void main(String args[])
 {
  Frame1 ta = new Frame1(); 
 }
}