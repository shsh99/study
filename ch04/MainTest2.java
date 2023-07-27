package ch04;

import java.util.Scanner;
// 스캐너는 외보에서 안쪽으로 값을 입력

public class MainTest2 {

	public static void main(String[] args) {

		// 문제 1
		// 1. 스캐너를 사용해서 성적을 입력 받아 주세요
		System.out.println("성적을 입력하세요: ");
		Scanner sc = new Scanner(System.in); // 스캐너 도구 준비 완료
		int score = sc.nextInt(); // R value -> 정수값을 키보드에서 입력 받는다.(연산)
		
		// 2. 만약 90점 이상이면 A 출력
		// 3. 만약 80점 이상이면 B 출력
		// 4. 만약 70점 이상이면 C 출력
		// 5. 만약 70점 이하면 F출력

		if (score >= 90) {
			System.out.println("당신의 학점은 A 학점 입니다.");
		} else if (score>= 80) {
			System.out.println("당신의 학점은 B 학점 입니다.");
		} else if (score>= 70) {
			System.out.println("당신의 학점은 c 학점 입니다.");
		} else {
			System.out.println("당신의 학점은 F 학점 입니다.");
		}
		System.out.println("프로그램 종료.");
	} // end of main

} // end of class
