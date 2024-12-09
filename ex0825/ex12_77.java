package ex0825;

public class ex12_77 {

	public static void main(String[] args) {
		int total = 0;
		int num = 1;
		for(int i = 77; i>=1; i--) {
			total += (i*num);
			num++;
		}
		System.out.println("결과값 : " + total);
	}

}
