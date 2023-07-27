package ch03;

public class MainTest7 {

	public static void main(String[] args) {
		
		
		// 논리 연산자 (&&, ||) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용한다ㅏ.
		// 연산의 결과는 true, false 반환
		
		int num1 = 10;
		int num2 = 20;
		
		// 논리 곱(&&)
		// 논리 곱은 모든 결과 값이 참이어야 참. true
		// 하나라도 거짓이 나오면 무조건 거짓. false
		
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		
		boolean flag3 = (num1 < 0) && (num2 < 0);
		System.out.println(flag3);
		
		// 결론
		// 논리 곱에서 하나라도 거짓이 있으면 연산의 결과는 false 이다.
		
		System.out.println("------------------------------");
		
		// 논리 합 (||)
		// 논리합에서는 하나라도 참이 있으면 연산의 결과는 true
		flag1 = (num1 < 0) || (num2 > 0);
		System.out.println(flag1); // true
		
		// flag2 = true || true	 = true 
		// flag3 = true || false = true
		// flag4 = false || false = false
		
	} // end of main
	
} // end of class
