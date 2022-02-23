package input_output;

import java.util.Scanner;

public class podil_yabluk_3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(n - (k % n));
	}
}


