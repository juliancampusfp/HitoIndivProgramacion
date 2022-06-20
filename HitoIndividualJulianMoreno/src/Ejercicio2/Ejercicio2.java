package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("texto.txt");
		Scanner lector = new Scanner(archivo);
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cual es tu nombre para el TEST?");
		String nombre = teclado.nextLine();
	double puntos = 0;
	while (lector.hasNextLine()) {
		String hueco = lector.nextLine();
		Scanner linea = new Scanner(hueco);
		linea.useDelimiter(";");
		String c1 = linea.next();
		String c2 = linea.next();
		String c3 = linea.next();
		String c4 = linea.next();
		String c5 = "";
		
		if(linea.hasNext())
			c5 = linea.next();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		if (teclado.nextLine().equals(c5)) {
			puntos++;
			System.out.println("CORRECTO!! Sumas Puntos :)");
		}else {
			puntos=puntos-0.5;
			System.out.println("INCORRECTO!! Restas puntos :(");
		}
		System.out.println("Respuesta correcta: "+c5);
		System.out.println("______________________________");
	}
	System.out.println(nombre+" Tu puntuación final es de "+puntos);
	lector.close();
	}
}
//En el ejercicio no me coge el txt, al principio si me lo mostraba con las preguntas, pero he dividido los ejercicios en paquetes, he movido el txt y me ha dejado de funcionar.
//Sale el error: texto.txt (El sistema no puede encontrar el archivo especificado)