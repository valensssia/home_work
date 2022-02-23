package input_output;

import java.util.Scanner;
public class chyslo_desyatkiv {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((n /10) % 10);
	}
}


