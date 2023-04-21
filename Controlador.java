
public class Controlador {

	public static void main(String[] args) {

		String nombre = "";
		String demografia = "";
		String genero = "";
		int episodios = 0;
		int valoracion = 0;
		int seleccion = 0;

		try {

			ListaAnimes temporadaPrimavera2023 = new ListaAnimes("Jorge"); // Creación de la lista de objetos

			Salida.presentacion("Bienevido al programa de gestión de listas. ¿Qué acción desea realizar?");

			do {
				seleccion = Salida.mostrarMenu();

				temporadaPrimavera2023.gestionarAccion(seleccion, nombre, demografia, genero, episodios, valoracion);
				System.out.println("");

			} while (seleccion > 0 || seleccion < 6); // Bucle do/while para que el menú inicial se muestre después de
														// cada acción automáticamente y que el programa no se cierra
														// salvo que así lo especifique el usuario

		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
		}
	}

}
