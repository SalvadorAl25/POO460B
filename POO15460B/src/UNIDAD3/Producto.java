package UNIDAD3;

public class Producto extends Tienda
{
	private int exi;
	private double pres;
	
	public void Lectura()
	{
		System.out.println("Datos del producto...");
		Datos obl=new Datos();
		super.Lectura();
		exi=obl.Entero("Existencias");
		pres=obl.Double("Precio");
	}
	public void Mostrar()
	{
		System.out.println("Datos Del Producto");
		super.Mostrar();
		System.out.println("Existencias: "+exi);
		System.out.println("precio: "+pres);
	}
}
