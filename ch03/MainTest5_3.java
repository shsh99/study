package ch03;

import java.util.Iterator;

public class MainTest5_3 {

	public static void main(String[] args) {

		// 증감, 감소 - 모양 : 변수 기준으로 앞에 사용, 뒤에 사용 (오직 1을 더하거나 빼거나)
		
		// 1. 감소 연산자가 뒤에 올 경우
		int num1 = 0;
		num1--;
		
		// 응용
		int num2 = 1;
		int num3;
		
		num3 = num2--;
		// num3 = --num2;
		System.out.println(num3);
		System.out.println(num2);
	
		System.out.println("---------------------------");
		
		// 2. 감소 연산자가 앞에 올 경우
		int num20 = 0;
		int num21;
		
		num21 = --num20;
		System.out.println(num21);
		
		System.out.println("---------------------------");
		
		
	} // end of main

} // end of class
