package ex0825;

import java.util.Random;
import java.util.Scanner;

public class ex06_랜덤수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1. 랜덤 기능 불러오기!
		Random rd = new Random();
		
		//2. 랜덤 기능으로 어떤 수를 불러올건지 지정!
		// - nextInt(랜덤수 갯수)
		// - 랜덤수 갯수 : 0 ~
//		int num = rd.nextInt(3); // 0, 1 ,2
		int num = rd.nextInt(5)+1; // 0(1), 1(2) ,2(3), 3(4), 4(5)
		int num2 = rd.nextInt(10)+1;
		
		
		//3. 랜덤값 출력!
		System.out.println(num);
		System.out.println(num2);
	}

}
