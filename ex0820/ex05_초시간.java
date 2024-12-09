package ex0820;

import java.util.Scanner;

public class ex05_초시간 {

	public static void main(String[] args) {
		// 초를 입력받아 [시, 분, 초]형태로 출력
		// 1. "초 입력 : " 문구 출력!
		System.out.print("초 입력 : ");
		// 2. 초를 입력받을 수 있는 구조 만들기!
		Scanner sc = new Scanner(System.in);
		int totalSecond = sc.nextInt();
		
		// 3. 입력받은 초에 대한 시간, 분, 초 구하여 출력!
		int hour = totalSecond/3600; 
		int mins = totalSecond%3600/60;
		int seconds = totalSecond%3600%60;
		int s = totalSecond%60;//계속 나머지로 나눌 것이라면 -> 3600도 60의 배수이기 때문
		System.out.println( hour + "시" + mins + "분" + seconds + "초");
		System.out.println(s);
	}

}
