package ch03;

public class MainTest4 {

	public static void main(String[] args) {

		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자랑 함께 쓰인다.

		int num1 = 1;
		// num1 = num1 + 10;
		num1 += 10; // 위의 내용을 간소화 한 것.
		System.out.println(num1);

		System.out.println("-----------------------");

		int num2 = 1;
		num2 = 10;
		num2 += 100;
		System.out.println(num2);

		System.out.println("-----------------------");

		int num3 = 1;
		// num3 -= 10;
		// 반대로 풀어서 코드를 작성해주세요
		num3 = num3 - 10;
		System.out.println(num3);

		System.out.println("-----------------------");
		// num1 = num1 * 2;
		// 위 내용을 복합 대입 연산자로 변경 해주세요
		num1 *= 2;
		System.out.println(num1);

		System.out.println("-----------------------");

		// num2 = num2 / 2;
		// 위 내용을 복합 대입 연산자로 변경 해주세요
		num2 /= 2;
		System.out.println(num2);

		System.out.println("-----------------------");
		// num2 = num2 % 2;
		// 위 내용을 복합 대입 연산자로 변경 해주세요
		
		num2 %= 2;
		System.out.println(num2);

	} // end of main

} // end of class
