package practicasejercicios;
import java.util.Scanner;
public class TabladeMultiplicar1 {

	public static void main(String[] args) {
		int n=0;
		int d=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("inicio:");
		n = input.nextInt();
		System.out.println("Final:");
		d = input.nextInt();
	
		System.out.println(n+"x1: "+n*1);
		System.out.println(n+"x2: "+n*2);
		System.out.println(n+"x3: "+n*3);
		System.out.println(n+"x4: "+n*4);
		System.out.println(n+"x5: "+n*5);
		System.out.println(n+"x6: "+n*6);
		System.out.println(n+"x7: "+n*7);
		System.out.println(n+"x8: "+n*8);
		System.out.println(n+"x9: "+n*9);
		System.out.println(n+"x10: "+n*10);
		
		while (n<d) {
			System.out.println("\n");
		n++;
		System.out.println(n+"x1: "+n*1);
		System.out.println(n+"x2: "+n*2);
		System.out.println(n+"x3: "+n*3);
		System.out.println(n+"x4: "+n*4);
		System.out.println(n+"x5: "+n*5);
		System.out.println(n+"x6: "+n*6);
		System.out.println(n+"x7: "+n*7);
		System.out.println(n+"x8: "+n*8);
		System.out.println(n+"x9: "+n*9);
		System.out.println(n+"x10: "+n*10);
		}
	    input.close();
	}
}
