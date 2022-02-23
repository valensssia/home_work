package input_output;

import java.util.Scanner;

public class suma_cyfr {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println((n % 10) + (n % 100 / 10) + (n % 1000 / 100));

    }
}


