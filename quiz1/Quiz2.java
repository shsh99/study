package quiz1;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		/* 
		4번 세 개의 점수를 사용자로부터 받아와서 평균을 구하는 프로그램
		세 개 점수의 평균이 80점을 넘긴다면 평균은 총... 점 이므로 합격입니다. 라는 문구가 출력되게 하라.
		
		결과 값
		국어 점수를 입력하세요 : 
		
		영어 점수를 입력하세요 : 
		
		수학 점수를 입력하세요 : 
		
		평균은 총 점 이므로 불합격입니다.
		프로그램이 종료되었습니다.
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int score = (kor + eng + math) / 3;
		
		if (score >= 80) {
			System.out.println("평균은 총 " + score +"점 이므로 합격입니다.");
		} else {
			System.out.println("평균은 총 " + score +"점 이므로 불합격입니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
