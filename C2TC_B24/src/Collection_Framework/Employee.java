package Collection_Framework;

public class Employee {
	
int id;
String name;
int salary;
public Employee(int id, String name, int salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
