package ch03;

import java.util.Iterator;

public class MainTest5 {

	public static void main(String[] args) {

		// 증감, 감소 연산자.
		// ++, --
		int num1 = 1;
		// ++num1;
		// num1++;
		// 변수에 접근해서 값을 오직 더하기 1 한다.

		System.out.println(num1);
		// num1++;

		num1 += 1;
		System.out.println(num1);

		// 현재 num1 에는 1 이라는 값이 있음.
		// num1 = 2;
		// num1 = num1 + 1;
		// num1 += 1;
		num1++;
		// 주의할 점 - 증감 연산자는 오직 1을 더한다. 1만 더함

		// 감소 연산자
		int num2 = 1;
		// num2 라는 메모리 공간 안에 0이 될 수 있는 코드 방식 4가지
		// num2 = 0;
		// num2 = num2 - 1;
		// num2 -= 1;
		num2--;
		System.out.println(num2);

		
	} // end of main

} // end of class
