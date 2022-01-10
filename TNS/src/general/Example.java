package general;
class Student
{
int sid;
String sname;
String college_name;

Student(int id, String name,String cname)
{
	sid=id;
	sname=name;
	college_name=cname;
	
}
void getInfo()
{
	System.out.println("Student id is:" +sid);
	System.out.println("Student name is:" +sname);
	System.out.println("Student college is:" + college_name);
}
}
public class Example {

	public static void main(String[] args) {
		Student s1=new Student(101,"Alex","BMSIT");
		Student s2=new Student(102,"John","BMSIT");

	}

}
