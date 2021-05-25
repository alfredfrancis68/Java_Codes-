import java.util.*;  
class ForEach
{
public static void main(String args[]) 
{  
ArrayList<String> vals = new ArrayList<String>();   
vals.add("A");					       
vals.add("B");

           
System.out.println("Original contents of vals: ");  
System.out.println(vals);       

for(String s : vals)                       
	System.out.print(s);

}
}