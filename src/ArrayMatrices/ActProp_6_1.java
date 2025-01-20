package ArrayMatrices;
/*Nombre: Thanya jecrois
 * Fecha: 18/01/2025
 * DAM 1º
 */
import java.util.ArrayList;
/*Nombre: Thanya jecrois
 * Fecha: 18/01/2025
 * DAM 1º
 */
import java.util.Random;
import java.util.Scanner;

public class ActProp_6_1 {
	
	public static ArrayList<Integer> generarNumerosAleatorios() {
		Random random = new Random();
		
		ArrayList<Integer> numerosAleatorios = new ArrayList();
		for (int i = 0; i < 100; i++) {
			numerosAleatorios.add(random.nextInt(1000));
		}
		return numerosAleatorios;
	}
	
	public static void mostrarNumerosAleatorios (ArrayList<Integer> numerosAleatorios) {
		
		for (int i = 0; i < numerosAleatorios.size(); i++) {
			System.out.println("numero " + (i+1) + ": " + numerosAleatorios.get(i) );
		}
	}

}
