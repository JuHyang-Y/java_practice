package ex0903;

import java.util.Arrays;

public class ex01이차원배열 {

	public static void main(String[] args) {
		// 이차원 배열 : 1차원 배열 안에 또 다른 배열이 있는 형태
		// int[][]  array = new int[3][3];
		// int(배열타입)[][](이차원 배열 선언)array(배열에 대한 레퍼런스 변수) = new(배열 생성)int(선언한 배열 타입과 동일)[3][3](배열크기 행, 열)
		
		// 1. 이차원배열 선언!
		int[][] array = new int[2][3];
		
		// 2. 이차원배열 데이터 추가!
		// 0 -> 0, 1, 2
		// 1 -> 0, 1, 2
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		
		array[1][0] = 4;
		array[1][1] = 5;
		array[1][2] = 6;
		
		// 3. 이차원배열 출력!
		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		System.out.println(array[0][2]);
		
		System.out.println(array[1][0]);
		System.out.println(array[1][1]);
		System.out.println(array[1][2]);
		
		// 3. 이차원배열 출력!
		for(int j = 0;j<2;j++) {
			for(int i=0;i<3;i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		
		for(int j = 0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println(array.length);
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		
		
	}

}
