package ex0823;

import java.util.Scanner;

public class ex09_elseif문예제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		// 90점 이상 -> A학점
		// 80점 이상 ~ 90점 미만 -> B학점
		// 70점 이상 ~ 80점 미만 -> C학점
		// 70점 미만 -> D학점
		
		// 1번째 방법
		if(totalScore >= 90) {
			System.out.println("A학점입니다.");
		}else if(80<=totalScore && totalScore < 90) {
			System.out.println("B학점입니다.");
		}else if(70<=totalScore && totalScore < 80) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("D학점입니다.");
		}
		
		// 2번째 방법
		String score = null; //"" 또는 null 을 사용하면 된다. // 한글자는 String 대신 char 를 사용해도 된다.
		if(totalScore >= 90) {
			score = "A";
		}else if(80<=totalScore) {
//			80<=totalScore && totalScore < 90, 범위가 같기 때문에 and 연산을 넣지 않아도 된다.
			score = "B";
		}else if(70<=totalScore) {
			score = "C";
		}else {
			score = "D";
		}
		System.out.println(score + "학점입니다!");

		// 3번째 방법
		String grade = null; //"" 또는 null 을 사용하면 된다. // 한글자는 String 대신 char 를 사용해도 된다.
		if(totalScore >= 90) {
			grade = "A";
		}else if(80<=totalScore && totalScore < 90) {
			grade = "B";
		}else if(70<=totalScore && totalScore < 80) {
			grade = "C";
		}else if(totalScore < 70) {
			grade = "D";
		}else {
			System.out.println("잘못된 학점입니다.");
		}
		
		if(grade != null)
		System.out.println(grade + "학점입니다!");
  }
}