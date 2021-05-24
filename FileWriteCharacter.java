import java.io.*;
class FileWriteCharacter
{
public static void main(String args[])throws IOException
{
FileWriter fw = new FileWriter("FileWriter.txt");
fw.write("This is how character is written into a file");
fw.close();
}
}