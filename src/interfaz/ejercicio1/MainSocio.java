package interfaz.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class MainSocio {

	public static void main(String[] args) {
		ArrayList<Socio> listaSocios = new ArrayList<>();
		listaSocios.add(new Socio(1,"Pepe", 19));
		listaSocios.add(new Socio(3,"Bruh", 20));
		listaSocios.add(new Socio(4,"Momento", 32));
		listaSocios.add(new Socio(2,"Hola", 37));
		
		System.out.println(listaSocios);
		Collections.sort(listaSocios);
		System.out.println(listaSocios);
		listaSocios.sort(new ComparatorEdad());
		System.out.println(listaSocios);
		listaSocios.sort(new comparatorNombre());
		System.out.println(listaSocios);
	}

}
