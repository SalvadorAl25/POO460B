package UNIDAD3;

public class ProductoC extends TiendaC
{
	private int exi;
	private double pre;
	public ProductoC()
	{
		exi=obl.Entero("Existencia..");
		pre=obl.Double("Precio......");
	}
	
	public void Mostrar()
	{
		super.Mostrar();
		System.out.print(exi+"\t"+pre);
	}
}