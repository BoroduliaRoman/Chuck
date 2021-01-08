package homework.lesson06;

public class OverloadMethods {
	
	int sum() {		
		System.out.println(0);
		return 0;
	}
	
	int sum(int a1) {		
		System.out.println(a1);
		return a1;
	}
	
	int sum(int a2, int b2) {
		int result = a2 + b2;
		System.out.println(result);
		return result;
	}
	
	int sum(int a3, int b3, int c3) {
		int result = a3 + b3 + c3;
		System.out.println(result);
		return result;
	}
	
	int sum(int a4, int b4, int c4, int d4) {
		int result = a4 + b4 + c4 + d4;
		System.out.println(result);
		return result;
	}
}

class OverloadMethodsTest {
	
	public static void main(String[] args) {
		
		OverloadMethods oM = new OverloadMethods();
		oM.sum();
		oM.sum(1);
		oM.sum(2, 3);
		oM.sum(4, 5, 6);
		oM.sum(7, 8, 9, 10);
		
	}
	
	
	
}