import java.util.Scanner;
public class Salida {

		

		public static void presentacion(String texto) {

			System.out.println(texto);
			System.out.println("");
			
		}

		

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
		
		
		public static int menuModificar() {
			
			int seleccion;
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


			return seleccion;
		}
	
	
			public static int menuBuscar() {
			
			int seleccion;
			
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

			return seleccion;
		}
	
	
	
	
	
	
	
}
