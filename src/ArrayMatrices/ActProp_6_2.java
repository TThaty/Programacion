package ArrayMatrices;
/*Nombre: Thanya jecrois
 * Fecha: 18/01/2025
 * DAM 1º
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ActProp_6_2 {
		
	public static void mostrarListaAct2 (ArrayList<Integer> numeros) {
		Integer sumatorio = 0;
		
		for (int i = numeros.size() - 1; i >= 0; i--) {
			System.out.println("numero " + (i+1) + ": " + numeros.get(i));
			sumatorio = numeros.get(i) + sumatorio;
		} 
		
		System.out.println("La suma total es: " + sumatorio);
	}
}
