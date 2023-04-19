import java.util.Scanner;
public class Salida {

		/**
		 * Muestra un mensaje de bienvenida al usuario cuando inicia el programa.
		 * Pregunta al usuario que opcion del menu quiere ejecutar.
		 * 
		 * @author Jorge Pizarro
		 * @param texto    El mensaje de bienvenida al usuario.
		 * @param opciones Pregunta para introducir las opciones del menu al usuario.
		 * @version 1.3
		 */

		public static void presentacion(String texto) {

			System.out.println(texto);
			System.out.println("");
			
		}

		/**
		 * Muestra el menu al usuario. Permite al usuario seleccionar la opción del menu
		 * que desee.
		 * 
		 * @author Jorge Pizarro
		 * @return La opcion del menu seleccionada por el usuario.
		 * @version 1.3
		 */

		public static int mostrarMenu() {
			int seleccion;

			System.out.println("1-Añadir");
			System.out.println("2-Modificar");
			System.out.println("3-Buscar");
			System.out.println("4-Eliminar");
			System.out.println("5-Salir");
			System.out.println("");

			Scanner lector = new Scanner(System.in);
			seleccion = lector.nextInt();
			lector.nextLine();

			return seleccion;
		}
		
		/**
		 * Cuando el usuario selecciona la opción del menu de "Buscar", se muestra un
		 * nuevo menu para buscar por diferentes datos. Permite al usuario seleccionar
		 * el tipo de busqueda que desea.
		 * 
		 * @author Jorge Pizarro
		 * @return La opcion del menu de busqueda seleccionada por el usuario.
		 * @version 1.3
		 */
		public static int menuModificar() {
			
			int seleccion;
			System.out.println("Seleccione lo que desea modificar");
			System.out.println("");

			System.out.println("1-Modificar todo el contenido");
			System.out.println("2-Modificar nombre");
			System.out.println("3-Modificar demografía");
			System.out.println("4-Modificar género");
			System.out.println("5-Modificar episodios");
			System.out.println("6-Modificar valoración");
			System.out.println("");

			Scanner lector = new Scanner(System.in);
			seleccion = lector.nextInt();
			lector.nextLine();


			return seleccion;
		}
	
	
	
	
	
	
	
	
	
	
}
