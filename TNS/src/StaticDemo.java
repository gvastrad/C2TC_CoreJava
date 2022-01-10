class Student1
{
int sid;
String sname;
static String college_name="BMSIT";

Student1(int id, String name)
{
	sid=id;
	sname=name;
}
static void func()
{
	college_name="MSRIT";
}
void getInfo()
{
	System.out.println("Student id is:" +sid);
	System.out.println("Student name is:" +sname);
	System.out.println("Student college is:" + college_name);
}
static 
{
	System.out.println("Hi i am in a static block");
}

}
public class StaticDemo {
	public static void main(String args[])
	{
		Student1 s1=new Student1(101,"Alex");
		Student1 s2=new Student1(102,"John");
		s1.getInfo();
		s2.getInfo();
		Student1.func();
		s1.getInfo();
		s2.getInfo();
	}

}
