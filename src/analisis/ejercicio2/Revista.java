package analisis.ejercicio2;

public class Revista extends Ficha{
	private int numero;
	
	private int añoPublicacion;
	
	public Revista(int id, String titulo, int numero, int añoPublicacion) {
		super(id, titulo);
		if (numero > 0) {
			this.numero = numero;
		}
		if (añoPublicacion >= 0) {
			this.añoPublicacion = añoPublicacion;
		}
	}
	public int getNumero() {
		return numero;
	}
	
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	@Override
	public int tiempoPrestamo() {
		return 10;
	}
		
}
