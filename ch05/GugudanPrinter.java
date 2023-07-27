package ch05;

import java.util.Scanner;

public class GugudanPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("화면에 원하는 단을 입력하세요.");
		
//		int intArray[]; = {2,3,4,5,6,7,8,9,};
//		int low = 0;
		int num = sc.nextInt();
		
	
//		String result = (numb > 1) ? "구구단을 출력합니다." : "잘못 입력했습니다.";
//		String result1 = (low < 2) ? "구구단을 출력합니다." : "잘못 입력했습니다.";
//		System.out.println("숫자가 " + num + "이므로 " + result + result1 );
		
		
	
		
		// 방어적 코드 작성 
		
		// 만약 NUM 값 이 2보다 작거나 또는 10 보다 크다면 
		// 잘못 입력 하였스니다. 츨력 
		// 정상 입력 이라면 구구단 출력 
		

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		System.out.println("--------------------");
		

		
		if (num == 2) {
			System.out.println("구구단 2단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num == 3) {
			System.out.println("구구단 3단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num == 4) {
			System.out.println("구구단 4단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num == 5) {
			System.out.println("구구단 5단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num == 6) {
			System.out.println("구구단 6단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num == 7) {
			System.out.println("구구단 7단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num == 8) {
			System.out.println("구구단 8단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num == 9) {
			System.out.println("구구단 9단을 출력합니다.");
			for (int i = 2; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
}
