
public class Anime {

	private String nombre;
	private String demografia;
	private String genero;
	private int episodios;
	private int valoracion;
	
	
	public Anime(String nombre, String demografia, String genero, int episodios, int valoracion) {
		super();
		this.nombre = nombre;
		this.demografia = demografia;
		this.genero = genero;
		this.episodios = episodios;
		this.valoracion = valoracion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDemografia() {
		return demografia;
	}


	public void setDemografia(String demografia) {
		this.demografia = demografia;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getEpisodios() {
		return episodios;
	}


	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}


	public int getValoracion() {
		return valoracion;
	}


	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}


	@Override
	public String toString() {
		return "Anime [nombre=" + nombre + ", demografia=" + demografia + ", genero=" + genero + ", episodios="
				+ episodios + ", valoracion=" + valoracion + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
