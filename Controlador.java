
public class Controlador {

	public static void main(String[] args) {
		
		String nombre="";
		String demografia="";
		String genero="";
		int episodios=0;
		int valoracion=0;
		int seleccion=0;
		
		ListaAnimes temporadaPrimavera2023=new ListaAnimes("Jorge");
		
		
		
		Salida.presentacion("Bienevido al programa de gestión de listas. ¿Qué acción desea realizar?");
		
		
	
		
		do {
			seleccion = Salida.mostrarMenu();

			temporadaPrimavera2023.gestionarAccion(seleccion, nombre, demografia, genero, episodios, valoracion);
			System.out.println(temporadaPrimavera2023.toString());
			System.out.println("");
			
		} while (seleccion > 0 || seleccion < 6);

	

		
		
		
		
	
		
	}

}
