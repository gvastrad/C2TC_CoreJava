package Collection_Framework;

class Student
{
	int id;
	String name;
	String branch;
	
	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student information [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	
}
