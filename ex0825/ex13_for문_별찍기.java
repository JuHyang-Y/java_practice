package ex0825;

public class ex13_for문_별찍기 {

	public static void main(String[] args) {
//		// 별찍기
//		for(int i=0;i<1;i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0;i<2;i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0;i<3;i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0;i<4;i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0;i<5;i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		
		// 별찍기2
		for(int j=0;j<=5;j++) {
			for(int i = 0;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		// 별찍기 뒤집어서
		for(int j=5;j>=0;j--) {
			for(int i=0;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		//     *
		//    **
		//   ***
		//  ****
		// *****
		// 이중 for문 공포의 별찍기
		for(int j=0;j<5;j++) {
			for(int i=0;i<4-j;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<1+j;i++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
//		for(int i=3; i<=0;i--) {
//			System.out.print(" ");
//		}
//		for(int j=2;j>=5;j++) {
//			System.out.print("*");
//		}
		
		
	}
}
