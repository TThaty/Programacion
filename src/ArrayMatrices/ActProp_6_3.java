package ArrayMatrices;
/*Nombre: Thanya jecrois
 * Fecha: 18/01/2025
 * DAM 1º
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ActProp_6_3 {

	public static void main(String[] args) {
		/*1-desarrolla un programa que pida por consola el numero de alumnos de una clase
		
		  2-solicite los N nombres para almacenarlos en un array.
		  
		  3-eliminar a un alumno del array a partir de su nombre,para añadir un alumno 
			nuevo al array de alumnos 
			
		  4- ordenar el listado de alumnos.
		*/
		
		//creacion de variables 
		Scanner scanner = new Scanner(System.in);
		int numeroAlumnos;
		String nombreAlumnos;
		
		//aqui preguntamos el tamaño que tendra nuestra lista y luego mostramos el tamaño de la lista
		System.out.println("cuantos alumnos hay en la clase?");
		numeroAlumnos = scanner.nextInt();
		System.out.println("tienes " + numeroAlumnos + " Alumnos");
		
		//creamos el array (dinamico) intente hacerlo con un array fijo pero me resulto 
		//mas facil el dinamico
		ArrayList<String> listaAlumnos = new ArrayList();
		
		//hacemos un bucle for para que el usuario introduzca los nombre a ala lista
		for (int i = 0; i < numeroAlumnos;i++) {
			System.out.println("introduce el nombre "+ i);
			nombreAlumnos = scanner.next();
			listaAlumnos.add(nombreAlumnos);
		}
		//le mostramos al usuario lo que ha introducido y la cantidad
		System.out.println("tienes: " + listaAlumnos.size() + " alumnos en clase");
		for (int i = 0; i < listaAlumnos.size();i++) {
			System.out.println(listaAlumnos.get(i));
		}
		//le preguntamso que alumno quiere eliminar de la lista 
		System.out.println("Que alumno quiere eliminar de la lista?");
		nombreAlumnos = scanner.next();
		listaAlumnos.remove(nombreAlumnos);
		
		//le mostramos la cantidad de alumnos y los nombres ordenados por orden alfabetico
		System.out.println("ahora tienes: " + listaAlumnos.size() + " los alumnos que tienes son:");
		 for(int i = 0; i < listaAlumnos.size();i++) {
			 Collections.sort(listaAlumnos);
			 System.out.println(listaAlumnos.get(i));
		 }
	}
}
