package centro;

public class Alumno extends Persona {
	
	public Alumno(String dni, String nombre, String apellidos) {
		super(dni, nombre, apellidos);
		// TODO Auto-generated constructor stub
	}

	private int Num_Matricula;
	private int T1;
	private int T2;
	private int T3;
	public int getNum_Matricula() {
		return Num_Matricula;
	}
	public void setNum_Matricula(int num_Matricula) {
		Num_Matricula = num_Matricula;
	}
	public int getT1() {
		return T1;
	}
	public void setT1(int t1) {
		T1 = t1;		
	}
	public int getT2() {
		return T2;
	}
	public void setT2(int t2) {
		T2 = t2;
	}
	public int getT3() {
		return T3;
	}
	public void setT3(int t3) {
		T3 = t3;
	}
	public Alumno(String dni, String nombre, String apellidos, int num_Matricula, int t1, int t2, int t3) {
		super(dni, nombre, apellidos);
		Num_Matricula = num_Matricula;
		T1 = t1;
		T2 = t2;
		T3 = t3;
	}
	@Override
	public String toString() {
		return "ESTA ES LA SOBREESCRITURA ";
	}
	
	public String media(int notas) {
		
		double notaMedia = notas/3;
		String result="";
		
		if (notaMedia>=5) {
			result="Aprobado";
			
		}else {
			result="Suspenso";
		}
		
		return result;
	}
	

}
