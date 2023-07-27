package ch05;

import java.util.Scanner;

public class ContinueMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 부터 10 까지 화면에 결과를 출력 하시오
		// 만약 3의 배수라면 화면에 값을 출력하지 마시오
		System.out.println("값을 입력하세요");
		int i;
		int count = 0;
		final int A = sc.nextInt();
		int start = 1;
		int end = 1000;
		
		for (i = start; i <= end; i++) {
			if (i % A == 0) {
				count = count +1;
				continue;

			} // end of if
			// System.out.println("i : " + i); 숫자 하나씩 보는 것

		} // end of for
		System.out.println(A + "의 배수의 갯수는 : " + count + "개 입니다.");

		// 3의 배수의 개수를 출력 해주세요
		int n = 0;
		
		for (int ii = 1; ii <= 10; ii++) {
			if (ii % 3 == 0) {
				n++;
				// n += i;
			}
		}
		System.out.println("3의 배수의 갯수는 : " + n + "개 입니다.");

	} // end of main

} // end of class
