package UNIDAD3;

public class EstProP
{
	public static void main(String[] args)
	{
		Estudiante obe=new Estudiante();
		Profesor obp=new Profesor();
		
		obe.LecturaE();
		obe.MostrarE();
		System.out.println();
		System.out.println("Datos del profesor...");
		obp.LecturaP();
		obp.MostarP();
	}
}
