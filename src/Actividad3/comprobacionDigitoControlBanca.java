package Actividad3;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class comprobacionDigitoControlBanca {

	
	  private static int primerDigito (String entidad, String oficina) {
		int acumulado = 0;
		int primerDigito;
		int segundoDigito;
		int tercerDigito;
		int cuartoDigito;
		int primerDigitoControl;
	
		// Calcular entidad
		primerDigito = Character.getNumericValue(entidad.charAt(0)) * 4;
		segundoDigito = Character.getNumericValue(entidad.charAt(1))* 8;
		tercerDigito = Character.getNumericValue(entidad.charAt(2)) * 5;
		cuartoDigito = Character.getNumericValue(entidad.charAt(3)) * 10;
		acumulado = primerDigito + segundoDigito + tercerDigito + cuartoDigito;
		 
		// Calcular oficina
		primerDigito = Character.getNumericValue(oficina.charAt(0)) * 9;
		segundoDigito = Character.getNumericValue(oficina.charAt(1))* 7;
		tercerDigito = Character.getNumericValue(oficina.charAt(2)) * 3;
		cuartoDigito = Character.getNumericValue(oficina.charAt(3)) * 6;

		// Sumar entidad + oficina
		acumulado = acumulado + primerDigito + segundoDigito + tercerDigito + cuartoDigito;
		
		// Dividir entre 11 el resultado
		primerDigitoControl= 11 - (acumulado % 11);
		
		if (primerDigitoControl == 10) {
			primerDigitoControl = 1;
		}
		 
		  return primerDigitoControl;
	  }
	
	  	//0182 1294 16 0202272058
	   /*numcuenta.length() PARA RECORRER UN STRING NORMALMETE USADO COMO CONDICION EN UN FOR*/
	  /*nombredelalista.size();PARA RECORER UNA LISTA NORMALMETE USADO COMO CONDICION EN UN FOR*/
	  
	  private static int segundoDigito(String numCuenta) {
		  int acumulado = 0;
		  int segundoDigitoControl;
		  
		  List<Integer> numerosmul = List.of(1, 2, 4, 8, 5, 10, 9, 7, 3, 6);
		  
		  // 1234567891
		  // i = 0 1 2 3
		 for (int i = 0; i < numerosmul.size() ; i++) {
			 acumulado = acumulado + Character.getNumericValue(numCuenta.charAt(i) * numerosmul.get(i));
		 }
		 segundoDigitoControl= 11 - (acumulado % 11);
		 
		 return segundoDigitoControl ; 
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String numCuenta;
		String entidad;
		String oficina;
		
		System.out.println("ingresa el numero de entidad de tu IBAN");
		entidad= scanner.next();
		System.out.println("ingresa el numero de oficina de tu IBAN");
		oficina= scanner.next();
		
		System.out.println("tu primer digito de control es: " + primerDigito(entidad, oficina));
		
		System.out.println("ingresa el numero de cuenta de tu IBAN");
		numCuenta = scanner.next();
		
		System.out.println("tu segundo digito de control es: " + segundoDigito(numCuenta));
	}

}
