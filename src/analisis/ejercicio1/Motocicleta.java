package analisis.ejercicio1;

public class Motocicleta extends Vehiculo {
	int cc = 125;
	boolean requiereCarnet = true;

	public Motocicleta(String marca, String modelo, String color, String matrícula) {
		super(marca, modelo, color, matrícula);
	}

	public Motocicleta(String marca, String modelo, String color, String matrícula, int cc) {
		super(marca, modelo, color, matrícula);
		if (cc > 0) {
			this.cc = cc;
			requiereCarnet = cc >= 125;
		}

	}
}
