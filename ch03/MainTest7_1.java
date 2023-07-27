package ch03;

public class MainTest7_1 {

	// 메인 쓰레드(작업자1)
	public static void main(String[] args) {
		
		// 논리 연산자(논리곱, 논리합)
		
		int num1 = 5;
		int i = 0;
		
		// 좋은 코드는 아니지만 이해를 돕기위해.
		boolean value = ((num1 = 1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value); // false
		System.out.println(num1); // 11
		System.out.println(i); // 0
		
		boolean value2 = ((num1 = num1 + 1) > 0) || ((i = 100) < 2000);
		System.out.println(value2); // true
		
		// 부정 --> !
		System.out.println(!value2); // false
		System.out.println(value2); // true
		
		
		
	} // end of main
	
} // end of class
