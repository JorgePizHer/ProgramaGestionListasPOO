import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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


	
	public void gestionarAccion(int seleccion, String nombre, String demografia, String genero, int episodios, int valoracion) {
		
		
		switch (seleccion) {
		case 1:
			addAnime(nombre, demografia, genero, episodios, valoracion);
			break;
		case 2:
			modificarAnime(nombre);
			break;
		case 3:
			BuscarAnime(nombre, demografia, genero, episodios, valoracion);
			break;
		case 4:
			eliminarAnime(nombre);
			break;
		case 5:
			System.exit(0);
		}	
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
		System.out.println("");
		Collections.sort(listaAnimes, new Comparador());
		System.out.println(listaAnimes.toString());

			
	}
	
	
	public void modificarAnime(String nombreAnime) {

		int seleccion;
		String nuevoNombre="";
		String nuevaDemografia="";
		String nuevoGenero="";
		int nuevosEpisodios=0;
		int nuevaValoracion=0;
		
		Scanner lector = new Scanner(System.in);
		
		do {
		
		seleccion=Salida.menuModificar();
			
		switch (seleccion) {
			case 1: 
				
				
				System.out.println("Nombre del anime que desea modificar: ");
				nombreAnime = lector.nextLine();
				
				
				for(Anime item: listaAnimes) {
					
					if(item.getNombre().equals(nombreAnime)) {
			
						System.out.println(item);
						
				System.out.println("Introduzca el nuevo nombre: ");
				nuevoNombre = lector.nextLine();	
				item.setNombre(nuevoNombre);
				
				System.out.println("Introduzca la nueva demografía: ");
				nuevaDemografia = lector.nextLine();	
				item.setDemografia(nuevaDemografia);
						
				System.out.println("Introduzca el nuevo género: ");
				nuevoGenero = lector.nextLine();	
				item.setGenero(nuevoGenero);
				
				System.out.println("Introduzca el nuevo número de episodios: ");
				nuevosEpisodios = lector.nextInt();
				lector.nextLine();
				item.setEpisodios(nuevosEpisodios);
				
				System.out.println("Introduzca la nueva valoración: ");
				nuevaValoracion = lector.nextInt();
				lector.nextLine();
				item.setValoracion(nuevaValoracion);
					
					}
				}
				
				System.out.println("Acción realizada con éxito");
				Collections.sort(listaAnimes, new Comparador());
				System.out.println(listaAnimes.toString());
				System.out.println("");
				
				break;
			case 2:
				
				System.out.println("Nombre del anime que desea modificar: ");
				nombreAnime = lector.nextLine();
				
				
				for(Anime item: listaAnimes) {
					
					if(item.getNombre().equals(nombreAnime)) {
			
						System.out.println(item);
						
				System.out.println("Introduzca el nuevo nombre: ");
				nuevoNombre = lector.nextLine();	
				item.setNombre(nuevoNombre);
				
				
					}
				}
				
				System.out.println("Accion realizada con éxito");
				Collections.sort(listaAnimes, new Comparador());
				System.out.println(listaAnimes.toString());
				System.out.println("");
				
				break;
			case 3:
				
				System.out.println("Nombre del anime que desea modificar: ");
				nombreAnime = lector.nextLine();
				
				
				for(Anime item: listaAnimes) {
					
					if(item.getNombre().equals(nombreAnime)) {
			
						System.out.println(item);
						
				System.out.println("Introduzca la nueva demografía: ");
				nuevaDemografia = lector.nextLine();	
				item.setDemografia(nuevaDemografia);
					}
				}
				
				System.out.println("Acción realizada con éxito");
				Collections.sort(listaAnimes, new Comparador());
				System.out.println(listaAnimes.toString());
				System.out.println("");
				
				break;
			case 4:
				
				System.out.println("Nombre del anime que desea modificar: ");
				nombreAnime = lector.nextLine();
				
				
				for(Anime item: listaAnimes) {
					
					if(item.getNombre().equals(nombreAnime)) {
			
						System.out.println(item);
						
				System.out.println("Introduzca el nuevo género: ");
				nuevoGenero = lector.nextLine();	
				item.setGenero(nuevoGenero);
				
				
					}
				}
				
				System.out.println("Acción realizada con éxito");
				Collections.sort(listaAnimes, new Comparador());
				System.out.println(listaAnimes.toString());
				System.out.println("");
				
				break;
				
			case 5:
				
				System.out.println("Nombre del anime que desea modificar: ");
				nombreAnime = lector.nextLine();
				
				
				for(Anime item: listaAnimes) {
					
					if(item.getNombre().equals(nombreAnime)) {
			
						System.out.println(item);
						
				System.out.println("Introduzca el nuevo número de episodios: ");
				nuevosEpisodios = lector.nextInt();
				lector.nextLine();
				item.setEpisodios(nuevosEpisodios);
				
					}
				}
				
				System.out.println("Acción realizada con éxito");
				Collections.sort(listaAnimes, new Comparador());
				System.out.println(listaAnimes.toString());
				System.out.println("");
				
				break;
				
			case 6:
				
				System.out.println("Nombre del anime que desea modificar: ");
				nombreAnime = lector.nextLine();
				
				
				for(Anime item: listaAnimes) {
					
					if(item.getNombre().equals(nombreAnime)) {
			
						System.out.println(item);
						
				System.out.println("Introduzca la nueva valoración: ");
				nuevaValoracion = lector.nextInt();
				lector.nextLine();
				item.setValoracion(nuevaValoracion);
				
					}
				}
				
				System.out.println("Acción realizada con éxito");
				Collections.sort(listaAnimes, new Comparador());
				System.out.println(listaAnimes.toString());
				System.out.println("");
				
				break;
				
		}
		
		
		}while (seleccion < 1|| seleccion >6);
		
	}
		
		public void BuscarAnime(String nombreAnime, String demografia, String genero, int episodios, int valoracion) {

			int seleccion;
			
			Scanner lector = new Scanner(System.in);
			
			do {
			
			seleccion=Salida.menuBuscar();
				
			switch (seleccion) {
				
				case 1:
					
					System.out.println("Nombre del anime que desea buscar: ");
					nombreAnime = lector.nextLine();
					
					
					for(Anime item: listaAnimes) {
						
						if(item.getNombre().equals(nombreAnime)) {
				
							System.out.println(item);
							
						}
					}
					
					break;
				case 2:
					
					System.out.println("Demografía del anime que desea buscar: ");
					demografia = lector.nextLine();
					
					Collections.sort(listaAnimes, new Comparador());
					
					for(Anime item: listaAnimes) {
						
						if(item.getDemografia().equals(demografia)) {
				
							
							System.out.println(item);
							
						}
					}
					
					break;
				case 3:
					
					System.out.println("Género del anime que desea buscar: ");
					genero = lector.nextLine();
					
					Collections.sort(listaAnimes, new Comparador());
					
					for(Anime item: listaAnimes) {
						
						if(item.toString().indexOf(genero)>=0) {
				
							System.out.println(item);
							
						}
					}
					
					break;
					
				case 4:
					
					System.out.println("Número de episodios del anime que desea buscar: ");
					episodios = lector.nextInt();
					lector.nextLine();
					
					Collections.sort(listaAnimes, new Comparador());
					
					for(Anime item: listaAnimes) {
						
						if(item.getEpisodios()==episodios) {
				
							System.out.println(item);
							
						}
					}
					
					break;
					
				case 5:
					
					
					System.out.println("Valoración del anime que desea buscar: ");
					valoracion = lector.nextInt();
					lector.nextLine();
					
					
					for(Anime item: listaAnimes) {
						
						if(item.getValoracion()==valoracion) {
							
							System.out.println(item);
						}
					}
						
					break;		
			}
				
			
			}while (seleccion < 1|| seleccion >5);
	
	}	
		
		public void eliminarAnime(String nombreAnime) {
			
			String confirmarAccion;
			
			
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Nombre del anime que desea eliminar: ");
			nombreAnime = lector.nextLine();
			
			System.out.println("¿Está seguro de eliminar " + nombreAnime + "? Responda SI o NO: ");
			confirmarAccion = lector.nextLine();
			
			if (confirmarAccion.equals("SI") || confirmarAccion.equals("Si") || confirmarAccion.equals("si") || confirmarAccion.equals("Sí") || confirmarAccion.equals("sí")) {
				
				for(Anime item: listaAnimes) {
					
					if(item.getNombre().equals(nombreAnime)) {
			
						listaAnimes.remove(item);
						System.out.println("Acción realizada con éxito");
						System.out.println("");
						System.out.println(listaAnimes.toString());
					}
				}
				
				
			}
					
		}
		
		
		
}
