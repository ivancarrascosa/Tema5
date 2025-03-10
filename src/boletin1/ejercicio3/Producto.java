package boletin1.ejercicio3;

public class Producto {

	private String nombre = "prod sin nombre";
	private double precio = 0.01;

	public Producto(String nombre, double precio) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", precio: " + precio;
	}

	public double calcular(int cantProd) {
		return this.precio * cantProd;
	}

}
