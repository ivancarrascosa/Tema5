package boletin1.ejercicio5;

public abstract class Poligono {
	private int numeroLados = 3;

	public Poligono(int numeroLados) {
		if (numeroLados > 2) {
			this.numeroLados = numeroLados;
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "" + numeroLados;
	}
	
	abstract public double area();
}
