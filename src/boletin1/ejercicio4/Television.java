package boletin1.ejercicio4;

public class Television extends Electrodomestico {

	private int resolucion = 20;
	private boolean sintonizadorTDT = false;

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (this.resolucion > 40) {
			this.setPrecioBase(this.getPrecioBase() + this.getPrecioBase());
		}
		if (this.sintonizadorTDT) {
			this.setPrecioBase(this.getPrecioBase() + 50);
		}
	}
}
