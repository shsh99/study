package ch05;

import java.util.Scanner;

public class WhileMainTest3 {

	// 메인 함수 = 메인 쓰레드 (작업자)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 을 입력하면 화면에 '반가워' 출력
		// 0을 입력하면 종료
		int input = 1;

		while (input != 0) { // input 값이 0이 아니라면 true 결과가 나온다.
			System.out.println("1.저장 2.수정 3.삭제 4.조회 0.종료");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("저장을 선택 하셨습니다.");
			} else if (input == 2) {
				System.out.println("수정을 선택 하셨습니다.");
			} else if (input == 1) {
				System.out.println("삭제를 선택 하셨습니다.");
			} else {
				System.out.println("조회를 선택 하셨습니다.");
			}
		}

		System.out.println("종료");

	} // end of main

} // end of class
