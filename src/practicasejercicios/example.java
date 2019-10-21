package practicasejercicios;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		int n=0;
		int d=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("inicio:");
		n = input.nextInt();
		System.out.println("Final:");
		d = input.nextInt();
		
		while (n<=d) {
			for (int i=1; i<11; i++) {
			System.out.println(n+"*"+i+":"+n*i);

			}
			n++;
		}
		input.close();
	}
}
