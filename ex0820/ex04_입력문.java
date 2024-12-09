package ex0820;

import java.util.Scanner;

public class ex04_입력문 {
	public static void main(String[] args) {
		//import 단축키 : ctrl+shift+'o'
		// System에 대해서 in '입력' 하겠다 기능을 불러오기
		Scanner sc = new Scanner(System.in); 
		
		//ln(개행) : enter의 의미로 아래로 내려가는 명령어
		System.out.print("정수입력 : ");
		// sc에 어떤 데이터를 입력받을지 입력해야함
		int input = sc.nextInt();
		
//		System.out.println(input); 
		// 123을 입력 받으면 1, 23으로 나누기
		
		// 1. 입력된 값으로 부터 백의자리 수 구하기
		int num1 = input/100; // 1
		// 2. 입력된 값으로 부터 백의자리 수 이하 버리기(빼기)
		int num2 = input%100; // 23
		// 3. 결과값 출력하기
		System.out.println("결과 값 : " + (num1 * 100));
		System.out.println("결과 값 : " + (input - num2));
		System.out.println("결과 값 : " + num1 + "00");
		
	}
}
