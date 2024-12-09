package ex0825;

import java.util.Scanner;

public class ex10_for문_구구단 {
	public static void main(String[] args) {
		// 구구단 만들기
		for(int i=2;i<=9;i++) {
			System.out.println(i + "단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		// 사용자가 출력하고 싶은 단을 입력받아 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*" + i + "=" +(dan*i));
			
		}
	}
}
