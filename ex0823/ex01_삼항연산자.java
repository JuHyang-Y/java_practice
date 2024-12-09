package ex0823;

public class ex01_삼항연산자 {
	public static void main(String[] args) {
		//삼항연산자 구조
		//조건식 ? 참 : 거짓 
		
		int num1 = 3;
		int num2 = 10;
		
//		String result = num1 == num2 ? "같다" : "다르다" ;
		int result = num1 == num2 ? 1 : 0 ;
		// ""를 사용할 수 있는 것은 String
		
		// 삼항연산자는 참/거짓에 다라 똑같은 타입을 담아야 하므로
		// 결과를 담을 수 있는 변수의 타입, 참/거짓의 타입이 모두 같아야 한다!
		
		System.out.println(result);
	}
}
