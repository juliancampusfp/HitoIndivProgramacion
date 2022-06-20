package Ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Leon zooLeon = new Leon("Leon1" , 60);
		System.out.println(zooLeon.toString());
		zooLeon.crecer(0);
		zooLeon.crecer(10); //modificamos el crecimiento en vez de a 5cm lo ponemos a 10cm
		System.out.println(zooLeon.toString());
	}
}
