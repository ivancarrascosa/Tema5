package boletin1.ejercicio1;

public class HoraExacta extends Hora {
	private int segundos = 0;
	
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean res = segundos >= 0 && segundos <= 59;
		if (res) {
			this.segundos = segundos;
		}
		return res;
	}
	
	public void inc() {
		segundos++;
		if (segundos == 60) {
			segundos = 0;
			super.inc();
		}
		
	}

	@Override
	public String toString() {
		String res = "";
		res = super.toString();
		if (segundos < 10) {
			res += ":0" + segundos;
		} else {
			res += ":" + segundos;
		}
		return res;
	}
	
	
	
	

}
