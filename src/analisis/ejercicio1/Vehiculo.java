package analisis.ejercicio1;

/**
 * Clase que almacena vehículos con su informacion además de un metodo para
 * acelerar durante un tiempo y después desacelerar y parar el motor
 */
public class Vehiculo {
	/**
	 * Marca del vehículo, por defecto Default
	 */
	protected String marca = "Default";
	/**
	 * Modelo del vehículo, por defecto Default
	 */
	protected String modelo = "Default";
	/**
	 * Color del vehículo, por defecto Default
	 */
	protected String color = "Default";
	/**
	 * Matrícula del vehículo, por defecto Default
	 */
	protected String matrícula = "Default";
	/**
	 * Estado del motor, por defecto apagado
	 */
	protected boolean motorEncendido = false;
	/**
	 * Marcha, que por defecto será 0, punto muerto
	 */
	protected int marcha = 0;
	/**
	 * Velocidad queserá 0 por defecto, el coche estará parado
	 */
	protected int velocidad = 0;

	/**
	 * Constructor para poner marca, modelo, color y matrícula del coche
	 * 
	 * @param marca     marca del coche
	 * @param modelo    modelo del coche
	 * @param color     color del coche
	 * @param matrícula matrícula del coche
	 */
	public Vehiculo(String marca, String modelo, String color, String matrícula) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
		if (matrícula != null && !matrícula.isBlank()) {
			this.matrícula = matrícula;
		}
	}

	/**
	 * Getter para la marca del coche
	 * 
	 * @return marca del coche
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Getter para el modelo del coche
	 * 
	 * @return modelo del coche
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Getter para el color del coche
	 * 
	 * @return color del coche
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter para el color del coche
	 * 
	 * @param color color que le queremos poner al coche
	 */
	public void setColor(String color) {
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	/**
	 * Getter para la matrícula del coche
	 * 
	 * @return matrícula del coche
	 */
	public String getMatrícula() {
		return matrícula;
	}

	/**
	 * is para saber si el motor está encendido
	 * 
	 * @return estado del motor
	 */
	public boolean isMotorEncendido() {
		return motorEncendido;
	}

	/**
	 * Setter para el estado del motor
	 * 
	 * @param motorEncendido estado que queremos asignarle al motor
	 */
	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}

	/**
	 * Getter para la marcha
	 * 
	 * @return marcha del vehículo
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * Setter para la marcha
	 * 
	 * @param marcha marcha que le queremos poner al vehículo
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	/**
	 * Getter para la velocidad del coche
	 * 
	 * @return velocidad del coche
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * setter para la velocidad del vehículo
	 * 
	 * @param velocidad que le queremos poner al vehículo
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * Método para para el vehículo, es decir, que su velocidad sea 0 y esté en
	 * punto muerto (0)
	 */
	public void Parar() {
		this.velocidad = 0;
		this.marcha = 0;
	}

	/**
	 * Método para arrancar el coche (poner a true motorencendido)
	 */
	public void arrancar() {
		this.motorEncendido = true;
	}

	/**
	 * Método para subir marcha
	 */
	public void subirMarcha() {
		if (this.marcha < 5) {
			this.marcha++;
		}
	}

	/**
	 * Método pars bajar marcha
	 */
	public void bajarMarcha() {
		if (this.marcha > 1) {
			this.marcha--;
		}
	}

	/**
	 * Método para acelerar el coche a una velocidad a la cual se mantendrá un
	 * tiempo, después bajará a 0km/h, se pondrá en punto muerto y se apagará el
	 * motor
	 * 
	 * @param velocidad a la que queremos que se ponga el coche
	 * @param tiempo    tiempo en segundos que queremos que permanezca a esa
	 *                  velocidad
	 * @return true si el coche estaba encendido al principio y se ha podido
	 *         acelerar, false si estaba apagado
	 */
	public boolean acelerar(int velocidad, int tiempo) {
		// Primero se comprueba que el motor esté encendido, lo guardamos en una
		// variable porque lo pararemos al final
		boolean res = this.motorEncendido;
		if (res) {
			while (this.velocidad < velocidad) {
				cambiarMarcha();
				// Antes de subir de velocidad dejamos 0,1s con la velocidad actual antes de
				// volver a subirla
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { // Por si el hilo es interrumpido antes o mientras se ejecuta la
													// linea de
													// código
					e.printStackTrace();
				}
				this.velocidad++;

			}
			// Una vez llegamos a la velocidad que ha pedido el usuario dejamos esa
			// velocidad el tiempo que nos ha pedido
			mantenerVelocidad(tiempo * 1000);
			// Una vez mantenida la velocidad el tiempo que nos ha pedido el usuario (que
			// será en segundos y nosotros lo pasamos a milisegundos tenemos que hacer que
			// el coche decelere
			while (this.velocidad > 0) {
				cambiarMarcha();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.velocidad--;
			}
			this.marcha = 0;
			this.motorEncendido = false;
		}
		return res;
	}

	/**
	 * Método para cambiar la marcha dependiendo de la velocidad
	 */
	private void cambiarMarcha() {
		if (this.velocidad < 30) {
			this.marcha = 1;
		} else if (this.velocidad < 50) {
			this.marcha = 2;
		} else if (this.velocidad < 70) {
			this.marcha = 3;
		} else if (this.velocidad < 100) {
			this.marcha = 4;
		} else {
			this.marcha = 5;
		}
	}

	/**
	 * Método para mantenr la velocidad
	 * 
	 * @param tiempo tiempo en milisegundos que queremos mantener la velocidad
	 */
	private void mantenerVelocidad(int tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
