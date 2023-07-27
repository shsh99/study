package ch05;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumbersGame2 {

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

		// 3. 만약 랜덤 숫자와 사용자 입력 값이 맞으면 성공
		int count = 0;
		while (input != num) {
		
			System.out.println("랜덤 값은 : " + num + " 입니다.");
			System.out.println("실패 하셨습니다.");
			System.out.println("남은 횟수 2회");
			System.out.println("숫자를 입력하세요");
			input = sc.nextInt();
			
			if (input != num) {
				System.out.println("랜덤 값은 : " + num + " 입니다.");
				System.out.println("실패 하셨습니다.");
				System.out.println("남은 횟수 1회");
				System.out.println("숫자를 입력하세요");
		
			} else if (input != num) {
				System.out.println("랜덤 값은 : " + num + " 입니다.");
				System.out.println("실패 하셨습니다.");
				System.out.println("남은 횟수 0회");	
			}	
			System.out.println("성공하셨습니다.");
		}

		System.out.println("프로그램 종료");

		// 4. 기회는 3번만 주어집니다.

	} // end of main

} // end of class
