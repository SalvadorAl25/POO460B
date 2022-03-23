package UNIDAD4;

public class Jefe implements Interface
{
	private int nt;
	private String nom, dep;

	public void Lectura(String msj)
	{
		System.out.println("Datos del " + msj);
		nt = obl.Entero("No. Targeta");
		nom = obl.Cadena("Nombre");
		dep = obl.Cadena("Departamento");
	}

	public void Mostrar()
	{
		System.out.print(nt + "\t" + nom + "\t" + dep);
	}
}