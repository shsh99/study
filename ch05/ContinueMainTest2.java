package ch05;

public class ContinueMainTest2 {

	public static void main(String[] args) {

		// 1 부터 10 까지 화면에 결과를 출력 하시오
		// 만약 3의 배수라면 화면에 값을 출력하지 마시오
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;

			} // end of if
			System.out.println("i : " + i);

		} // end of for

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
