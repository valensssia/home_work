package input_output;

import java.util.Scanner;

public class chyslo_desyatkiv_dv {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println((n % 100) / 10);

    }
}


