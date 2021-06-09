import java.io.*;
class Dog implements Serializable 
{
	String name,breed;
	public Dog(String name,String breed)
	{
	this.name=name;
	this.breed=breed;
	}
}
class ObjectStream1
{
public static void main(String args[])throws IOException
{
Dog dog1 = new Dog("Tyson","Labrador");
FileOutputStream fileOut = new FileOutputStream("file1.txt");
ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
objOut.writeObject(dog1);

FileInputStream fileIn = new FileInputStream("file1.txt");
ObjectInputStream objIn = new ObjectInputStream(fileIn);
Dog newDog = (Dog)objIn.readObject();    //Explicit typecasting.
System.out.print("Dog Name:"+dog1.name);
System.out.print("Dog Breed:"+dog1.breed);

	objOut.close();
	objIn.close();
}
}
