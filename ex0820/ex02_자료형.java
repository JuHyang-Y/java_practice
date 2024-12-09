package ex0820;

public class ex02_자료형 {
	//main 단축기 main ctrl+space
	public static void main(String[] args) {
		// 정수형 자료형 사용하기 
		byte a = 112;
		short b = 1128;
		// 자동형 변환
		int c = a;
//		int c = 112845642; // 정수형의 대표 자료형!
		long d = 1128456426;
		
		// 실수형 자료형 사용하기
		float e = 3.14f; // 4byte
		double f = 3.14; // 8byte 실수형의 대표 자료형!
		
		c = (int)f; // 명시적 형 변환
		System.out.println(c);
		
		// 논리형 자료형 사용하기 -> true, false
		boolean a1 = true;
		boolean a2 = false;
		
		// 문자형 자료형 사용하기
		char b1 = 'a';
		
		// 여러개의 문자를 담을 수 있는 String은
		// 참조형 데이터 타입이다!
		String b2 = "abc";  // 문자열은 큰 따옴표 String을 ctrl 누르고 보기
		
	}

}
