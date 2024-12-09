package ex0825;

public class ex08_for문 {

	public static void main(String[] args) {
		// 숫자 1~3 반복적으로 출력하는 구조!
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");

//		int num = 1;
//		
//		while(true) {
//			System.out.println(num);
//			num++;
//			
//			if(num > 3) {
//				break;
//			}
//		}

		for(int i = 1; i < 4;i++) {
			// i 변수는 지역변수로 for문 구조 안에서만 사용되는 변수!
			System.out.println(i);
		}
		
		// 숫자 5부터 10까지 반복된 for문 만들기
		for(int i = 5;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		
	}

}
