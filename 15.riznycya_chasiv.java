package input_output;

import java.util.Scanner;

public class riznycya_chasiv {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int s1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int s2 = sc.nextInt();
		int riz_h = h2 - h1;
		int riz_m = m2 - m1;
		int riz_s = s2 - s1;
		System.out.println(riz_h * 3600 + riz_m * 60 + riz_s);
	}
}


