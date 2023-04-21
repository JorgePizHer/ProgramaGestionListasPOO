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

	/**
	 * La clase ListaAnimes contiene todos los metodos que trabajaran con el
	 * ArrayList ListaAnimes, que almacenara todos los objetos de la clase Anime que
	 * se creen.
	 * 
	 * En el metodo gestionarAccion, segun la seleccion del usuario en el menu, se
	 * ejecuta el metodo asociado a dicha seleccion.
	 * 
	 * @author Jorge Pizarro
	 * @param seleccion  El case del switch que se ejecutara, que se corresponde con
	 *                   la opción del menu seleccionada por el usuario.
	 * @param nombre     Nombre de cada uno de los animes que se guardan como
	 *                   objetos en la lista.
	 * @param demografia Demografia de cada uno de los animes que se guardan como
	 *                   objetos en la lista.
	 * @param genero     Genero de cada uno de los animes que se guardan como
	 *                   objetos en la lista.
	 * @param episodios  Numero de episodios de cada uno de los animes que se
	 *                   guardan como objetos en la lista.
	 * @param valoracion Valoracion que el usuario asigna a cada uno de los animes
	 *                   que se guardan como objetos en la lista.
	 * @version 1.4
	 */

	public void gestionarAccion(int seleccion, String nombre, String demografia, String genero, int episodios,
			int valoracion) {

		try {

			switch (seleccion) { // Switch para ejecutar las acciones que especifique el usuario
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

	/**
	 * La clase ListaAnimes contiene todos los metodos que trabajaran con el
	 * ArrayList ListaAnimes, que almacenara todos los objetos de la clase Anime que
	 * se creen.
	 * 
	 * El metodo addAnime interactua con el usuario por consola para que este añada
	 * objetos a la lista con sus respectivos datos.
	 * 
	 * @author Jorge Pizarro
	 * @param nombre     Nombre que da el usuario a cada uno de los animes que se
	 *                   guardan como objetos en la lista.
	 * @param demografia Demografia que el usuario asigna a cada uno de los animes
	 *                   que se guardan como objetos en la lista.
	 * @param genero     Genero que el usuario asigna a cada uno de los animes que
	 *                   se guardan como objetos en la lista.
	 * @param episodios  Numero de episodios que el usuario asigna a cada uno de los
	 *                   animes que se guardan como objetos en la lista.
	 * @param valoracion Valoracion que el usuario asigna a cada uno de los animes
	 *                   que se guardan como objetos en la lista.
	 * @version 1.4
	 */

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
			listaAnimes.add(new Anime(nombre, demografia, genero, episodios,
					valoracion)); /*
									 * .add para que los datos introducidos por el usuario se guarden dentro // de
									 * la lista de objetos como un nuevo objeto de la clase Anime
									 */

			System.out.println("Nombre: " + nombre + " / " + " Demografía: " + demografia + " / " + " Género: " + genero
					+ " / " + " Número de episodios: " + episodios + " / " + " Valoración: " + valoracion);
			System.out.println("");
			Collections.sort(listaAnimes, new Comparador()); // Llamada al método compare para ordenar la lista por
																// valoración descendente
			System.out.println(listaAnimes.toString());

		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
		}
	}

	/**
	 * La clase ListaAnimes contiene todos los metodos que trabajaran con el
	 * ArrayList ListaAnimes, que almacenara todos los objetos de la clase Anime que
	 * se creen.
	 * 
	 * En el metodo modificarAnime el usuario introduce el nombre del objeto de la
	 * clase Anime que desea modificar y podra modificar todos los elementos de
	 * dicho objeto o solo uno de ellos, segun su eleccion.
	 * 
	 * @author Jorge Pizarro
	 * @param nombreAnime el nombre del anime que el usuario introduce y que por
	 *                    tanto desea modificar, ya sea al completo o solo alguno de
	 *                    sus campos.
	 * @version 1.4
	 */

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

					for (Anime item : listaAnimes) // Bucle for each para realizar la búsqueda dentro de la lista

						if (item.getNombre().equals(nombreAnime)) { // Uso de los getters y setters para modificar los
																	// datos

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

	/**
	 * La clase ListaAnimes contiene todos los metodos que trabajaran con el
	 * ArrayList ListaAnimes, que almacenara todos los objetos de la clase Anime que
	 * se creen.
	 * 
	 * En el metodo BuscarAnime el usuario puede buscar un objeto de la clase Anime
	 * dentro de la lista por cualquiera de sus campos.
	 * 
	 * @author Jorge Pizarro
	 * @param nombreAnime Nombre del objeto de la clase Anime que el usuario desea
	 *                    buscar.
	 * @param demografia  Demografia del objeto de la clase Anime que el usuario
	 *                    desea buscar.
	 * @param genero      Genero del objeto de la clase Anime que el usuario desea
	 *                    buscar.
	 * @param episodios   Numero de episodios del objeto de la clase anime que el
	 *                    usuario desea buscar.
	 * @param valoracion  Valoracion del objeto de la clase anime que el usuario
	 *                    desea buscar.
	 * @version 1.4
	 */

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

	/**
	 * La clase ListaAnimes contiene todos los metodos que trabajaran con el
	 * ArrayList ListaAnimes, que almacenara todos los objetos de la clase Anime que
	 * se creen.
	 * 
	 * En el metodo eliminarAnime se interactua con el usuario para que este
	 * introduzca el nombre del anime que, previa confirmacion por parte del
	 * usuario, sera eliminado.
	 * 
	 * @author Jorge Pizarro
	 * @param nombreAnime el nombre del objeto de la clase Anime que el usuario
	 *                    introduce y que en principio quiere eliminar.
	 * @version 1.4
	 */

	public void eliminarAnime(String nombreAnime) {

		String confirmarAccion;

		try {

			Scanner lector = new Scanner(System.in);

			System.out.println("Nombre del anime que desea eliminar: ");
			nombreAnime = lector.nextLine();

			System.out.println("¿Está seguro de eliminar " + nombreAnime + "? Responda SI o NO: ");
			confirmarAccion = lector.nextLine();

			if (confirmarAccion.equals("SI") || confirmarAccion.equals("Si") || confirmarAccion.equals("si")
					|| confirmarAccion.equals("Sí") || confirmarAccion.equals("sí")) { // Paso intermendio de
																						// confirmación para evitar
																						// eliminar objetos por error

				for (Anime item : listaAnimes) {

					if (item.getNombre().equals(nombreAnime)) {

						listaAnimes.remove(item); // .remove para eliminar el objeto buscado de la lista tras la
													// confirmación
						System.out.println("Acción realizada con éxito");
						System.out.println(listaAnimes.toString());
					}
				}

			} else {

				System.out.println("Acción cancelada. Vuelta al menú principal.");
			}

			Collections.sort(listaAnimes, new Comparador());

		} catch (ConcurrentModificationException e) {
			System.out.println(
					"¿Qué desea realizar a continuación?"); /*
															 * En este caso y de forma excepcional no aparece un mensaje
															 * de error como tal, pues el error salta unas veces sí y
															 * otras no y no he conseguido identificar la manera de
															 * solucionarlo. Pero el caso es que ejecuta todas las
															 * acciones correctamente independientemente de que salte el
															 * error o no
															 */

		}

	}
}
