package quiz1;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// 계산기 만들기
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		String str = sc.nextLine();

		System.out.println("사칙연산의 기호를 입력하세요");
		String os = sc.nextLine();

		System.out.println("두번째 숫자를 입력하세요");
		String str1 = sc.nextLine();

		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str1);
		int num3;

		if (os.equals(" + ")) {
			num3 = num1 + num2;
		} else if (os.equals(" - ")) {
			num3 = num1 - num2;
		} else if (os.equals(" / ")) {
			num3 = num1 / num2;
		} else if (os.equals(" % ")) {
			num3 = num1 % num2;
		} else {
			num3 = num1 * num2;
		}
		System.out.println(str + os + str1 + "=" + num3);
		System.out.println("출력완료");
		int dan = 0;
		int sum = 0;
		
		System.out.print("단 입력 : ");
		dan = sc.nextInt();
		System.out.println("");
		
		for(int i=1; i<=9; i++) {
			sum = dan*i;
			System.out.println(dan+"*"+i+"="+sum);
	}

}
}
