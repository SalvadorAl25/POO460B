package UNIDAD3;

public class TiendaC
{
	private int clv;
	private String nom;
	public Datos obl=new Datos();
	
	public TiendaC()
	{
		clv=obl.Entero("Clave....");
		nom=obl.Cadena("Nombre...");
	}
	
	public void Mostrar()
	{
		System.out.println(clv+"\t"+nom+"\t");
	}
}
