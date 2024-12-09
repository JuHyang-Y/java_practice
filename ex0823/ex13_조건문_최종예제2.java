package ex0823;

import java.util.Scanner;

public class ex13_조건문_최종예제2 {
	public static void main(String[] args) {
		System.out.println("금액을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int menu = sc.nextInt();
		
		// 내가 작성한 코드
		// switch문
		int price1 = 700;
		int price2 = 1000;
		int price3 = 500;
		
		
		// 내가 짠 코드		
		int total = 0;
		
		switch(menu) {
		case 1: // 700원
			total = money - price1;
			
//					//지역 안에만 쓰는 방법
//					if(money >= price1) {
//						System.out.println("잔돈 : "+ (total) + "원");
//					}else {
//						System.out.println("돈이 부족해요ㅠㅠ");
//						System.out.println("잔돈 : "+ (money) + "원");
//					}
			
			break;
		case 2: // 1000원
			total = money - price2;
			break;
		case 3: // 500원
			total = money - price3;
			break;
		default : // 없는 메뉴를 선택했을 경우!
			System.out.println("잘못된 선택입니다!");
			break;
		}// switch문 끝난분
		
		// 어떤 메뉴를 선택하더라도 공통적으로 잔돈에 대한 작업 처리하기!
		if(total >= 0) {
			System.out.println("잔돈 : "+ (total) + "원");
			System.out.print("천원 : " + (total/1000) + "개, ");
			System.out.print("오백원 : " + (total%1000/500) + "개, ") ;
			System.out.println("백원 : " + (total%1000%500/100)+ "개");
		}else {
			System.out.println("돈이 부족해요ㅠㅠ");
			System.out.println("잔돈 : "+ (money) + "원");
		}
		
		
		// 실습코드			
		// 어떤 case 에서든 잔돈에 대한 결과를 담을 수 있는 전역변수!		
		switch(menu) {
		case 1: // 700원
			total = money - price1;
			
//					//지역 안에만 쓰는 방법
//					if(money >= price1) {
//						System.out.println("잔돈 : "+ (total) + "원");
//					}else {
//						System.out.println("돈이 부족해요ㅠㅠ");
//						System.out.println("잔돈 : "+ (money) + "원");
//					}
			
			break;
		case 2: // 1000원
			total = money - price2;
			break;
		case 3: // 500원
			total = money - price3;
			break;
		default : // 없는 메뉴를 선택했을 경우!
			System.out.println("잘못된 선택입니다!");
			break;
		}// switch문 끝난분
		
		// 어떤 메뉴를 선택하더라도 공통적으로 잔돈에 대한 작업 처리하기!
		if(total >= 0) {
			System.out.println("잔돈 : "+ (total) + "원");
		}else {
			// 출력문 'total'로 맞추기
			total = money;
			
			System.out.println("돈이 부족해요ㅠㅠ");
			System.out.println("잔돈 : "+ (total) + "원");
		}
		
		// 잔돈에 대한 갯수를 알려주는 작업 처리하기!
		int c = total/1000;
		int o = total%1000/500;
		int b = total%1000%500/100;
		
		System.out.print("천원 : " + (c) + "개, ");
		System.out.print("오백원 : " + (o) + "개, ");
		System.out.print("백원 : " + (b) + "개");
	}
}
