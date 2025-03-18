package boletin1.ejercicio5;

public class Rectangulo extends Poligono{
	private double lado1 = 1;
	private double lado2 = 1;
	
	public Rectangulo() {
		super(4);
	}
	
	public Rectangulo(double lado1, double lado2) {
		super(4);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}
	
	@Override
	public String toString() {
		return "RECTÁNGULO \t lado 1:" + lado1 + "\tlado 2:" + lado2;  
	}
	
	public double area() {
		return lado1*lado2;

	}
}
