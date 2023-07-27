package ch05;

import java.util.Iterator;

public class forMainTest2 {

	public static void main(String[] args) {

		// 반복문
		// 화면에 구구단 2 단을 출력하시오
		int num = 2;

//		System.out.println(num + " * 1 = " + (num * 1));
//		System.out.println(num + " * 2 = " + (num * 2));
//		System.out.println(num + " * 3 = " + (num * 3));
//		System.out.println(num + " * 4 = " + (num * 4));
//		System.out.println(num + " * 5 = " + (num * 5));
//		System.out.println(num + " * 6 = " + (num * 6));
//		System.out.println(num + " * 7 = " + (num * 7));
//		System.out.println(num + " * 8 = " + (num * 8));
//		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("==============================");
		
		
		// for 문을 접할 땐 처음부터 여러가지 예시를 보고 배우는것이 좋다.
		for (int i = 0; i < 10; i++ ) {
			System.out.println(num + " * " + i + " = " + (i * num));
		}
		
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));	
			}
		}
		
	
	} // end of main

} // end of class
