package quiz1;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumbersGame {

	private static Object coutinue;

	public static void main(String[] args) {
		// 랜덤 도구 사용
		// 스캐너 도구 사용

		// 1. 랜덤 숫자 발생 1 부터 5 까지 하나 생성
		// 2. 사용자에 키보드 입력 값을 받아 주세요
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("값을 입력하세요");

		rd.nextInt();

		int num = rd.nextInt(5) + 1;
		int input = sc.nextInt();
		int num1 = 2;
		
		while (input != num) {
			System.out.println("랜덤 값은 : " + num + " 입니다.");
			System.out.println("실패 하셨습니다.");
			System.out.println("남은 횟수 : " + num1);
			System.out.println("숫자를 입력하세요");
			num1--;
			input = sc.nextInt();
			break;
		} if (input != num) {
			System.out.println("랜덤 값은 : " + num + " 입니다.");
			System.out.println("실패 하셨습니다.");
			System.out.println("남은 횟수 : " + num1);
			System.out.println("숫자를 입력하세요");
			num1--;
			input = sc.nextInt();
		} else if(input != num) {
			System.out.println("랜덤 값은 : " + num + " 입니다.");
			System.out.println("실패 하셨습니다.");
			
	
		} else {
			System.out.println("성공하셨습니다.");
		}
		System.out.println("프로그램이 종료됩니다.");

			

		// 4. 기회는 3번만 주어집니다.

	} // end of main

} // end of class
