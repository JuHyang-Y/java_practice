package ex0823;

import java.util.Scanner;

public class ex05_단순if문 {
	public static void main(String[] args) {
		// 1. 나이 입력받기 -> int age 변수에 저장!
		System.out.print("나이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		// 2. 입력받은 나이가 성인인지 아닌지 판단 -> 조건문!
		if(age >= 20) {
			// if문에 해당하는 조건식이 true일 경우
			// 실행할 수 있는 공간!

			//3. 판단에 대한 결과 출력!
			System.out.println("성인입니다.");
		}
		
		if(age >= 20)
			System.out.println("성인입니다");
		// if문의 실행문장이 한 줄일 경우 {}(중괄호) 생략가능
		
		// 변수의 종류 
		// 1. 전역변수 -> 모든 영역에서 사용이 가능한 변수
		// 2. 지역변수 -> 특정 영역에서만 선언되고 사용되는 변수
		
		
	}
}
