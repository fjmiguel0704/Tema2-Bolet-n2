package actividad2_boletín2;

import java.util.Scanner;

public class Actividad2_Boletín2 {

	public static void main(String[] args) {
		
		//Creamos la variable numero. Recogerá el dato que introducirá el usuario
		int numero;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número en un rango del 1 al 7
		System.out.print("Introduce un número del 1-7:");
		
		//Declaramos la variable numero, que guardará el valor introducido por el usuario
		numero = read.nextInt();
		
		//Mediante el condicional switch, indicamos, que el número introducido por el usuario*
		switch (numero) {
		
			//*En caso de que sea, 1
			case 1:
				
				//Imprima que corresponde al día Lunes
				System.out.print("Lunes");
				
				//Cortamos aquí la cadena para que imprima únicamente el caso indicado anteriormente y no los que le acompañan
				break;
				
			//*En caso de que sea, 2
			case 2:
				
				//Imprima que corresponde al día Martes
				System.out.print("Martes");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 3
			case 3:
				
				//Imprima que corresponde al día Martes
				System.out.print("Miércoles");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 4
			case 4:
				
				//Imprima que corresponde al día Jueves
				System.out.print("Jueves");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 5
			case 5:
				
				//Imprima que corresponde al día Viernes
				System.out.print("Viernes");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 6
			case 6:
				
				//Imprima que corresponde al día Sábado
				System.out.print("Sábado");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, 7
			case 7:
				
				//Imprima que corresponde al día Domingo
				System.out.print("Domingo");
				
				//Cortamos la cadena
				break;
		}
		
		//Cerramos el Scanner
		read.close();
	}

}
