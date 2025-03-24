package interfaz.ejercicio3;

public class Perro extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("guau");
		
	}

	@Override
	public boolean hacerCaso() {
		return Math.random() <= 0.9;
		
	}
	
	public void sacarPaseo() {
		System.out.println("Me sacan de paseo ole ole");
	}

}
