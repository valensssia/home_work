package input_output;

import java.util.Scanner;

public class obmin_znachen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a + b;
		b = b - a;
		b = -b;
		a = a - b;
		System.out.println(a + " " + b);
		}
}


