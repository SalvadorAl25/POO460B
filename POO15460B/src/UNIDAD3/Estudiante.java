package UNIDAD3;

public class Estudiante extends Persona
{
	int nm;
	String nc;
	
	public void LecturaE()
	{
		Datos obl=new Datos();
		this.Leer();
		nc=obl.Cadena("No. Ctrl");
		nm=obl.Entero("Numero De Materias");
	}
	public void MostrarE()
	{
		System.out.println("Datos del estudiante...");
		System.out.println();
		System.out.println("No. Ctrl: "+nc);
		System.out.println("No. Materias: "+nm);
		this.Mostrar();
	}
}
