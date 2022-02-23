package input_output;

import java.util.Scanner;

public class elektronnyi_godynnyk_1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n / 60;
		int b = n % 60;
		System.out.println((( a / 10 + "" + a % 10)+":"+(b / 10 + "" + b % 10)));
		}
}


