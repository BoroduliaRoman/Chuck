package lesson04;

public class Car {
	
	String color = "red";
	String engine = "V6";
	
}

class CarTest {
	
	public static void main(String[] args) {
		
		int a;
		
		Car car1 = new Car();
		Car car2 = car1;
		Car car3;
		car1.color = "black";
		car1.engine = "V8";
		
		
		System.out.println("Cvet: " + car1.color);
		System.out.println("Motor: " + car1.engine);
		
	}
}