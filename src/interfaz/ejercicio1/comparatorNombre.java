package interfaz.ejercicio1;

import java.util.Comparator;

public class comparatorNombre implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
