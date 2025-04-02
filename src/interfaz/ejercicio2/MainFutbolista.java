package interfaz.ejercicio2;

import java.util.Arrays;

public class MainFutbolista {

	public static void main(String[] args) {
		Futbolista[] listaFutbolistas = new Futbolista[5];
		listaFutbolistas[0] = new Futbolista(34, "pepe", 20,5);
		listaFutbolistas[1] = new Futbolista(4, "aaaa", 23,9);
		listaFutbolistas[2] = new Futbolista(1, "hrfghfg", 53,3);
		listaFutbolistas[3] = new Futbolista(67, "pepfgd", 78,0);
		listaFutbolistas[4] = new Futbolista(34, "kjky", 40,15);
		System.out.println(Arrays.toString(listaFutbolistas));
		Arrays.sort(listaFutbolistas);
		System.out.println(Arrays.toString(listaFutbolistas));
		Arrays.sort(listaFutbolistas, new ComparatorEdad());
		System.out.println(Arrays.toString(listaFutbolistas));
		Arrays.sort(listaFutbolistas, new ComparatorGoles());
		System.out.println(Arrays.toString(listaFutbolistas));
		
	}

}
