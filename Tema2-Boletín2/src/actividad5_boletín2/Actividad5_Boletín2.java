package actividad5_boletín2;

import java.util.Scanner;

public class Actividad5_Boletín2 {

	public static void main(String[] args) {
		
		//Creo la variable permisoCarnet. Esta recogerá el dato introducido por el usuario
		String permisoCarnet;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le preguntamos al usuario que permiso de conducir tiene
		System.out.println("""
				
				¿Qué permiso de conducción posee?
					a) E
					b) D
					c) C1-C5
					d) A
					e) B1-B2
								""");
		
		//Declaramos la variable permisoCarnet, que guardará el dato introducido por el usuario (permiso de conducir)
		permisoCarnet = read.nextLine();
		
		//Mediante el condicional switch, indicamos, que el permisoCarnet introducido por el usuario*
		switch (permisoCarnet) {
		
			//*En caso de que sea, E
			case "E": 
				
				//Imprima que corresponde al permiso de remolques
				System.out.println("remolques");
				
				//Cortamos aquí la cadena para que imprima únicamente el caso indicado anteriormente y no los que le acompañan
				break;
				
			//*En caso de que sea, D
			case "D": 
				
				//Imprima que corresponde al permiso de autobuses
				System.out.println("autobuses");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, C1, C2, C3, C4 o C5
			case "C1", "C2", "C3", "C4", "C5": 
				
				//Imprima que corresponde al permiso de camiones
				System.out.println("camiones");
			
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, A
			case "A": 
				
				//Imprima que corresponde al permiso de motocicletas
				System.out.println("motocicletas");
				
				//Cortamos la cadena
				break;
				
			//*En caso de que sea, B1 o B2
			case "B1", "B2": 
				
				//Imprima que corresponde al permiso de automóviles
				System.out.println("automóviles");
			
				//Cortamos la cadena
				break;
			
			//Por defecto, si la opción marcada por el usuario no es ninguna de las que se le muestra, le mostraremos el siguiente mensaje
			default: System.out.println("Categoría no contemplada");
		}
		
		//Cerramos el Scanenr
		read.close();

	}

}
