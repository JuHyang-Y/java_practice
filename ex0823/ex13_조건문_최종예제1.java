package ex0823;

import java.util.Scanner;

public class ex13_조건문_최종예제1 {
	public static void main(String[] args) {
		System.out.println("금액을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int menu = sc.nextInt();
		
		// 내가 작성한 코드
		// if문
		int ch = 0;
		if(menu==1) {
			ch = money - 700;
			if(ch<0)
				System.out.println("돈이 부족해요ㅠㅠ");
		}else if(menu==2) {
			ch = money - 1000;
			if(ch<0)
				System.out.println("돈이 부족해요ㅠㅠ");
		}else if(menu==3) {
			ch = money - 500;
			if(ch<0)
				System.out.println("돈이 부족해요ㅠㅠ");
		}else {
			System.out.println("잘못된 번호입니다.");
		}
		
		if((menu == 1 || menu == 2 || menu == 3) && ch >=0) {
			System.out.println("잔돈 : "+ ch + "원");
		}else {
			System.out.println("잔돈 : "+ money + "원");
		}

		
		// switch문
		int price1 = 700;
		int price2 = 1000;
		int price3 = 500;
		
		int result = 0;
		
		switch(menu) {
		case 1: // 700원
			result = money - price1;
			if(result<0)
				System.out.println("돈이 부족해요ㅠㅠ");
			break;
		case 2: // 1000원
			result = money - price2;
			if(result<0)
				System.out.println("돈이 부족해요ㅠㅠ");
			break;
		case 3: // 500원
			result = money - price3;
			if(result<0)
				System.out.println("돈이 부족해요ㅠㅠ");
			break;
		default : // 없는 메뉴를 선택했을 경우!
			System.out.println("잘못된 선택입니다!");
			break;
		}// switch문 끝난분
		if((menu == 1 || menu == 2 || menu == 3) && ch >=0) {
			System.out.println("잔돈 : "+ ch + "원");
		}else {
			System.out.println("잔돈 : "+ money + "원");
		}
		
		
		// 실습코드			
		// 어떤 case 에서든 잔돈에 대한 결과를 담을 수 있는 전역변수!
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
		}else {
			System.out.println("돈이 부족해요ㅠㅠ");
			System.out.println("잔돈 : "+ (money) + "원");
		}
	}
}
