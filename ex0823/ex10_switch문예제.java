package ex0823;

import java.util.Scanner;

public class ex10_switch문예제 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 100 ~ 90 -> A
		// 100,99,98,97,96,...,90
		
		switch(score/10){
			case 10 :
				System.out.println("A학점 입니다!");
				break;
			case 9 : 
				System.out.println("A학점 입니다!");
				break;
			case 8 : 
				System.out.println("B학점 입니다!");
				break;
			case 7 : 
				System.out.println("C학점 입니다!");
				break; // break를 넣지 않으면 break를 만날때까지 돌아간다.
			default :
				// case에 해당하지 않는 값들을 가져올 수 있는 구역!
				System.out.println("D학점 입니다!");
				break;
		}
		
		String grade = null;
		switch(score/10){
			case 10 :
//				System.out.println("A학점 입니다!");
				grade = "A";
				break;
			case 9 : 
//				System.out.println("A학점 입니다!");
				grade = "A";
				break;
			case 8 : 
//				System.out.println("B학점 입니다!");
				grade = "B";
				break;
			case 7 : 
//				System.out.println("C학점 입니다!");
				grade = "C";
				break; // break를 넣지 않으면 break를 만날때까지 돌아간다.
			default :
				// case에 해당하지 않는 값들을 가져올 수 있는 구역!
//				System.out.println("D학점 입니다!");
				grade = "D";
				break;
			}//switch 종료 부분
		System.out.println(grade + "학점입니다!");
		
	}

}
