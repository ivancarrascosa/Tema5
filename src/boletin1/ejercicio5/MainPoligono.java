package boletin1.ejercicio5;

import java.util.Scanner;

public class MainPoligono {

	public static void main(String[] args) {
		int opc;
		PoligonoCrud listaPoligonos = new PoligonoCrud();
		Scanner reader = new Scanner(System.in);
		double lado1;
		double lado2;
		double lado3;
		do {
			mostrarMenu();
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				System.out.println("Introduzca la longitud del lado 1:");
				lado1 = reader.nextInt();
				reader.nextLine();
				System.out.println("Introduzca la longitud del lado 2:");
				lado2 = reader.nextInt();
				reader.nextLine();
				System.out.println("Introduzca la longitud del lado 3:");
				lado3 = reader.nextInt();
				reader.nextLine();
				listaPoligonos.añadir(new Triangulo(lado1, lado2, lado3));
			}
			case 2 -> {
				System.out.println("Introduzca la longitud del lado 1:");
				lado1 = reader.nextInt();
				reader.nextLine();
				System.out.println("Introduzca la longitud del lado 2:");
				lado2 = reader.nextInt();
				reader.nextLine();
				listaPoligonos.añadir(new Rectangulo(lado1, lado2));
			}
			
			case 3 -> {
				listaPoligonos.imprimir();
			}
			
			case 4 -> {
				System.out.println("Saliendo");
			}
			
			default -> {
				System.out.println("Seleccione una opción correcta.");
			}
			}
		} while (opc != 4);
		
		reader.close();
	}
	
	static public void mostrarMenu() {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Introducir triángulo.");
		System.out.println("2. Introducir rectángulo.");
		System.out.println("3. Mostrar polígonos.");
		System.out.println("4. Salir.");
	}
}
