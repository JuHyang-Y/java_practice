package ex0831;

import java.util.Scanner;

public class ex01_이중for문_별찍기 {
	public static void main(String[] args) {
		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오.
		// 1. 행 개수 입력받기
		System.out.print("행 개수 : ");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		// 몇 줄의 별을 찍을 지
		for(int j=0;j<=h;j++) { // 행의 수만큼 반복
			// 한 줄에 별을 몇 개찍을 지
			for(int i=0;i<=j;i++) { // 별의 개수
				System.out.print("*");
			}
			System.out.println();
	  }
		
		// 반대로 출력하기
		System.out.print("행 개수 : ");
		int r = sc.nextInt();
		for(int j=r;j>=0;j--) {
			for(int i=j; i>=0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
