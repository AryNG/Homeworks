package practicasejercicios;
import java.util.Scanner;
public class TabladeMultiplicar1 {

	public static void main(String[] args) {
		int n=0;
		int d=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("inicio:");
		n = input.nextInt();
		System.out.println("Dos");
		d = input.nextInt();
		
		System.out.println(n+"x1" + "uno");
		System.out.println(n+"x2");
		System.out.println(n+"x3");
		System.out.println(n+"x4");
		System.out.println(n+"x5");
		System.out.println(n+"x6");
		System.out.println(n+"x7");
		System.out.println(n+"x8");
		System.out.println(n+"x9");
		System.out.println(n+"x10");
		
		while (n<d) {
		n++;
		System.out.println(n+"x1" + "uno");
		System.out.println(n+"x2");
		System.out.println(n+"x3");
		System.out.println(n+"x4");
		System.out.println(n+"x5");
		System.out.println(n+"x6");
		System.out.println(n+"x7");
		System.out.println(n+"x8");
		System.out.println(n+"x9");
		System.out.println(n+"x10");
		}
	    input.close();
	}
}
