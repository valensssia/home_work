package input_output;

import java.util.Scanner;

public class ravlyk {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((h - 2 * b + a) / (a - b));
		
	}
}


