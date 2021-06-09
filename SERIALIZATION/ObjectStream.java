import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class ObjectStream
{
public static void main(String args[])throws Exception
{
int data1 = 5;
String data2 = "Jyothi Engineering College";
FileOutputStream file = new FileOutputStream("file.txt");
ObjectOutputStream output = new ObjectOutputStream(file);
output.writeInt(data1);
output.writeObject(data2);

FileInputStream fileStream = new FileInputStream("file.txt");
ObjectInputStream objStream = new ObjectInputStream(fileStream);
System.out.println("Integer data:"+objStream.readInt());
System.out.println("String data:"+objStream.readObject());

output.close();
objStream.close();
}
}
