package ex0825;

public class ex09_for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문 을 사용하여 96에서 73까지 감소를 출력하세요.
		for(int i=96; i>=73;i--) {
			System.out.print(i + " ");
		}
		System.out.println(); // 개행
	
		// 숫자들 중 홀수만 출력하세요
		for(int i=95;i>=73;i-=2) {
			System.out.print(i + " ");
		}
		
		// 실습코드
		//  2. 숫자들 중 홀수만 출력하기
		for(int i=95;i>=73;i--) {
			// 홀수인지 아닌지 판단하기
			if(i%2 == 1) { 
				System.out.print(i + " ");
			}
		}
	}

}
