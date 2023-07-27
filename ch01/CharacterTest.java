package ch01;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = '가';
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println((int)'가');
		
		// 문제 1
		// 대문자 A는 정수값 얼마 인가?
		System.out.println((int)'A');
		
		// 소문자 a는 정수값 얼마 인가?
		System.out.println((int)'a');
		
		// 주의 char 데이터 타입에는 음수값을 대입 할 수 없다. (양수만 사용)
		char ch2 = 97;
		System.out.println(ch2);
		
		// 문제 2
		// 개발자 라는 단어는 한글자 한글자 정수값이 얼마인지 알아보자.
		System.out.println((int)'개' + '발' + '자');
		System.out.println((int)'개');
		System.out.println((int)'발');
		System.out.println((int)'자');
		
		// 본인이 알고 싶은 단어에 정수값이 얼마인지 알아보자.
		System.out.println((int)'배' + '고' + '파');
		System.out.println((int)'배');
		System.out.println((int)'고');
		System.out.println((int)'파');
		
	} // end of main

} // end of class
