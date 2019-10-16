package practicasejercicios;
import java.util.Scanner;
public class PrimoNoPrimo {

	public static void main(String[] args) {
//Variables------------------------------------------------------------------------------------
		int n=0;
		boolean isPrime= true;
//Imports--------------------------------------------------------------------------------------		
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number baby:");
		n= input.nextInt();
//Process--------------------------------------------------------------------------------------
		for (int i=2; i<n; i++) {
			if(n % i==0) { 
			isPrime= false;	
			break;
			}
		}
//PRINTS---------------------------------------------------------------------------------------
		//System.out.println(isPrime+"<--real");
		if (isPrime==true) {
			System.out.print("Is Prime");
		}
		else {
			System.out.println("It's not Prime");
		}
		input.close();
		}
	}
//NOTES AND SUCH-------------------------------------------------------------------------------
/*i se pone a 2 para poder dividir n/2, se pone que si el % es = a 0 entonces el numero no es
 * primo, tiene que ser 1 para ser considerado primo lol, entonces si el prime es set a false
 * entonces no es primo. En el print si es == a true se muestra primo, de lo contrario se 
 * muestra false -> no es primo. */
