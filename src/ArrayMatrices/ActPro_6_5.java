package ArrayMatrices;

import java.util.ArrayList;
import java.util.Collections;

public class ActPro_6_5 {
	
	public static int valorMayor (ArrayList<Integer> numerosAleatorios) {
		
	
		int numeroMayor = 0; 
		
		for (int i = 0; i< numerosAleatorios.size();i++) {
			if (numerosAleatorios.get(i)>numeroMayor) {
				numeroMayor = numerosAleatorios.get(i);
			}		
		}
			System.out.println("el numero mayor es: " + numeroMayor);
		return numeroMayor; 
	}
	
	public static int valorMenor (ArrayList<Integer> numerosAleatorios) {
		int numeroMenor = 9999; 
		for (int i = 0; i< numerosAleatorios.size();i++) {
			if (numerosAleatorios.get(i)<numeroMenor) {
				numeroMenor = numerosAleatorios.get(i);
			}		
		}
			System.out.println("el numero menor es: " + numeroMenor);
		return numeroMenor; 
	}
	
	/*public static int valorMenor (ArrayList<Integer> numerosAleatorios) {
		
		int numeroMenor = 0;
		
		for (int i = 0; i< numerosAleatorios.size();i++) {
			if (numerosAleatorios.get(i)<numeroMenor) {
				numeroMenor = numerosAleatorios.get(i);
			}		
		}
		System.out.println("el numero menor es: " + numeroMenor);
		
		return numeroMenor;
	}*/
	
	

}