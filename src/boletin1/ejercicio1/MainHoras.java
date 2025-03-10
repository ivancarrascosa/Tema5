package boletin1.ejercicio1;

public class MainHoras {

	public static void main(String[] args) {
		Hora h1 = new Hora(1,2);
		HoraExacta h2 = new HoraExacta(23, 59, 59);
		h1.inc();
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);

	}

}
