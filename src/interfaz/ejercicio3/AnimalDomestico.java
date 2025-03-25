package interfaz.ejercicio3;

public abstract class AnimalDomestico implements Animal{
	String nombre = "Default";
	
	String raza = "Default";
	
	Double peso = 5.0;
	
	String color = "Negro";
	
	@Override
	public void comer() {
		System.out.println("ñomñomñom");
		
	}

	@Override
	public void dormir() {
		System.out.println("zzz");
		
	}

	@Override
	public abstract void hacerRuido();
	
	public void vacunar() {
		System.out.println("Vacunado.");
	}
	
	public abstract boolean hacerCaso();
}
