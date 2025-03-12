package boletin1.ejercicio4;

public class Lavadora extends Electrodomestico {

	private int carga = 5;

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	public int getCarga() {
		return carga;
	}

	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.setPrecioBase(this.getPrecioBase() + 50);
		}

	}

}
