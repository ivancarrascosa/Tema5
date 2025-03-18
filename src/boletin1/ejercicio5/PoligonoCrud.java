package boletin1.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class PoligonoCrud {
	private List<Poligono> listaPoligonos = new ArrayList<>();
	
	public void añadir(Poligono poligono) {
		listaPoligonos.add(poligono);
	}
	
	public void imprimir() {
		for (Poligono poligono : listaPoligonos) {
			System.out.print(poligono);
			System.out.println("\tÁrea: " + poligono.area());
		}
	}
}
