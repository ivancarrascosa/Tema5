package comparator.numerosDecrecientes;

import java.util.ArrayList;
import java.util.Random;

public class MainNumerosDecrecientes {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		Random rand = new Random();
		
		int numero;
		
		for (int i = 0 ; i < 100 ; i++) {
			numero = rand.nextInt(1,101);
			listaNumeros.add(numero);
		}
		System.out.println(listaNumeros);
		listaNumeros.sort((Integer a, Integer b) -> b - a);
		System.out.println(listaNumeros);	
	}

}
