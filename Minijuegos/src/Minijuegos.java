//Programa hecho por Axel y Siru

import java.util.Scanner;

public class Minijuegos {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 
		 * Adivina el numero y Combate
		 * 
		 * 
		 */

		menu();

	}

	public static int menu() {

		boolean salir = false;
		int opcion = 0; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println(" Elige una opción: ");
			System.out.println();
			System.out.println(" 1.- Jugar");
			System.out.println(" 2.- Información");
			System.out.println(" 3.- Mostrar puntuaciones");
			System.out.println(" 4.- Autores");
			System.out.println(" 5.- Versión");
			System.out.println(" 6.- Salir");
			opcion = teclado.nextInt();
			if (opcion == 6) {
				salir = true;
			}
		}
		return opcion;
	}

}
