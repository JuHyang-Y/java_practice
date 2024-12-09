package ex0823;

import java.util.Scanner;

public class ex11_switch문예제 {

	public static void main(String[] args) {
		// 1.월 입력 받기
		System.out.print("월 입력 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		// 2. 몇월인지 판단(switch)하여 계절에 대한 결과 출력!
		//내가 짠 코드
		switch(month/3){
			//switch(연산식or값)
			// 1(봄), 2(여름), 3(가을), 나머지 - > 겨울
			case 4 : 
				System.out.println(month + "월은 겨울입니다!");
				break;
			case 0 : 
				System.out.println(month + "월은 겨울입니다!");
				break;
			case 1 : 
				System.out.println(month + "월은 봄입니다!");
				break;
			case 2 : 
				System.out.println(month + "월은 여름입니다!");
				break;
			case 3 : 
				System.out.println(month + "월은 가을입니다!");
				break;
		}
		// 실습 코드
		switch(month/3){
			case 1 : 
				System.out.println(month + "월은 봄입니다!");
				break;
			case 2 : 
				System.out.println(month + "월은 여름입니다!");
				break;
			case 3 : 
				System.out.println(month + "월은 가을입니다!");
				break;
			default : 
				System.out.println(month + "월은 겨울입니다!");
				break;// default의 break는 생략 가능!
		} //switch문 종료
		
		// 실습 코드(같이 포함시키게 작성할 수 있음)
		switch(month){
		// case의 값은 하나만 들어가거나 연달아 여러개의 값이 들어갈 수 있다!
		case 3,4,5: 
			System.out.println(month + "월은 봄입니다!");
			break;
		case 6,7,8 : 
			System.out.println(month + "월은 여름입니다!");
			break;
		case 9,10,11 : 
			System.out.println(month + "월은 가을입니다!");
			break;
		default : 
			System.out.println(month + "월은 겨울입니다!");
			break;// default의 break는 생략 가능!
		} //switch문 종료

		// 공통부분 묶어보기
		String season = null;
		switch(month/3){
		case 1 : 
//			System.out.println(month + "월은 봄입니다!");
			season = "봄";
			break;
		case 2 : 
//			System.out.println(month + "월은 여름입니다!");
			season = "여름";
			break;
		case 3 : 
//			System.out.println(month + "월은 가을입니다!");
			season = "가을";
			break;
		default : 
//			System.out.println(month + "월은 겨울입니다!");
			season = "겨울";
			break;// default의 break는 생략 가능!
		} //switch문 종료
		System.out.println(month + "월은 " + season + "입니다!");
	}
}
