package boletin1.ejercicio4;

public class Electrodomestico {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	private double precioBase = 100;
	private Color color = Color.BLANCO;
	private char consumoEnergetico = 'F';
	private int peso = 5;

	public Electrodomestico(double precioBase, int peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}

	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		color = color.toUpperCase();
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (comprobarColor(color)) {
			this.color = Color.valueOf(color);
		}
		if (comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		return letra >= 'A' && letra <= 'F';
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	public String getColor() {
		return color.toString();
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	private boolean comprobarColor(String color) {
		boolean res = false;
		if (color != null) {
			switch (color) {
			case "BLANCO", "ROJO", "NEGRO", "AZUL", "GRIS" -> {
				res = true;
			}
			}
		}
		return res;
	}

	public void precioFinal() {
		switch (this.consumoEnergetico) {
		case 'A' -> this.precioBase += 100;
		case 'B' -> this.precioBase += 80;
		case 'C' -> this.precioBase += 60;
		case 'D' -> this.precioBase += 50;
		case 'E' -> this.precioBase += 30;
		case 'F' -> this.precioBase += 10;
		}

		if (this.peso > 0 && this.peso <= 19) {
			this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precioBase += 80;
		} else if (this.peso >= 80) {
			this.precioBase += 100;
		}

	}

}
