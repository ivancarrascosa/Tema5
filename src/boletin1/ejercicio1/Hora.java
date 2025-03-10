package boletin1.ejercicio1;

public class Hora {
	
	private int hora = 0;
	private int minutos = 0;
	
	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}
	
	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {
		boolean res = hora >= 0 && hora <= 23;
		if (res) {
			this.hora = hora;
		}
		return res;	
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean setMinutos(int minutos) {
		boolean res = minutos >= 0 && minutos <= 59;
		if (res) {
			this.minutos = minutos;
		}
		return res;
	}
	
	public void inc() {
		minutos++;
		if (minutos == 60) {
			minutos = 0;
			hora++;
			if (hora == 24) {
				hora = 0;
			}
		}
	}

	@Override
	public String toString() {
		String res = "";
		if (this.hora < 10) {
			res += "0" + hora + ":";
		} else {
			res += hora + ":";
		}
		if (this.minutos < 10) {
			res+= "0" + minutos;
		} else {
			res += minutos;
		}
		return res;
	}
	
	
	
}
