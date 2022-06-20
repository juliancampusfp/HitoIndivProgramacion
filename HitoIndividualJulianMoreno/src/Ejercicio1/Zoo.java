package Ejercicio1;

public class Zoo {
	private String nombre;
	private int edad;
	public void Leon(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString() {
	return this.nombre + " - " + this.edad;
	}
}