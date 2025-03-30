package analisis.ejercicio2;

public class DVD extends Ficha{
	private enum Tipo {PELICULA, DOCUMENTAL, SERIE};
	
	private String director;
	
	private int año;
	
	private Tipo tipoDVD;

	public DVD(int id, String titulo, String director, int año, String tipoDVD) {
		super(id, titulo);
		if (director != null && !director.isBlank()) {
			this.director = director;
		}
		if (año >= 1950) {
			this.año = año;
		}
		tipoDVD = tipoDVD.toUpperCase();
		if (comprobarTipo(tipoDVD)) {
			this.tipoDVD = Tipo.valueOf(tipoDVD);
		}
		
	}

	public String getDirector() {
		return director;
	}
	
	public int getAño() {
		return año;
	}

	public Tipo getTipoDVD() {
		return tipoDVD;
	}

	private boolean comprobarTipo(String tipo) {
		boolean res = false;
		switch (tipo) {
		case "PELICULA", "DOCUMENTAL", "SERIE" -> res = true; 
		}
		return res;
	}

	@Override
	public int tiempoPrestamo() {
		return 5;
	}

}
