package ex0823;

import java.util.Scanner;

public class ex12_조건문_최종예제 {

	public static void main(String[] args) {
		// 자판기 프로그램 만들기
		// 1. 금액 입력받기 
		System.out.println("금액을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int cost = sc.nextInt();
		
		// 2. 메뉴 선택받기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int menu = sc.nextInt();
		
		// 3. 선택된 내용에 따라 잔돈 계산하기 -> 조건문
		// 내가 짠 코드
		// if 문
		int ch = 0;
		if(menu==1) {
			ch = cost - 700;
		}else if(menu==2) {
			ch = cost - 1000;
		}else if(menu==3) {
			ch = cost - 500;
		}else {
			System.out.println("잘못된 번호입니다.");
		}
		
		if(menu == 1 || menu == 2 || menu == 3)
		System.out.println("잔돈 : "+ ch + "원");
		
		//switch 문
		switch(menu) {
		case 1:
			ch = cost - 700;
			break;
		case 2:
			ch = cost - 1000;
			break;
		case 3:
			ch = cost - 500;
			break;
		default : 
			System.out.println("잘못된 번호입니다.");
			break;
		}
		if(menu == 1 || menu == 2 || menu == 3)
		System.out.println("잔돈 : "+ ch + "원");
		
		// 실습코드
		// 자판기 음료의 금액을 관리하는 변수
		// 변동하는 물가 상승률을 반영하기 위함..ㅋㅋㅋㅋㅋ
		int price1 = 700;
		int price2 = 1000;
		int price3 = 500;
		
		// 어떤 case 에서든 잔돈에 대한 결과를 담을 수 있는 전역변수!
		int result = 0;
		
		switch(menu) {
		case 1: // 700원
			// 1번째 방법
//			System.out.println("잔돈 : "+ (cost - 700) + "원");
			// 변수로 관리하기
//			System.out.println("잔돈 : "+ (cost - price1) + "원");
			result = cost - price1;
			break;
		case 2: // 1000원
			result = cost - price2;
			break;
		case 3: // 500원
			result = cost - price3;
			break;
		default : // 없는 메뉴를 선택했을 경우!
			System.out.println("잘못된 선택입니다!");
			break;
		}// switch문 끝난분
		
		System.out.println("잔돈 : "+ (result) + "원");
	}

}
