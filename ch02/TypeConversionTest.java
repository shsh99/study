package ch02;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		// 형 변환에 관련한 문제를 직접 만들어 보기
		// 1. JAVA를 입력하여 그 문자의 유니코드를 출력하시오.
		System.out.println((int)'J');
		System.out.println((int)'A');
		System.out.println((int)'B');
		System.out.println((int)'A');
		
		// 2. JAVA의 유니코드의 합을 한 줄로 출력하시오.
		System.out.println('J' + 'A' + 'B' + 'A' );
		
		// 3. 실수형으로 국,영,수 세 과목의 점수를 입력 받아 총점과 평균을 정수형으로 구하시오.
		// 예시 : 국어 90, 영어 93, 수학 78, 총점 261 평균 87   
		double kor = 90.0;
		double eng = 93.0;
		double math = 78.0;
		
		System.out.println((int)kor + eng + math);
		System.out.println((int)(kor + eng + math) / 3);
	
		
		// 4. 전화번호를 출력해보세요
		// 예시 : 제 전화번호는 010-1234-6728 입니다.
		String number = "010-1234-5678";
		System.out.println("제 전화번호는 " + number + " 입니다.");
		
		// 5. 카페에서 3명이 음료를 주문하려고 한다. 총액을 출력하시오.
		// 예시 : 아메리카노 한 잔 원, 라떼 원 에이드 원으로 총 원 입니다. 
		int americano = 2000;
		int latte = 4000;
		int ade = 4500;
		int total = americano + latte + ade; 
		System.out.println("아메리카노 한 잔 " + americano + "원, 라떼" + latte + "원, 에이드" + ade +"원으로 총" + total + "원 입니다.");
		
	
		

	} // end of main

} // end of class
