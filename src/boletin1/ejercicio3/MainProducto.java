package boletin1.ejercicio3;

public class MainProducto {

	public static void main(String[] args) {
		NoPerecedero noP = new NoPerecedero("pez", 3.5, "peces");
		Perecedero P = new Perecedero("Arbol", 2, 1);
		System.out.println(noP.calcular(2));
		System.out.println(noP.getPrecio());
		System.out.println(P.calcular(1));
	}

}
