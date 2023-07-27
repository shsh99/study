package ch03;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 부호 연산자 (+. -)
		// 단항 연산자이다.
		int number = 10;
		// 부호 연산자는 메모리 공간에 접근해서 값을 변경하는 것은 아니다.
		System.out.println(-number);
		
		System.out.println(number);
		// 실제 값을 변경 하려면 대입 연산자 사용
		
		// 문제
		// 1. number 변수에 접근해서 현재 값 양수 10을 -10으로 변경하는 코드 작성할 것.
		// 단 R value 리터럴 값 대신 변수를 활용하시오
		number = -number;
		
		// 2. 그 결과를 출력 하시오.
		System.out.println(number);

	} // end of main

} // end of class
