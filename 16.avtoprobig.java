package input_output;

import java.util.Scanner;

public class avtoprobig {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println((m + n - 1) / n);
	}
}


