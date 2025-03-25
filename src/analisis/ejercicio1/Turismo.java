package analisis.ejercicio1;

public class Turismo extends Vehiculo {
	private enum Uso{
		PROFESIONAL, PARTICULAR
	}
	
	int numeroPlazas = 5;
	
	Uso tipoUso = Uso.PARTICULAR;
	public Turismo(String marca, String modelo, String color, String matrícula) {
		super(marca, modelo, color, matrícula);
	}
	
	public Turismo(String marca, String modelo, String color, String matrícula, int numeroPlazas, String tipoUso) {
		super(marca, modelo, color, matrícula);
		if (numeroPlazas > 0) {
			this.numeroPlazas = numeroPlazas;
		}
		tipoUso = tipoUso.toUpperCase();
		if (comprobarTipoUso(tipoUso)) {
			this.tipoUso = Uso.valueOf(tipoUso);
		}
	}
	
	
	
	
	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public Uso getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		tipoUso = tipoUso.toUpperCase();
		if (comprobarTipoUso(tipoUso)) {
			this.tipoUso = Uso.valueOf(tipoUso);
		}
	}

	private boolean comprobarTipoUso(String tipoUso) {
		boolean res = false;
		switch (tipoUso) {
		case "PARTICULAR", "PROFESIONAL" -> res = true;
		}
		return res; 
	}
}
