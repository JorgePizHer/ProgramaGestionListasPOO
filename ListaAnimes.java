import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaAnimes {

	private String usuario;
	private ArrayList<Anime> listaAnimes = new ArrayList<Anime>();

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

	public void gestionarAccion(int seleccion, String nombre, String demografia, String genero, int episodios,
			int valoracion) {

		try {

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
				System.out.println(listaAnimes.toString());
				break;
			case 6:
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
			e.printStackTrace();
		}
	}

	public void addAnime(String nombre, String demografia, String genero, int episodios, int valoracion) {

		try {

			Scanner lector = new Scanner(System.in);
			System.out.println("Nombre del anime: ");
			nombre = lector.nextLine();

			System.out.println("Demografía: ");
			demografia = lector.nextLine();

			System.out.println("Género: ");
			genero = lector.nextLine();

			try {
				System.out.println("Número de episodios: ");
				episodios = lector.nextInt();
				lector.nextLine();

				System.out.println("Valoración: ");
				valoracion = lector.nextInt();
				lector.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("Error. Debe introducir un número para número de episodios o valoración.");
			}
			listaAnimes.add(new Anime(nombre, demografia, genero, episodios, valoracion));

			System.out.println("Nombre: " + nombre + " / " + " Demografía: " + demografia + " / " + " Género: " + genero
					+ " / " + " Número de episodios: " + episodios + " / " + " Valoración: " + valoracion);
			System.out.println("");
			Collections.sort(listaAnimes, new Comparador());
			System.out.println(listaAnimes.toString());

		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
		}
	}

	public void modificarAnime(String nombreAnime) {

		int seleccion;
		String nuevoNombre = "";
		String nuevaDemografia = "";
		String nuevoGenero = "";
		int nuevosEpisodios = 0;
		int nuevaValoracion = 0;

		try {

			Scanner lector = new Scanner(System.in);

			do {

				seleccion = Salida.menuModificar();

				switch (seleccion) {
				case 1:

					System.out.println("Nombre del anime que desea modificar: ");
					nombreAnime = lector.nextLine();

					for (Anime item : listaAnimes)

						if (item.getNombre().equals(nombreAnime)) {

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

							System.out.println("Acción realizada con éxito");

						}

					Collections.sort(listaAnimes, new Comparador());
					System.out.println(listaAnimes.toString());
					System.out.println("");

					break;
				case 2:

					System.out.println("Nombre del anime que desea modificar: ");
					nombreAnime = lector.nextLine();

					for (Anime item : listaAnimes) {

						if (item.getNombre().equals(nombreAnime)) {

							System.out.println(item);

							System.out.println("Introduzca el nuevo nombre: ");
							nuevoNombre = lector.nextLine();
							item.setNombre(nuevoNombre);

							System.out.println("Accion realizada con éxito");
						}
					}

					Collections.sort(listaAnimes, new Comparador());
					System.out.println(listaAnimes.toString());
					System.out.println("");

					break;
				case 3:

					System.out.println("Nombre del anime que desea modificar: ");
					nombreAnime = lector.nextLine();

					for (Anime item : listaAnimes) {

						if (item.getNombre().equals(nombreAnime)) {

							System.out.println(item);

							System.out.println("Introduzca la nueva demografía: ");
							nuevaDemografia = lector.nextLine();
							item.setDemografia(nuevaDemografia);

							System.out.println("Acción realizada con éxito");
						}
					}

					Collections.sort(listaAnimes, new Comparador());
					System.out.println(listaAnimes.toString());
					System.out.println("");

					break;
				case 4:

					System.out.println("Nombre del anime que desea modificar: ");
					nombreAnime = lector.nextLine();

					for (Anime item : listaAnimes) {

						if (item.getNombre().equals(nombreAnime)) {

							System.out.println(item);

							System.out.println("Introduzca el nuevo género: ");
							nuevoGenero = lector.nextLine();
							item.setGenero(nuevoGenero);

							System.out.println("Acción realizada con éxito");

						}
					}

					Collections.sort(listaAnimes, new Comparador());
					System.out.println(listaAnimes.toString());
					System.out.println("");

					break;

				case 5:

					System.out.println("Nombre del anime que desea modificar: ");
					nombreAnime = lector.nextLine();

					try {
						for (Anime item : listaAnimes) {

							if (item.getNombre().equals(nombreAnime)) {

								System.out.println(item);

								System.out.println("Introduzca el nuevo número de episodios: ");
								nuevosEpisodios = lector.nextInt();
								lector.nextLine();
								item.setEpisodios(nuevosEpisodios);

								System.out.println("Acción realizada con éxito");
							}
						}

					} catch (InputMismatchException e) {
						System.out.println("Error. Debe introducir un número en el apartado Episodios");
					}
					Collections.sort(listaAnimes, new Comparador());
					System.out.println(listaAnimes.toString());
					System.out.println("");

					break;

				case 6:

					System.out.println("Nombre del anime que desea modificar: ");
					nombreAnime = lector.nextLine();
					try {
						for (Anime item : listaAnimes) {

							if (item.getNombre().equals(nombreAnime)) {

								System.out.println(item);

								System.out.println("Introduzca la nueva valoración: ");
								nuevaValoracion = lector.nextInt();
								lector.nextLine();
								item.setValoracion(nuevaValoracion);
								System.out.println("Acción realizada con éxito");
							}
						}

					} catch (InputMismatchException e) {
						System.out.println("Error. Debe introducir un número en el apartado Valoración");
					}

					Collections.sort(listaAnimes, new Comparador());
					System.out.println(listaAnimes.toString());
					System.out.println("");
				}

			} while (seleccion < 1 || seleccion > 6);

		} catch (Exception e) {
			System.out.println("Error desconocido, pruebe otra vez");
		}
	}

	public void BuscarAnime(String nombreAnime, String demografia, String genero, int episodios, int valoracion) {

		int seleccion;

		try {

			Scanner lector = new Scanner(System.in);

			do {

				seleccion = Salida.menuBuscar();

				switch (seleccion) {

				case 1:

					System.out.println("Nombre del anime que desea buscar: ");
					nombreAnime = lector.nextLine();

					for (Anime item : listaAnimes) {

						if (item.getNombre().equals(nombreAnime)) {

							System.out.println(item);

						}
					}

					break;
				case 2:

					System.out.println("Demografía del anime que desea buscar: ");
					demografia = lector.nextLine();

					Collections.sort(listaAnimes, new Comparador());

					for (Anime item : listaAnimes) {

						if (item.getDemografia().equals(demografia)) {

							System.out.println(item);

						}
					}

					break;
				case 3:

					System.out.println("Género del anime que desea buscar: ");
					genero = lector.nextLine();

					Collections.sort(listaAnimes, new Comparador());

					for (Anime item : listaAnimes) {

						if (item.toString().indexOf(genero) >= 0) {

							System.out.println(item);

						}
					}

					break;

				case 4:

					try {
						System.out.println("Número de episodios del anime que desea buscar: ");
						episodios = lector.nextInt();
						lector.nextLine();

						Collections.sort(listaAnimes, new Comparador());

						for (Anime item : listaAnimes) {

							if (item.getEpisodios() == episodios) {

								System.out.println(item);

							}
						}
					} catch (InputMismatchException e) {
						System.out.println("Error, debe introducir un número para Episodios");
					}

					break;

				case 5:

					try {
						System.out.println("Valoración del anime que desea buscar: ");
						valoracion = lector.nextInt();
						lector.nextLine();

						for (Anime item : listaAnimes) {

							if (item.getValoracion() == valoracion) {

								System.out.println(item);
							}
						}

					} catch (InputMismatchException e) {
						System.out.println("Error, debe introducir un número para Valoración.");
					}
					break;
				}

			} while (seleccion < 1 || seleccion > 5);

		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
		}
	}

	public void eliminarAnime(String nombreAnime) {

		String confirmarAccion;

	try {
		

			Scanner lector = new Scanner(System.in);

			System.out.println("Nombre del anime que desea eliminar: ");
			nombreAnime = lector.nextLine();

			System.out.println("¿Está seguro de eliminar " + nombreAnime + "? Responda SI o NO: ");
			confirmarAccion = lector.nextLine();

			
			
			if (confirmarAccion.equals("SI") || confirmarAccion.equals("Si") || confirmarAccion.equals("si")
					|| confirmarAccion.equals("Sí") || confirmarAccion.equals("sí")) {

				for (Anime item : listaAnimes) {

					if (item.getNombre().equals(nombreAnime)) {

						listaAnimes.remove(item);
						System.out.println("Acción realizada con éxito");
					}
				}

			} else {

				System.out.println("Acción cancelada. Vuelta al menú principal.");
			}


				Collections.sort(listaAnimes, new Comparador());
				
	} catch (ConcurrentModificationException e) {
		System.out.println(listaAnimes.toString());
	}
	}
}
