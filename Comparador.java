import java.util.Comparator;

public class Comparador implements Comparator<Anime> {

	@Override
	public int compare(Anime anime1, Anime anime2) {

		int diferencia=0;
		
		if(anime1.getValoracion()<anime2.getValoracion()) {
			
			diferencia=1;
			
		}else if (anime1.getValoracion()>anime2.getValoracion()) {
			
			diferencia=-1;
			
		}else {
			
			diferencia=0;
		}
		
		return diferencia;
	}

	
	
	/*Parte de este código así como la explicación del funcionamiento del Comparator han sido recuperados de 
	https://www.youtube.com/watch?v=s02SN3vp8ic&ab_channel=LaTecnolog%C3%ADaAvanza
	*/
	
	
	
}
