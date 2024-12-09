package ex0825;

import java.util.Scanner;

public class pythontojava { // python으로 작성했던 코드 java로 바꿔서 작성해보기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// money가 10000이상이면 택시를 탄다
		// switch
		int money = 9000;
		switch(money/10000) {
		case(0):
			System.out.println("택시를 안탄다");
			break;
		default:
			System.out.println("택시를 탄다.");
			break;
		}
		
		// num을 입력받고 3과 5의 배수인지 판단
		System.out.print("정수입력 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num%15) {
		case(0) : 
			System.out.println("3과 5의 배수입니다.");
			break;
		default : 
			System.out.println("3과 5의 배수가 아닙니다.");
			break;
		}
		
		
		// 대박 마스크 2종류
		System.out.print("마스크 개수 입력 >> ");
		int mask = sc.nextInt();
		int e_w = 0;
		int f_w = 0;
		
		switch(mask/8) {
		case 0 :
			f_w = mask/5;
			
			if(mask%5!=0) {
				f_w += 1;
			}
			break;
			
		default : 
			e_w = mask/8;
			f_w = mask%8/5;
			
			if(mask%8%5 !=0) {
				f_w += 1;
			}
			break;
		}
		System.out.println("8개들이 포장지 개수 : " + e_w);
		System.out.println("5개들이 포장지 개수 : " + f_w);
		
		
	}

}
