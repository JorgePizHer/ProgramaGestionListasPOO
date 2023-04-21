import java.util.Comparator;

public class Comparador implements Comparator<Anime> {

	/**
	 * La clase Comparador sirve para poder ordenar los objetos de la lista por
	 * cualquiera de sus campos.
	 * 
	 * El metodo compare permite ordenar la lista de objetos de la clase Anime por
	 * Valoracion (descendiente de manera predeterminada).
	 * 
	 * @author Jorge Pizarro
	 * @param anime1 Primer objeto que se comparara con el siguiente.
	 * @param anime2 Segundo objeto que se comparara con el anterior.
	 * @version 1.4
	 */

	@Override
	public int compare(Anime anime1, Anime anime2) {
		int diferencia = 0;

		if (anime1.getValoracion() < anime2.getValoracion()) {

			diferencia = 1;

		} else if (anime1.getValoracion() > anime2.getValoracion()) {

			diferencia = -1;

		} else {

			diferencia = 0;
		}

		return diferencia;
	}

	/*
	 * Parte de este código así como la explicación del funcionamiento del
	 * Comparator han sido recuperados de
	 * https://www.youtube.com/watch?v=s02SN3vp8ic&ab_channel=LaTecnolog%C3%
	 * ADaAvanza
	 */

}
