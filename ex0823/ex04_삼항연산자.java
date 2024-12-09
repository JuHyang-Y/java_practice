package ex0823;

import java.util.Scanner;

public class ex04_삼항연산자 {

	public static void main(String[] args) {
		// 농구공을 담기 위해 필요한 상자의 개수
		// 1. 농구공의 갯수 입력받기
		System.out.print("농구공의 개수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2. 5개씩 1개의 박스에 담기 ->  삼항연산자 활용!
		int result  = num % 5 == 0 ? num / 5 : num / 5 + 1;
		
		// 3. 총 몇개의 박스가 필요한지 확인!
		System.out.println("필요한 상자의 수 : " + (num%5==0?num/5:num/5+1));
		System.out.println("필요한 상자의 수 : " + result);
	}

}
