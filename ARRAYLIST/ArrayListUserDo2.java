//Collection as a group of User Defined Object.

public class ArrayListUserDo2
{
	public static void main(String aa[])
	{
		ArrayList<Student> s3csa = new ArrayList<Student>();
		
		s3csa.add(new Student("Alfred"));
		s3csa.add(new Student("Deo Saju"));
		s3csa.add(new Student("Amal Shibu"));	
		s3csa.add(new Student("Albin Kuranchery"));
		
		for(Student s : s3csa)
		{
		//System.out.println(s.name());   //Here, s3csa is a collection of student type object.
		System.out.println(s.length1());
		}
	 }
} 
class Student {
	public String name;
	public Student(String name) /*OR  public Student(String name1) */
	{
		this.name = name;   /*OR  name = name1;*/ 
	}
	public int length1()
	{
		return name.length();
		
	}
}