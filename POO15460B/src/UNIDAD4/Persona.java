package UNIDAD4;

public class Persona extends DatosP
{
	private String nom, dir, e_m;
	private int nm;
	private Materias obm=new Materias();
	
	public void Lectura()
	{
		nom = obl.Cadena("Nombre");
		dir = obl.Cadena("Dirección");
		e_m = obl.Cadena("e-mail");
		Materias();
	}
	
	public void Mostrar()
	{
		System.out.println("Nombre: "+nom);
		System.out.println("Direccion: "+dir);
		System.out.println("e-mail: "+e_m);
		obm.Mostrar();
	}
	
	private int Materias()
	{
		do
			nm=obl.Entero("Numero De Materias");
		while(nm<1);
		return nm;
	}
}
