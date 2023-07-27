package ch02;

public class TypeConversion {

	public static void main(String[] args) {

		// 형 변환 : 데이터 타입을 변환 하는 것을 말한다.
		// 1. 강제 형 변환
		// 2. 자동 형 변환

		int iNumber1 = 100; // camel 표기법
		System.out.println(iNumber1);

		double dNumber1;

		dNumber1 = iNumber1; // 자동 형 변환이라고 한다.
		System.out.println(dNumber1);

		System.out.println("=======================");

		double dNumber2 = 1.12345;
		int iNumber2 = (int) dNumber2;
		// 강제 형 변환 - 원래는 오류 발생하지만 컴파일러한테 그냥 넣으라고 하는 의미, 버려지는거는 무시.
		// ex) double 형 1.1231 를 int에 넣으면 1이 나온다.
		System.out.println(iNumber2);

		// 연습
		double a;
		int b;

		// 1. a의 값(리터럴) 0.5 를 담아 보세요
		a = 0.5;

		// 2. b의 값을 10.5를 담아 보세요
		b = (int) 10.5; // 강제 형 변환

		// 3. 화면에 b를 출력해 보세요
		System.out.println(b);

	} // end of main

} // end of class
