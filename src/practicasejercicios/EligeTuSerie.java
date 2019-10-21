package practicasejercicios;
import java.util.Scanner;
public class EligeTuSerie {

	public static void main(String[] args) {
		// Valor inicial, valor final, incremento
     byte Inicio=0;
     byte Final=0;
     byte Inc=0;
 
      Scanner input= new Scanner(System.in);
      System.out.println("Inicio:");
      Inicio = input.nextByte();
      System.out.println("Final:");
      Final = input.nextByte();      
      System.out.println("Incremento:");
      Inc = input.nextByte();
     
      
      while (Inicio<Final) {
    	  Inicio+=Inc;
    	  System.out.println("Resultado con el incremento: "+ Inicio);
     }
      input.close();
	}

}

