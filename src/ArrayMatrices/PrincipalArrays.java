package ArrayMatrices;

import java.util.ArrayList;

public class PrincipalArrays {

	public static void main(String[] args) {
	
		ActProp_6_1 act1 = new ActProp_6_1();
		ArrayList<Integer> numeros = act1.generarNumerosAleatorios();
		act1.mostrarNumerosAleatorios(numeros);
		
		ActProp_6_2 act2 = new ActProp_6_2();
		act2.mostrarListaAct2(numeros);
		
	}

}
