package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	// 메인 함수 = 메인 쓰레드 (작업자)
	public static void main(String[] args) {

		// 사용자가 입력한 숫자 start 값 받아주세요
		// 사용자가 입력한 숫자 end 값을 받아주세요
		// 결과를 출력하는 프로그램 만들어 주세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("start 값을 입력 해주세요");
		int start = sc.nextInt();
		
		System.out.println("end 값을 입력 해주세요");
		int end = sc.nextInt();
				
		int sum = 0;
	

		while (start <= end ) {
			sum = sum + start;
			// 반드시 종료 되는 조건 식을 추가해서 무한 반복을 조심하자
			start++;
		} // end of while
		System.out.println("합산의 결과 값은 : " + sum + " 입니다.");
		System.out.println("프로그램을 종료 합니다.");
		
	
	} // end of main

} // end of class
