package ch01;

public class DataType1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 데이터 타입 종류는 크게 두 가지 있다.
		// 1. 기본 데이터 타입 (primitive type)
		// 2. 참조 타입 (Reference Type)
		
		// 기본 데이터 타입의 종류 - 정수형
		byte b; 	// 1 byte
		short s; 	// 2 byte
		int i; 		// 4 byte
		long l; 	// 8 byte
		b = 127;
		b = -128;
		
		// R 벨류는 대입 연산자 기준으로 왼쪽에 있는 값
		// L 벨류는 대입 연산자 오른쪽에 있는 값
		// R 벨류 기준으로 정수형 기본 4바이트로 받아 들인다.
		// 접미사를 작성해주어야 한다.
		// 정수형의 기본 연산 단위는 4바이트 이다.
		// long 단위를 작성 할 때는 접미사를 넣어줘야 인식한다.
		l = 2100000000L;
		
		// 실수형을 포현할 때 사용하는 데이터 타입(float, double) - 기본 연산 단위 double 이다.
		
		double dou = 10.0;
		float fot = 11.7F; // 접미사 f, F 를 작성해야 한다.
		
		// 정수형 - int( 4byte)
		// 실수형 - double (8byte)
		
		
		System.out.println();
		
	} // end of main

} // end of class
