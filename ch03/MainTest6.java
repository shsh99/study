package ch03;

public class MainTest6 {

	public static void main(String[] args) {
		
		// 관계 연산자, 비교 연산자
		// 관찰의 결과가 참, 거짓을 판별할 때 사용한다.
		// 결과는 오직 true, false 로 반환된다.
		
		boolean value1 = 5 > 3;
		boolean value2 = 5 < 3;
		boolean value3 = 5 == 1;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		boolean value4;
		int num1 = 10;
		int num2 = 50;
		
		value4 = num1 < num2;
		System.out.println(value4);
		
		value4 = num1 > num2;
		System.out.println(value4);
		
		// 문제 직접 만들어 보기
		
		// 값이 참인지 거짓인지 출력하시오
        
        boolean val;
        boolean b;
        int no = 1;
        int no1 = 7;
        
        val = no1 == no;
        System.out.println(val);
        
        val = no1 != no;
        System.out.println(val);
        
       
	} // end of main

} // main of class
