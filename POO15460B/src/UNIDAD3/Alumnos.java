package UNIDAD3;

public class Alumnos extends Escuela
{
	private String nc;
	private int nm;
	
	public void Lectura()
	{
		super.Lectura();
		nc=obl.Cadena("No. Ctrl: ");
		nm=obl.Entero("Numero De Materias: ");
	}
	
	public void Mostrar()
	{
		super.Mostrar();
		System.out.print("\t"+nc+"\t"+nm);
	}	
}