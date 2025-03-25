package analisis.ejercicio1;

public class Camion extends Vehiculo {

	int pesoAutorizado = 3500;
	boolean mercanciaPeligrosa = false;

	public Camion(String marca, String modelo, String color, String matrícula) {
		super(marca, modelo, color, matrícula);
		// TODO Auto-generated constructor stub
	}

	public Camion(String marca, String modelo, String color, String matrícula, int pesoAutorizado,
			boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matrícula);
		if (pesoAutorizado > 0) {
			this.pesoAutorizado = pesoAutorizado;
		}
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	public int getPesoAutorizado() {
		return pesoAutorizado;
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	
}
