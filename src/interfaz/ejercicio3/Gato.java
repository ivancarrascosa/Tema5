package interfaz.ejercicio3;

public class Gato extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("Miau");
		
	}

	@Override
	public boolean hacerCaso() {
		return Math.random() >= 0.95;
	}
	
	public void toserBolaPelo() {
		System.out.println("Blergh");
	}

}
