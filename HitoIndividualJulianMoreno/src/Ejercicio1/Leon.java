package Ejercicio1;

public class Leon extends Zoo {
		private String color;
		private int tamaño;
		public Leon(String nombre, int edad) {
			this.color = color;
		}
			public String toString() {
				return "El león " + super.toString() +
					" de color " + this.color + " es "+this.tamaño+" cm de grande";
			}
			public void medida(int num) {
				this.tamaño = this.tamaño+num;
				}
				public void crecer(int i) {
				this.tamaño = this.tamaño+5;
				}
}