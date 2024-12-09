package ex0820;

public class ex03_산술연산자 {

	public static void main(String[] args) {
		
		// 1. num1이라는 공간에 정수형 10 대입하기
		int num1 = 10;
		// 2. num2라는 공간에 정수형 7 대입하기
		int num2 = 7;
		// 3. num1에서 num2를 나눈 몫의 결과를 출력하기
		System.out.println(num1/num2);
		// 4. num1에서 num2를 나눈 나머지의 결과를 출력하기
		System.out.println(num1%num2);
		
		// 문자랑 숫자 연산하기
		int num3 = 10;
		String num4 = "12";
		
		System.out.println(num3+num4);
		// 연산 결과의 타입을 판단!
		// 정수 + 정수 -> 정수
		// 실수 + 실수 -> 실수
		// 정수 + 실수 -> 실수
		// 문자 + 문자 -> 문자
		// 문자 + 정수/실수 -> 문자
		
		String a = 10 + 7 + "1";
		String b = 8 + "1" + 2;
		String c = "1" + 5 + 2;
		
		//코드 빠르게 한줄 목사 : ctrl + alt + 방향키(위/아래)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//삭제 단축키  : ctrl + 'D'
		
	}

}
