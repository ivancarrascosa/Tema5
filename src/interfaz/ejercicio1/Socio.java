package interfaz.ejercicio1;

public class Socio implements Comparable<Socio> {
	private int id = 0;
	private String nombre = "noName";
	private int edad = 18;
	
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

	@Override
	public int compareTo(Socio o) {
		return this.id - o.id;
	}
	
	@Override
	public String toString() {
		return this.id + ": " + this.nombre + " " + this.edad + " años";
	}
	
	
}
