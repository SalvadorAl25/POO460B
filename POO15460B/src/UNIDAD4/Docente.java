package UNIDAD4;

public class Docente extends Jefe
{
	private int nf, nr;
	
	public void Lectura(String msj)
	{
		super.Lectura(msj);
		nf=obl.Entero("No. Faltas");
		nr=obl.Entero("No. Retardo");
	}
	
	public void Mostrar()
	{
		System.out.print("\t"+nf+"\t"+nr);
	}
}
