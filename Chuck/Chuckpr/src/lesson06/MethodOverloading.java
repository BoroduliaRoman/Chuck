package lesson06;

public class MethodOverloading {

	void show(int i1) {
		System.out.println("Data type is int");
		System.out.println(i1);
	}
	
	void show(int a, int b) {
		System.out.println("Data type is int");
		System.out.println(a);
	}
	
	void show(boolean b1) {
		System.out.println("Data type is boolean");
		System.out.println(b1);
	}
	
	void show(String s1) {
		System.out.println("Data type is String");
		System.out.println(s1);
	}
	
	void show(String s, int a) {
		System.out.println("String : " + s + " Int: " + a);
	}
	
	void show(int a, String s) {
		System.out.println("Kakoy horoshiy den!!!");
	}
	
}


class MethodOverloadingTest {
	
	public static void main(String[] args) {
		
		MethodOverloading mO = new MethodOverloading();
		int a = 500;
		mO.show(a);
		boolean b = true;
		mO.show(b);
		String s = "Privet";
		mO.show(s);
		mO.show(10, "privet");		
		
	}
}