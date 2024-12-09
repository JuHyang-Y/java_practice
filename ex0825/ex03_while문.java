package ex0825;

import java.util.Scanner;

public class ex03_while문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int sum = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			sum += num;
			
			System.out.println("누적결과 : " + sum);
			if(num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		// 다르게 풀어보기 
		int t = 0;
		sum  = 0;
		while(t != -1) {
			System.out.print("정수 입력 : ");
			t = sc.nextInt();
			sum += t;
			
			System.out.println("누적결과 : " + sum);
		}
		System.out.println("종료되었습니다.");
		
		// 실습 코드
		// 반복문 진행시 값을 유지하여 사용할 수 있는 변수
		int total = 0;
		// 1. while문 구조 만들기
		while(true) {
			
			// 2. 숫자 입력하기
			// - -1이 입력됐는지 안됐는지 판단
			System.out.println("정수 입력 : ");
			int num1 = sc.nextInt();
			
			// 3. 누적하기
			total = total + num1;
			System.out.println("누적결과 : " + total);
			
			if(num1==-1) {
				break;
			}
		}
		System.out.println("종료되었습니다!");
		
		// 실습 코드2
		// 반복문 진행시 값을 유지하여 사용할 수 있는 변수
		int total2 = 0;
		int num2 = 0;
		// 1. while문 구조 만들기
		// 반복의 조건! 입력값이 -1과 같지 않을 때에는 반복!
		while(num2 != -1 ) {
			
			// 2. 숫자 입력하기
			// - -1이 입력됐는지 안됐는지 판단
			System.out.println("정수 입력 : ");
			num2 = sc.nextInt();
			
			// 3. 누적하기
			total2 = total2 + num2;
			System.out.println("누적결과 : " + total2);
			
			if(num2==-1) {
				break;
			}
		}
		System.out.println("종료되었습니다!");
	}
}
