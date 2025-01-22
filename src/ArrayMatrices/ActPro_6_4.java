package ArrayMatrices;

import java.util.ArrayList;

/*Nombre: Thanya jecrois
 * Fecha: 18/01/2025
 * DAM 1º
 */
public class ActPro_6_4 {

	public void contarPalabrasDiferentes (String texto) {
		
		texto = texto.toLowerCase();
		String [] palabras = texto.split("[\\s,\\.]+");
		//el split me sepra un string con los caracteres que le digamos en posiciones de array
		
		ArrayList<String> palabrasEncontradas = new ArrayList<>();
		
		for (int i = 0; i < palabras.length; i++) {
			if (!palabrasEncontradas.contains(palabras[i])) { 
				palabrasEncontradas.add(palabras[i]);
				//contains nos devuelve un treu si esta la palbra en el array 
				//o un false si no esta
			}
		}
		
		System.out.println("el numero de palbras deferentes es: " + palabrasEncontradas.size());
		System.out.println("Lista de palabras: ");
		for (int i = 0; i < palabrasEncontradas.size(); i++) {
			System.out.println(palabrasEncontradas.get(i));
		}
		
		/*for (int i = 0; i < palabras.length; i++) {
			if (palabrasEncontradas.contains(palabras[i])) { 
				System.out.println("ya lo contiene");
				
				//contains nos devuelve un treu si esta la palbra en el array 
				//o un false si no esta 
			}
			else {
				palabrasEncontradas.add(palabras[i]);
			}
		}*/
	}
}
