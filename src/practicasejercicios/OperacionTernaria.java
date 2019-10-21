package practicasejercicios;

import java.util.Scanner;

public class OperacionTernaria {

	public static void main(String[] args) {
		int num1=0;
		String msg="";
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("number");
		num1=input.nextInt();
	    //uso del ternario para una condicion 
		msg=(num1>5)? "yes big":"no, small";
		System.out.println(msg);

	}

}
