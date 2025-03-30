package analisis.ejercicio2;

abstract public class Ficha {
	
	private int id;
	
	private String titulo;
	
	public Ficha(int id, String titulo) {
		if (id > 0) {
			this.id = id;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
	}

	abstract public int tiempoPrestamo();
}
