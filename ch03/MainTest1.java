package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		char myA = 'A';
		char youerA = 'A';
		
		// 변수를 활용해서 연산 한다고 해서 실제 변수 안에 들어가 있는 값이 변경되지는 않음.
		System.out.println((int)myA);
		System.out.println((short)myA);
		System.out.println("-------------------------------");
		System.out.println(myA);
		System.out.println("-------------------------------");
		
		// 즉 값을 변경 하려면 대입 연산자를 활용할 수 있다.
		myA = 'B';
		System.out.println(myA);
		
		// 대입 연산자에 우선 순위는 가장 낮다.
		// 연산의 방향은 반드시 오른쪽에서 왼쪽으로 생각.
		
	} // end of main

} // end of class
