package basics;

public class Person {
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	
    public Person() {
		
	}
		
	public Person(String name, int income, String gender, int age) {
		this.name = name;
		this.income = income;
		this.gender = gender;
		this.age = age;		
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	void display()
	{
		int a;
		System.out.println(name + income + gender);
	}
	@Override
	public String toString() {
	return " Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax="+tax+"]";
	}
}
