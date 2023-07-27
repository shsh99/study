package ch05;

import java.util.Iterator;

public class forMainTest3 {

	public static void main(String[] args) {

		// 1 부터 10 까지 더하는 결과를 화면에 출력 하시오.
		int num = 0;

//		num = num + 1; // ...1
//		num = num + 2; // ...2
//		num = num + 3; // ...3
//		num = num + 4; // ...4
//		num = num + 5; // ...5
//		num = num + 6; // ...6
//		num = num + 7; // ...7
//		num = num + 8; // ...8
//		num = num + 9; // ...9
//		num = num + 10; // ..10
//		System.out.println("결과 : " + num);

		
		for (int i = 0; i < 11; i++) {
			num += i; // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		}
		System.out.println("결과 : " + num);
		
		int sum = 0;
		for (int i = 11; i > 0; i++) {
			sum += 1;
		}
		System.out.println("결과 : " + num);
		
		int num1 = 0;
		for (int i = 0; i >= 10; i--) {
			num1 -= 1;
		}
		System.out.println("결과 : " + num);
		
		
	} // end of main

} // end of class
