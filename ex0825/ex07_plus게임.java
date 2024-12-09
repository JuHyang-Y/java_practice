package ex0825;

import java.util.Random;
import java.util.Scanner;

public class ex07_plus게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. num1과 num2에 랜덤수 생성하기
		// - 1~10 사이의 랜덤수
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		String play = "";
		
		// 반복의 시작점!
//		while(true){
		while(!play.equals("N")){ // while(!play.equals("N") && !play.equals("n"))
			int num1 = rd.nextInt(10)+1; // 1~10까지 10개의 숫자
			int num2 = rd.nextInt(10)+1;
			
			
			// 2. 만들어진 랜덤수 출력하기!
			// -ex) " 3 + 7 = "
			System.out.print(num1 + " + " + num2 + " = ");
			
			// 3. 사용자가 정답을 입력할 수 있도록 한다!
			int result = sc.nextInt();
			
			// 4. 출제된 문제와 정답이 맞는지 판단한다!
			// -정답 Success 출력
			// -실패 Fail 출력
			if(num1+num2 == result) {
				System.out.println("Success");
			}else {
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? >> ");
//				String play = sc.next(); // 문자를 입력 받는 기능
				play = sc.next();
				
				// 게임 진행에 대한 판단을 연결
				// N과 play가 같다면
//				if(play.equals("N")) { // 문자의 값이 같은지 판단하는 방법
////				if(!"N".equals(play))로도 쓸 수 있다.
//					//  "문자".equals(변수) -> "문자"와 변수의 값이 같다
//					// !"문자".equals(변수) -> "문자"와 변수의 값이 다르다
//					System.out.println("종료하겠습니다.");
//					break;
//				}
			}
			
		}// 반복의 종료점

	}

}
