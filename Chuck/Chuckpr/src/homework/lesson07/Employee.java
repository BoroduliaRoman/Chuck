package homework.lesson07;

public class Employee {

	protected int id;
	public String surname;
	int age;
	private double salary;
	String departament;

	public void show() {
		System.out.println(id + " " + surname + " " + age + " " + salary + " " + departament);
	}

	public void show1() {
		System.out.println(id + " " + surname + " " + age + " " + salary + " " + departament);
	}

	public void show2() {
		System.out.println(id + " " + surname + " " + age + " " + salary + " " + departament);
	}

	public Employee(int id1, String surname1, int age1, double salary1, String departament1) {
		id = id1;
		surname = surname1;
		age = age1;
		salary = salary1;
		departament = departament1;
	}

	Employee(int id2, String surname2, int age2) {
		this(id2, surname2, age2, 0, "");
	}

	private Employee(int id3, double salary3, String departament3) {
		this(id3, "", 0, salary3, departament3);
	}

}
