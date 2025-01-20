package ArrayMatrices;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class MainArrays {

	public static void main(String[] args) {
		
		
		// ARRAYS FIJOS
		// array de tamaño fijo (el número dentro del [] indica cuantas cajas tendremos)
		int [] numeros = new int[5]; // [][][][][100]
		numeros[0] = 100;
		numeros[1] = 5;
		numeros[2] = 10;
		numeros[3] = 1;
		numeros[4] = 1000;
		System.out.println(numeros[4]);
		
		// length lo usamos para conocer el tamaño total de la lista (arrays fijos)
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
//////////////////////////// ARRAYS DINÁMICOS///////////////////////////////////////////////
		
		ArrayList<Integer> numerosDinamicos = new ArrayList();
		
		// para añadir valores a las cajas usamos el método .add()
		numerosDinamicos.add(100);
		numerosDinamicos.add(5);
		numerosDinamicos.add(10);
		numerosDinamicos.add(1);
		numerosDinamicos.add(1000);
		
		// size() lo usamos para conocer el tamaño total de la lista (arrays dinámicos)
		// y para mostrarlos por consola usamos el método .get()
		for(int i = 0; i < numerosDinamicos.size(); i++) {
			System.out.println("Array dinamico: " + numerosDinamicos.get(i));
		}
		//asi vemos el total de las cajas
		System.out.println(numerosDinamicos.size());
		
		// para eliminar los elementos de las cajas, usamos el método .remove() para arryas dinamicos
		numerosDinamicos.remove(0);
		System.out.println(numerosDinamicos.size());
		for(int i = 0; i < numerosDinamicos.size(); i++) {
			System.out.println("Array dinamico: " + numerosDinamicos.get(i));
		}
////////////////////vectores///////////////////		
		Vector<Integer> vector = new Vector();
		
		vector.add(1);
		
		vector.get(0);
		
		vector.remove(0);
		
/////////////////////matrices con valores fijos////////////////
		int [][] matriz = new int[3][3]; // [][]
		matriz[0][0] = 1;	
		matriz[0][1] = 2;
		matriz[0][2] = 3;	
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		System.out.println("tamaño matriz" + matriz.length);
		
		for (int f = 0; f < matriz.length; f++) {
			for(int c = 0; c < matriz[f].length; c++) {
				System.out.print("[" + matriz[f][c] + "]");
			}
			System.out.print("\n");
		}
	
/////////////////////matrices con valores automaticos////////////////
		
		int [][] matrizAuto = new int[3][3]; // [][]
		System.out.println("Matriz auto");
		
		//este bucle rellena la matriz
		int i = 1;
		for (int f = 0; f < matrizAuto.length; f++) {
			for(int c = 0; c < matrizAuto[f].length; c++) {
				matrizAuto[f][c] = i++;
			}
		}
		
			//este bucle muestra la matriz
		for (int f = 0; f < matrizAuto.length; f++) {
			for(int c = 0; c < matrizAuto[f].length; c++) {
				System.out.print("[" + matrizAuto[f][c] + "]");
			}
			System.out.print("\n");
		}
		
		//este bucle rellena y muestra la matriz a la vez
		for (int f = 0; f < matrizAuto.length; f++) {
			for(int c = 0; c < matrizAuto[f].length; c++) {
				matrizAuto[f][c] = i++; //aqui la estoy rellenando 
				System.out.print("[" + matrizAuto[f][c] + "]"); //aqui mostrando
			}
			System.out.print("\n");
		}
///////////ejercicios
		/*1-desarrolla un programa que pida por consola el numero de alumnos de una clase
		
		  2-solicite los N nombres para almacenarlos en un array.
		   acontinuacion, implementa los metodos 
			necesarios para eliminar a un alumno del array a partir de su nombre, para añadir un alumno 
			nuevo al array de alumnos y para ordenar el listado de alumnos.
		*/
		Scanner scanner = new Scanner(System.in);
		int numeroAlumnos;
		String nombreAlumnos;
		
		System.out.println("cuantos alumnos hay en la clase?");
		numeroAlumnos = scanner.nextInt();
		System.out.println("tienes " + numeroAlumnos + " Alumnos");
		
		
		
		String [] listaAlumnos = new String [numeroAlumnos]; 
		
		for (int j = 0; j < listaAlumnos.length;j++) {
			System.out.println("introduce el nombre "+ j);
			nombreAlumnos = scanner.next();
			listaAlumnos[j] = nombreAlumnos;
		}
		for (int j = 0; j < listaAlumnos.length;j++) {
			System.out.println(listaAlumnos[j]);
		
		}
		
		
	}
}
