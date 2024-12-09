package ex0825;

import java.util.Scanner;

public class ex04_while문 {
	// 1. 반복의 구조 만들기
	// 2. 숫자 입력 받기
	// 3. 반복문을 멈출 수 있는 조건인지 판단하기!
    // 4. 홀짝 판단하기!
	// - 짝수의 개수를 기억할 수 있는 변수 사용!
	// - 홀수의 개수를 기억할 수 있는 변수 사용!
	// 5. 홀짝의 개수에 대하여 출력하기
	// 6. 종료 문구 출력하기!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		boolean result = true;
		
		while(result) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			switch(num%2) {
			case(0):
				a += 1;
				System.out.println("짝수개수 : " + a);
				System.out.println("홀수개수 : " + b);
				break;
			case(1):
				b += 1;
				System.out.println("짝수개수 : " + a);
				System.out.println("홀수개수 : " + b);
				break;
			default :
				System.out.println("종료되었습니다.");
				result = false;
				break;
			}
		}

		int a1 = 0;
		int b1 = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			

			if(num%2==0){
				a1 += 1;
			}else if(num%2==1){
				b1 += 1;
			}else if(num == -1){
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("짝수개수 : " + a1);
			System.out.println("홀수개수 : " + b1);
		}
		
		// 실습 코드
		int a2 = 0;
		int b2 = 0;
		int num = 0;
		
		while(num != -1) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			switch(num%2) {
			case(0):
				a2 += 1;
				System.out.println("짝수개수 : " + a2);
				System.out.println("홀수개수 : " + b2);
				break;
			case(1):
				b2 += 1;
				System.out.println("짝수개수 : " + a2);
				System.out.println("홀수개수 : " + b2);
				break;
			}
		}
		System.out.println("종료되었습니다.");
		
		// 실습코드
		int num1 = 0;
		// 누적에 대한 변수 선언!
		int a3 = 0; // 짝수
		int b3 = 0; // 홀수
		
		// 1. 반복의 구조 만들기
		while(num1 !=-1) {
			// 2. 숫자 입력 받기 -> num1
			System.out.println("정수 입력 : ");
			num = sc.nextInt();
			
			// 3. 반복문을 멈출 수 있는 조건인지 판단하기!
			if(num == -1) {
				// 6. 종료 문구 출력하기!
				System.out.println("종료되었습니다.");
				break;
			}
			// 4. 홀짝 판단하기!
			// - 짝수의 개수를 기억할 수 있는 변수 사용!
			// - 홀수의 개수를 기억할 수 있는 변수 사용!
			if(num%2==0) {
				//짝수 -> a3
				a3++;
			}else {
				//홀수 -> b3
				b3++;
			}
			// 5. 홀짝의 개수에 대하여 출력하기
			System.out.println("짝수개수 : " + a3);
			System.out.println("홀수개수 : " + b3);
			
		}
		
	}

}
