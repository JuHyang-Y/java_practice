package ex0823;

import java.util.Scanner;

public class ex03_삼항연산자 {
	public static void main(String[] args) {
		// 1. 첫번째 정수 입력 받기
		System.out.print("첫 번째 정수 입력 : ");
		Scanner sc = new Scanner(System.in); // 한번만 부르면 다음부터 부를 필요가 없다.
		int num1 = sc.nextInt();
		// 2. 두번째 정수 입력 받기
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		// 3. 두개의 수 중 가장 큰 수 찾기
		int result = num1 > num2 ? num1-num2 : num2-num1;
		
		// 4. 큰 수에서 작은 수를 뺀 값을 출력하기
		System.out.println("두수의 차 : " + (num1>num2? num1-num2:num2-num1));
		System.out.println("두수의 차 : " + result);
	}
}