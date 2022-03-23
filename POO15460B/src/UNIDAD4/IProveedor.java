package UNIDAD4;

public class IProveedor implements ITienda2
{
	//en las interfaces por omicion o por "Default", los metodos son abstractos...
	
	private double cre;
	private ICliente obc=new ICliente();
	
	public void Lectura(int clv, String msj)
	{
		obc.Lectura(clv, msj);
		cre=obl.Double("Credito");
	}
	
	public void Mostrar(String msj)
	{
		obc.Mostrar(msj);
		System.out.print("\t"+cre);
	}
}
