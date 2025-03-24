package interfaz.ejercicio2;

public class Futbolista implements Comparable<Futbolista> {
	private int numeroCamiseta = 1;
	private String nombre = "defaultName";
	private int edad = 16;
	private int numeroGoles = 0;

	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		if (numeroCamiseta > 0 && numeroCamiseta <= 99) {
			this.numeroCamiseta = numeroCamiseta;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad >= 16) {
			this.edad = edad;
		}
		if (numeroGoles >= 0) {
			this.numeroGoles = numeroGoles;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		Futbolista other = (Futbolista) obj;
		return other.nombre.equals(this.nombre) && this.numeroCamiseta == other.numeroCamiseta;
	}

	@Override
	public String toString() {
		return this.nombre + ": numero " + this.numeroCamiseta + " " + this.edad + " años" + " Numero de goles: "
				+ this.numeroGoles;
	}

	@Override
	public int compareTo(Futbolista o) {
		int res;
		if (this.numeroCamiseta != o.numeroCamiseta) {
			res = this.numeroCamiseta - o.numeroCamiseta;
		} else {
			res = this.nombre.compareTo(o.nombre);
		}
		return res;
	}

}
