package centro;

import java.util.ArrayList;

public class Curso extends Alumno {
	
	public Curso(String dni, String nombre, String apellidos) {
		super(dni, nombre, apellidos);
		// TODO Auto-generated constructor stub
	}
	private String nombreCurso;
	private String fecha;
	private int idcurso;
	
	private ArrayList<Alumno>matriculas;
	
	public Curso(String dni, String nombre, String apellidos, int num_Matricula, int t1, int t2, int t3,
			String nombreCurso, String fecha) {
		super(dni, nombre, apellidos, num_Matricula, t1, t2, t3);
		this.nombreCurso = nombreCurso;
		this.fecha = fecha;
		this.matriculas = new ArrayList<Alumno>();
	}
	
	
	
	
	
	

}
