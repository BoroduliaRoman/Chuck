package lesson04;

public class Car {
	
//	Car(String cvet, String motor) {
//		
//		color = cvet;
//		engine = motor;
//		
//	}
	
//	Car() {
//		System.out.println("Object is created!!!");
//	}
	
//	Car() {
//		color = "blue";
//		engine = "V12";
//	}
	
	Car(String cvet, String motor) {
		
		color = cvet;
		engine = motor;
		
		System.out.println("Цвет машины: " + color + " | Мотор машины: " + engine);
		
	}
	
	String color;
	String engine;
	
}

class CarTest {
	
	public static void main(String[] args) {
		
//		int a;
//		
//		Car car1 = new Car();
//		Car car2 = car1;
//		Car car3;
//		car1.color = "black";
//		car1.engine = "V8";
//		
//		
//		System.out.println("Cvet: " + car1.color);
//		System.out.println("Motor: " + car1.engine);
		
		Car car1 = new Car("black", "V8");
//		System.out.println(car1.color);
//		System.out.println(car1.engine); 
		
		Car car2 = new Car("white", "V6");
//		car2.color = "red";
//		car2.engine = "V5";
//		System.out.println(car2.color);
//		System.out.println(car2.engine);
		
	}
}