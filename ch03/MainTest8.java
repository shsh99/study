package ch03;

import java.util.Scanner;

public class MainTest8 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2;

		int num1 = (5 > 3) ? 10 : 20;
		System.out.println(num1);
		// 변수의 선언과 초기화
		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);
		System.out.println("=========================");
		System.out.println((5 < 3) ? 10 : 20);

		// JDK가 만들어 놓은 도구
		int max = 0;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요");

		// 데이터타입 이름 --> 단 대문자로 시작
		// 변수의 종류에는 가장 크게 2가지 존재
		// 1. 기본 데이터 타입
		// 2. 참조 타입
		// Scanner sc;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int x = sc.nextInt();
		System.out.println("입력 2 : ");
		int y = sc.nextInt();
		int xx = (x > y) ? x : y;
		System.out.println("큰 숫자는 " + xx + "입니다.");
		// System.out.println("받아 들인 값 : ");

		// 문제
		// 두 수를 비교해서 사용자가 입력한 값 중에 큰 수를 화면에 출력하시오
		if (x > y) {
			System.out.print("큰 숫자는" + x + " 입니다.");
		} else {
			System.out.print("큰 숫자는" + y + " 입니다.");
		}

		// 삼항 연산자 - 조건 연산자
		// 메모리공간 호출 = 식을 만들어서 담을 예정
		// x 나 y 중에 큰 값이 max 변수에 담기게 된다.
		// max = (x > y) ? x : y;
		// System.out.println("큰 숫자는" + max + "값 입니다.");
	} // end of main

} // end of class
