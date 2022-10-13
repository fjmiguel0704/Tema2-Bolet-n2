package actividad4_boletín2;

import java.util.Scanner;

public class Actividad4_Boletín2 {

	public static void main(String[] args) {
		//Creo dos variables, tirada1 y tirada2. Estas recogerán los números de ambas tiradas
		String tirada1;
		String tirada2;
		
		//Creo otras dos variables que recogerán el dato de tirada1 y tirada2 en formato numérico
		int numero1 = 0;
		int numero2 = 0;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le preguntamos al usuario cúanto ha sacado en la primera tirada
		System.out.println("¿Cuánto ha sacado en la primera tirada?");
		
		//Le mostramos al usuario un menú, en el que tendrá que elegir una de las opciones
		System.out.println("""
							UNO
							DOS
							TRES
							CUATRO
							CINCO
							SEIS
									""");
		
		//Declaramos la variable tirada1, que guardará el dato introducido por el usuario
		tirada1 = read.nextLine();
		
		//Le preguntamos al usuario cúanto ha sacado en la segunda tirada
		System.out.println("¿Cuánto ha sacado en la segunda tirada?");
				
		//Le mostramos al usuario un menú, en el que tendrá que elegir una de las opciones
		System.out.println("""
							UNO
							DOS
							TRES
							CUATRO
							CINCO
							SEIS
									""");
		//Declaramos la variable tirada2, que guardará el segundo dato introducido por el usuario
		tirada2 = read.nextLine();
		
		//Mediante el condicional switch, indicamos, que la cadena introducida por el usuario*
		switch (tirada1) {
		
			//*En caso de que sea, UNO
			case "UNO":
				
				//La variable numero1 va a valer 1
				numero1= 1;
				
				//Cortamos aquí la cadena para que imprima únicamente el caso indicado anteriormente y no los que le acompañan
				break;
		
		//Así sucesivamente hasta SEIS
			case "DOS":
				numero1= 2; 
				break;
			case "TRES":
				numero1= 3; 
				break;
			case "CUATRO":
				numero1= 4; 
				break;
			case "CINCO":
				numero1= 5; 
				break;
			case "SEIS":
				numero1= 6; 
				break;
		}
		
		//Con otro condicional switch, indicamos, que que la segunda cadena introducida por el usuario*
		switch (tirada2) {
		
			//*En caso de que sea, UNO
			case "UNO":
				
				//La variable numero2 va a valer 1
				numero2= 1;
				
				//Cortamos la cadena
				break;
				
		//Así sucesivamente hasta SEIS
			case "DOS":
				numero2= 2; 
				break;
			case "TRES":
				numero2= 3; 
				break;
			case "CUATRO":
				numero2= 4; 
				break;
			case "CINCO":
				numero2= 5; 
				break;
			case "SEIS":
				numero2= 6;
				break;
		}
		
		//Y le mostramos al usuario la suma de sus dos tiradas, sumando las variables numero1 y numero2
		System.out.println("La suma de sus dos tiradas es de: " + (numero1 + numero2));
		
		//Cerramos el Scanner
		read.close();
		
	}

}
