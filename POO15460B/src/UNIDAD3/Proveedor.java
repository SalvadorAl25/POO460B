package UNIDAD3;

public class Proveedor extends Cliente
{
	private double cre;
	
	public void Credito()
	{
		cre=obd.Double("Credito: ");
		System.out.println("Credito: "+cre);
	}
	
}
