package practicasejercicios;
import java.util.Random;
public class PromedioVector {
	public static void main(String[] args) {
		final int array=100;
		byte number=0;
		int total=0;
		int promedio=0;
		
		byte[]myArray= new byte [array];
		Random randomNumber= new Random(System.nanoTime());
		
		for (int i=0; i<myArray.length; i++) {
			number= (byte)( randomNumber.nextInt(50)+51);
			//System.out.println(number);
			myArray[i]= number;
			//System.out.println(number);
			
		}
		for (int i=0; i<number;i++) {
			total = total + number;
			promedio = total / 100;
		}
		System.out.println(promedio);
}
}