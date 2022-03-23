package UNIDAD4;

public class ITrabajador extends ICliente implements ITienda2
{
	private double sue;
	private int ant;
	
	public void Lectura(int clv, String msj)
	{
		super.Lectura(clv, msj);
		sue=obl.Double("Sueldo");
		ant=obl.Entero("Antigüedad");
	}
	
	public void Mostrar(String msj)
	{
		super.Mostrar(msj);
		System.out.print("\t"+sue+"\t"+ant);
	}
}