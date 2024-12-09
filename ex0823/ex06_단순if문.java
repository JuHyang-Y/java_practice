package ex0823;

import java.util.Scanner;

public class ex06_단순if문 {
	public static void main(String[] args) {
		// 1. int형 타입의 변수 num에 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 2. 입력받은 수가 3과 5의 배수인지 판단하기
		// - 배수를 구할 수 있는 방법 생각해보기!
		//  ex) 3의 배수 -> 3, 6, 9, 12 ... 의 공통점은?
		// - 3이면서 5의 배수 -> ~ 이면서의 연산자 and
		
		if(num%3 == 0 && num%5 == 0) {
			// 3. 2번의 판단시 조건에 대한 결과가 true 일 경우
			// "3과 5의 배수입니다" 출력!
			System.out.println("3과 5의 배수입니다");
		}
	}
}
