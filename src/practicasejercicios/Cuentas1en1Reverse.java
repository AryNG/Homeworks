package practicasejercicios;

public class Cuentas1en1Reverse {

	public static void main(String[] args) {
		int numero=11; // Puede ser con el 1 o sin el por la cuestion de que inicia en 0
		while (numero>0) {
			numero--;
			System.out.println("CICLO DIEZ:  " + numero);
		}
		numero=101;
		System.out.println("\n");
		while (numero>0) {
			numero--;
			System.out.println("CICLO CIEN:  "+ numero);
		}
		numero=1001;
		System.out.println("\n");
		while (numero>0) {
			numero--;
			System.out.println("CICLO MIL:  "+numero);
		}
	}

}
