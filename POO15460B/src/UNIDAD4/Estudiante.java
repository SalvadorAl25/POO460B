package UNIDAD4;

public class Estudiante extends Persona
{
	private String nc;
	private int pro;
	
	public void Lectura()
	{
		System.out.println();
		nc=obl.Cadena("No. Ctrl: ");
		super.Lectura();
		pro=obl.Entero("Promedio: ");
	}
	
	public void Mostrar()
	{
		System.out.println("No. Ctrl: "+nc);
		super.Mostrar();
		System.out.println("Promedio: "+pro);
	}
}
