package practicasejercicios;

public class Cuentas5en5 {

	public static void main(String[] args) {
	int numero=0;
	while (numero<500) {
		numero+=5;
		System.out.println("Serie 5 en 5: "+numero);
	}
	numero=505;
	System.out.println("\n");
	while (numero>0) {
	numero-=5;
	System.out.println("Y en reversa: "+numero);
	}
	}
}
