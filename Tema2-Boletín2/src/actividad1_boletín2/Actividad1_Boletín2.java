package actividad1_boletín2;

import java.util.Scanner;

public class Actividad1_Boletín2 {

	public static void main(String[] args) {
		
		//Creamos la variable nota. Recogerá el dato introducido por el usuario
		int nota;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read= new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca su nota en un rango del 1 al 10
		System.out.print("Introduce tu nota del 1-10: ");
		
		//Declaramos la variable nota, que guardará el valor introducido por el usuario
		nota = read.nextInt();
		
		//Mediante el condicional switch, indicamos, que la nota introducida por el usuario*
		switch (nota) {
		
			//*En caso de que sea, 0, 1, 2, 3 o 4
			case 0, 1, 2, 3, 4:
				
				//Imprima que la nota es insuficiente
				System.out.print("Insuficiente");
			
				//Cortamos aquí la cadena para que imprima únicamente el caso indicado anteriormente y no los que le acompañan
				break;
				
			//*En caso de que sea, 5
			case 5:
				
				//Imprima que la nota es suficiente
				System.out.print("Suficiente");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 6
			case 6:
				
				//Imprima que la nota es un bien
				System.out.print("Bien");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 7 u 8
			case 7, 8:
				
				//Imprima que la nota es un notable
				System.out.print("Notable");
			
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 9 o 10
			case 9, 10:
				
				//Imprima que la nota es sobresaliente
				System.out.print("Sobresaliente");
			
				//Cortamos la cadena
				break;
				
		}
		
		//Cerramos el Scanner
		read.close();

	}

}
