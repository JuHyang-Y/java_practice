package ex0825;

import java.util.Scanner;

public class ex02_10보다작은수 {

	// 1. 반복의 기본 구조 만들기 -> while(){}
	// 2. 반복의 구조 안에서 키보드로 숫자 입력받기
	// 3. 입력받은 수가 10보다 작은지 작지 않은지 판단!
	// - 작다면 다시 반복 진행!
	// - 크다면 반복 종료! -> false, break 활용!
	// 4. 프로그램이 끝나면 마지막에 한번! "종료 되었습니다" 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// while문의 조건을 담을 수 있는 변수 선언!
		boolean result = true;
		
		while(result) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num>10) {
//				System.out.println("종료되었습니다."); 
//				break;
				result = false;
			}
		}// while 종료
		System.out.println("종료되었습니다."); 
		
		
		// 다른 방법
		int t  = 0;
		while(t<10) {
			System.out.print("정수 입력 : ");
			t = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
		

	}

}
