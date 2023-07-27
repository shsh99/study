package ch01;

public class DataType2 {

	public static void main(String[] args) {
		
		// 변수에 선언
		char name; // 2byte 공간에 하나의 문자를 담아 둘 수 있다.
		char a;
		char initial;
		
		// 값을 넣다
		name = 'A'; // 홀 따옴표를 사용해야 한다. 하나의 문자만 담을 수 있다.
		// name = 'AB'; 불가능
		
		// 문제
		// 1. name 변수의 값을 화면에 출력 하시오
		System.out.println(name);
		
		// 2. 문자 H 를 화면에 출력 하시오
		System.out.println('H');
		
		// 3. 문자 b 를 화면에 출력 하시오
		System.out.println('b');
		
	} // end of main

} // end of class
