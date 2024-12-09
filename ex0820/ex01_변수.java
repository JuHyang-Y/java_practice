package ex0820;

public class ex01_변수 {

	public static void main(String[] args) {
		//1. 변수 선언(저장/생성)하기
		// int -> Integer(정수)
		int a = 3;
		
		System.out.println(a);
		
		// a 공간에 있는 데이터 값 변경하기!
		a = 7;
		
		//저장된 a변수의 값 가져오기! -> 출력하기	
		//syso -> ctrl+space
		System.out.println(a);
		
		//런타임 실행하기 ctrl+F11

		final int b = 4;
		
		// 상수로 선언된 변수는 절대 값을 변경할 수 없다!
//		b = 10;
		System.out.println(b);
		
		int wishList = 1; // 카멜 기법
		int wish_List; // 스네이크 기법
		int wishInt; // 헝가리언 기법
		int WishList; // 파스칼 기법
		
		System.out.println(wishList);

	
	} // main() 종료 위치
}// class 종료 위치