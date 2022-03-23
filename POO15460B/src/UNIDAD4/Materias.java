package UNIDAD4;

public class Materias implements DatosM
{
	private int ind, clv[];
	private String nomb, nom[];
	
	public void Lectura(int nm)
	{
		clv=new int[nm];
		for (ind = 0; ind < clv.length; ind++)
			clv[ind]=ind+1;
		nom=new String[nm];
		for (ind = 0; ind < nom.length; ind++)
		{
			nomb=obl.Cadena("Nombre De La Materia: ");
			nom[ind]=nomb;
			nomb="";
		}
	}
	
	public void Mostrar()
	{
		for (ind = 0; ind < clv.length; ind++)
			for (ind = 0; ind < nom.length; ind++)
			{
				System.out.println("Clave: "+clv[ind]);
				System.out.println("Nombre de la Materia: "+nom[ind]);
			}
	}
}