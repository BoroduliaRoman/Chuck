package homework.lesson05;

public class Employee {
	
	int id;
	String surname;
	int age;
	double salary;
	String departament;
	
	Employee(int id2, String surname2, int age2, double salary2, String departament2) {
		
		id = id2;
		surname = surname2;
		age = age2;
		salary = salary2;
		departament = departament2;
		
	}
	
	double doubleSalary(double a) {
		salary *= 2;
		return salary;
	}

}


class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Borodulia", 29, 400, "Marketing");
		System.out.println(e1.doubleSalary(e1.salary));
		
		Employee e2 = new Employee(2, "Selivon", 29, 300, "Farm");
		System.out.println(e2.doubleSalary(e2.salary));
		
	}
}