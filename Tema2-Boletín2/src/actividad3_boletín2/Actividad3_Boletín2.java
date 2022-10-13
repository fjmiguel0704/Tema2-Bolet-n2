package actividad3_boletín2;

import java.util.Scanner;

public class Actividad3_Boletín2 {

	public static void main(String[] args) {
		//Creo dos variables, num1 y num2. Estas recogerán los datos que introduzca el usuario, bien sean números enteros o con decimales
		int num1;
		int num2;
		
		//Creo la variable menu. Recogerá los carácteres introducidos por el usuario
		char menu;
	
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el primer número
		System.out.print("Introduce el primer número: ");
		
		//Declaramos la variable num1, que guardará el valor introducido por el usuario
		num1 = read.nextInt();
		
		//Le pedimos al usuario que introduzca el segundo número
		System.out.print("Introduce el segundo número: ");
				
		//Declaramos la variable num2, que guardará el segundo valor introducido por el usuario
		num2 = read.nextInt();
		
		//Le pedimos al usuario que seleccione una de las opciones que se muestran
		System.out.println("¿Qué desea hacer?");
		System.out.println("    A. SUMAR LOS NÚMEROS");
		System.out.println("    B. RESTAR LOS NÚMEROS");
		System.out.println("    C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("    D. DIVIDIR LOS NÚMEROS");
		
		//Declaramos la variable menu, esta guardará el carácter introducido por el usuario
		menu = read.next().charAt(0);
		
		//Mediante el condicional switch, indicamos, que el carácter introducido por el usuario*
		switch (menu) {
		
			//*En caso de que sea, A
			case 'A':
				
				//Imprima el resultado de la suma de la variable num1 + num2
				System.out.println(num1 + num2);
				
				//Cortamos aquí la cadena para que imprima únicamente el caso indicado anteriormente y no los que le acompañan
				break;
				
			//*En caso de que sea, B
			case 'B':
				
				//Imprima el resultado de la resta de la variable num1 - num2
				System.out.println(num1 - num2);
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, C
			case 'C':
				
				//Imprima el resultado de la multiplicación de la variable num1 * num2
				System.out.println(num1 * num2);
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, D
			case 'D':
				
				//Imprima el resultado de la división de la variable num1 / num2
				System.out.println(num1 / num2);
				
				//Cortamos la cadena
				break;
				
				//Por defecto, si la opción marcada por el usuario no es ninguna de las que se le entrega, le mostraremos el siguiente mensaje
				default: System.out.println("La opción marcada no es correcta");
		}
		
		
		//Cerramos el Scanner
		read.close();
		
	}

}
