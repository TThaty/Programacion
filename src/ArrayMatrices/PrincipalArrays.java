package ArrayMatrices;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalArrays {

	public static void main(String[] args) {
	
		ActProp_6_1 act1 = new ActProp_6_1();
		ArrayList<Integer> numeros = act1.generarNumerosAleatorios();
		Collections.sort(numeros);
		act1.mostrarNumerosAleatorios(numeros);
		
		
		/*ActProp_6_2 act2 = new ActProp_6_2();
		act2.mostrarListaAct2(numeros);
		
		ActPro_6_4 act4 = new ActPro_6_4();	
		act4.contarPalabrasDiferentes("Hola, me llamo Thanya. estoy harta de programar, me llamo alex");*/
		
		ActPro_6_5 act5 = new ActPro_6_5();
		act5.valorMayor(numeros);
		act5.valorMenor(numeros);

		
	}
	
}
