import java.util.InputMismatchException;
import java.util.Scanner;

public class Salida {

	/**
	 * La clase salida contiene los metodos que seran mostrados por consola,
	 * principalmente para interaccion con el usuario.
	 * 
	 * El metodo presentacion muestra un mensaje de bienvenida al usuario cuando
	 * inicia el programa. Pregunta al usuario que accion quiere realizar.
	 * 
	 * @author Jorge Pizarro
	 * @param texto El mensaje de bienvenida al usuario.
	 * @version 1.4
	 */

	public static void presentacion(String texto) {

		System.out.println(texto);
		System.out.println("");

	}

	/**
	 * La clase salida contiene los metodos que seran mostrados por consola,
	 * principalmente para interaccion con el usuario.
	 * 
	 * El metodo mostrarMenu muestra el menu principal del programa, donde el
	 * usuario puede seleccionar la accion que quiere realizar.
	 * 
	 * @author Jorge Pizarro
	 * @return La opcion del menu seleccionada por el usuario
	 * @version 1.4
	 */

	public static int mostrarMenu() {
		int seleccion = 0;

		try {

			System.out.println("1-Añadir");
			System.out.println("2-Modificar");
			System.out.println("3-Buscar");
			System.out.println("4-Eliminar");
			System.out.println("5-Mostrar lista completa");
			System.out.println("6-Salir");
			System.out.println("");

			Scanner lector = new Scanner(System.in);
			seleccion = lector.nextInt();
			lector.nextLine();

		} catch (InputMismatchException e) {

			System.out.println("Comando no válido. Debe introducir un número para seleccionar la acción a realizar ");
		}

		return seleccion;
	}

	/**
	 * La clase salida contiene los metodos que seran mostrados por consola,
	 * principalmente para interaccion con el usuario.
	 * 
	 * El metodo menuModificar muestra las diferentes opciones que hay a la hora de
	 * modificar un objeto de la lista.
	 * 
	 * @author Jorge Pizarro
	 * @return La opcion del menu seleccionada por el usuario
	 * @version 1.4
	 */

	public static int menuModificar() {

		int seleccion = 0;

		try {

			System.out.println("Seleccione lo que desea modificar");
			System.out.println("");

			System.out.println("1-Modificar todo el contenido de un anime");
			System.out.println("2-Modificar nombre");
			System.out.println("3-Modificar demografía");
			System.out.println("4-Modificar género");
			System.out.println("5-Modificar episodios");
			System.out.println("6-Modificar valoración");
			System.out.println("");

			Scanner lector = new Scanner(System.in);
			seleccion = lector.nextInt();
			lector.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("Comando no válido. Debe introducir un número para seleccionar la acción a realizar ");
		}

		return seleccion;
	}

	/**
	 * La clase salida contiene los metodos que seran mostrados por consola,
	 * principalmente para interaccion con el usuario.
	 * 
	 * El metodo menuBuscar muestra las diferentes opciones que hay a la hora de
	 * buscar un objeto en la lista.
	 * 
	 * @author Jorge Pizarro
	 * @return La opcion del menu seleccionada por el usuario
	 * @version 1.4
	 */

	public static int menuBuscar() {

		int seleccion = 0;

		try {

			System.out.println("Seleccione el elemento por el que desea buscar");
			System.out.println("");

			System.out.println("1-Buscar por nombre");
			System.out.println("2-Buscar por demografía");
			System.out.println("3-Buscar por género");
			System.out.println("4-Buscar por número de episodios");
			System.out.println("5-Buscar por valoración");
			System.out.println("");

			Scanner lector = new Scanner(System.in);
			seleccion = lector.nextInt();
			lector.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("Comando no válido. Debe introducir un número para seleccionar la acción a realizar ");
		}

		return seleccion;
	}

}
