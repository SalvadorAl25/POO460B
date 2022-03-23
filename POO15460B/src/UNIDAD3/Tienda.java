package UNIDAD3;

public class Tienda
{
	private String clv, nom;
	private Datos obl=new Datos();
	
	public void Lectura()
	{
		clv=obl.Cadena("Clave: ");
		nom=obl.Cadena("Nombre: ");
	}
	public void Mostrar()
	{
		System.out.println("Clave: "+clv);
		System.out.println("Nombre: "+nom);
	}
}
