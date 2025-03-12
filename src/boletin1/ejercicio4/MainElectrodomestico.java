package boletin1.ejercicio4;

import java.util.ArrayList;

public class MainElectrodomestico {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();
		listaElectrodomesticos.add(new Electrodomestico(300,"rojo",'F', 10));
		listaElectrodomesticos.add(new Lavadora(200,"rojo",'F', 10, 10));
		listaElectrodomesticos.add(new Television(500,"rojo",'F', 10, 25, true));
		
		double precioElectrodomesticos = 0;
		double precioLavadoras = 0;
		for (Electrodomestico elec : listaElectrodomesticos) {
			elec.precioFinal();
			System.out.println(elec.getPrecioBase());
			if (elec instanceof Electrodomestico) {
				precioElectrodomesticos += elec.getPrecioBase();
			}
			if (elec instanceof Lavadora) {
				precioLavadoras += elec.getPrecioBase();
			}
		}
		System.out.println(precioElectrodomesticos);
		System.out.println(precioLavadoras);
	}

}
