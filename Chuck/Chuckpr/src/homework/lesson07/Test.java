package homework.lesson07;

public class Test {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "Borodulia", 29, 400, "Marketing");
		Employee emp1 = new Employee(2, "Selivon", 29, 500, "Farm");
		
		emp.show();
		emp.show1();
		emp.show2();
		
		emp1.show();
		emp1.show1();
		emp1.show2();
		
//		System.out.println(emp.id + " " + emp.surname + " " + emp.age + " " + emp.salary + " " + emp.departament);
	}

}
