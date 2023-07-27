package ch05;

import java.util.Iterator;

public class forMainTest1 {

	public static void main(String[] args) {

		// 반복문
		// 화면에 구구단 2 단을 출력하시오
		int num = 2;

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("==============================");
		// 화면에 구구단 3단을 출력 하시오

		num = 3;

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("==============================");

		// 화면에 구구단 4단을 출력 하시오

		num = 4;

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("==============================");

		// 화면에 구구단 5단을 출력 하시오

		num = 5;

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("==============================");

		// 화면에 구구단 6단을 출력 하시오
		num = 6;

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("==============================");

		// 화면에 구구단7단을 출력 하시오
		num = 7;

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("==============================");

		// for 구문 연습
		// for(){}
//		for (초기화식; 조건식; 증감식) {
//			
//		}

		// i 변수 활용해서 증감 시키고 조건을 판단한다.
		// 처음 i값 = 1로 시작
		// i = 1, i = 2, i = 3, i = 4....i = 10, i =11이 되는 순간 조선식의 결과값은 false가 나옴.

		for (int i = 1; i < 11; i++) {
			// 수행이 된다.
			// ...
			// ...
		} // end of for


		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
	    for (int j = 0; j < 5; j++) {
				System.out.print("*");
				System.out.print("*");
				System.out.print("*");
				System.out.print("*");
				System.out.print("*");
				System.out.println();
			}
	    
	    for (int i = 0; i < 5; i++) {
			for (int j = -2; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
	    }
	    
	    for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
	    }
	    
		} // end of main

} // end of class
