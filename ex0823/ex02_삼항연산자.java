package ex0823;

import java.util.Scanner;

public class ex02_삼항연산자 {

	public static void main(String[] args) {
		
		// 1. 정수 입력받기
		// - "정수를 입력하세요 : "
		// - 사용자로부터 숫자 입력받기
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		// 2. 입력받은 수가 홀/짝 판단!
		// - 홀/짝 판단 : 2로 나눈 나머지가 0 -> 짝수, 1 -> 홀수
//		String result = num1%2==0 ? "는(은) 짝수 입니다." : "는(은) 홀수 입니다.";
		String result1 = num1%2==0 ? num1 + "는(은) 짝수 입니다." : num1 + "는(은) 홀수 입니다.";
//		
//		// 3. 결과값 출력하기
//		System.out.println(num1 + "는(은)" + result + "입니다.");
//		System.out.println(num1 + result);
		System.out.println(result1);
		
		//4. 또 다른 방식 
//		System.out.println(num1 + "는(은)" + (num1==0? "짝수입니다" : "홀수입니다"));
	}

}
