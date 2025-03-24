package interfaz.ejercicio3;

public abstract class AnimalDomestico implements Animal{

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
