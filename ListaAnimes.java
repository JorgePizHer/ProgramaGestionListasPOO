import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaAnimes {

	
	private String usuario;
	private ArrayList<Anime> listaAnimes=new ArrayList<Anime>();
	
	
	
	public ListaAnimes(String usuario) {
		super();
		this.usuario = usuario;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public ArrayList<Anime> getListaAnimes() {
		return listaAnimes;
	}



	public void setListaAnimes(ArrayList<Anime> listaAnimes) {
		this.listaAnimes = listaAnimes;
	}



	@Override
	public String toString() {
		return "ListaAnimes [usuario=" + usuario + ", listaAnimes=" + listaAnimes + "]";
	}



	public void addAnime(String nombre, String demografia, String genero, int episodios, int valoracion) {

		

		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre del anime: ");
		nombre = lector.nextLine();
		
		System.out.println("Demografía: ");
		demografia = lector.nextLine();
		
		System.out.println("Género: ");
		genero = lector.nextLine();
		
		System.out.println("Número de episodios: ");
		episodios = lector.nextInt();
		lector.nextLine();
		
		System.out.println("Valoración: ");
		valoracion = lector.nextInt();
		lector.nextLine();
		

		listaAnimes.add(new Anime(nombre, demografia, genero, episodios, valoracion));
		
		System.out.println("Nombre: " + nombre + " / " + " Demografía: " + demografia + " / " + " Género: " + genero + " / " + " Número de episodios: " + episodios + " / " + " Valoración: " + valoracion);
		

			
	}
	
	
	
	
	
	
}
