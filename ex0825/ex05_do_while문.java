package ex0825;

import java.util.Scanner;

public class ex05_do_while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1. 현재(now)/목표(goal) 입력 받기
		System.out.print("현재 몸무게 : ");
		int pw = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int gw = sc.nextInt();
		// 주차를 표현할 수 있는 변수 선언
		int w = 1;
		
		do{
			// 반복이 가능한 영역!
			// 반복될 내용!
			// 2. 주차별 감량 몸무게 입력받기->"감량 몸무게 입력 : "
			System.out.print(w + "주차 감량 몸무게 입력 : ");
			int lw = sc.nextInt();
			
			// 3. 원래 몸무게 - 감량 몸무게 = ?
			pw -= lw;
			w++;
			
		}while(pw >= gw); // 2. 다이어트의 성공 여부 판단! 

		// 5. 달성한 최종 몸무게 출력!
		System.out.println(pw + "kg 달성! 축하합니다!");
	}

}
