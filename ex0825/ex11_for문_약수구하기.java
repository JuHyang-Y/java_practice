package ex0825;

import java.util.Scanner;

public class ex11_for문_약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 약수 구하기
		// 입력받은 정수의 약수를 구하기!
		// 1. 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 2. 입력받은 숫자 num를 임의의 숫자(1~num)로 나누었을 때
		// 나머지가 0이라면 약수! -> 출력!
		for(int i = 1; i <= num; i++) {
			if(num%i==0){
				// i가 num의 약수인 상태!
				System.out.print(i + " ");
			}
		}
		
		
		

	}

}
