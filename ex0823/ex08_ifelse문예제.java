package ex0823;

import java.util.Scanner;

public class ex08_ifelse문예제 {

	public static void main(String[] args) {
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		Scanner sc = new Scanner(System.in);
		// 1. 나이 입력 받기
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 2. 인원수 입력받기
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();
		int fee = 5000;
		
		// 3. 20세 미만인지 판단하기!
		// - 미만일 경우 인원수 * 5,000원 * 0.5(50% 할인률)
		// - 초과일 경우 인원수 * 5,000원
		// 4. 결과 (총 금액) 출력
		if(age<20) {
			fee = (int)(num * fee * 0.5);
			System.out.println("총" + fee + "원입니다.");
		}else {
			fee = num * fee;
			System.out.println("총" + fee + "원입니다.");
		}
		
		// if-else문 모든 영역에서 쓸 수 있는
		// 전역변수 선언하기!
	
		int result = 0;
		
		if(age>=20) {
			//인원수 * 5,000
			//result가 지역변수이기 때문에 전역변수로 바꾸어 주어야 한다.
			result = num * 5000;
		}else {
			// 인원수 * 5,000 * 0.5
			result = (int)(num * 5000*0.5);
			// 인원수 * 2,500
			result = num * 2500;
		}
		// if-else 문이 공통(전역)으로 사용가능한 위치!
		System.out.println("총"+result+"원입니다.");
	}

}
