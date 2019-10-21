package practicasejercicios;

import java.util.Scanner;

public class TabladeMultiplicar2 {

	public static void main(String[] args) {
		//Código que muestra la tabla de multiplicar seleccionada por un usuario del 1 al 10
		byte n=0;
		char An='y';
		System.out.println("¿Qué tabla quieres ver?:");
		Scanner input = new Scanner(System.in);
		n=input.nextByte();
		
		System.out.println(n+"x1: "+ n*1);
		System.out.println(n+"x2: "+ n*2);
		System.out.println(n+"x3: "+ n*3);
		System.out.println(n+"x4: "+ n*4);
		System.out.println(n+"x5: "+ n*5);
		System.out.println(n+"x6: "+ n*6);
		System.out.println(n+"x7: "+ n*7);
		System.out.println(n+"x8: "+ n*8);
		System.out.println(n+"x9: "+ n*9);
		System.out.println(n+"x10: "+ n*10);
input.close();
	}
}
