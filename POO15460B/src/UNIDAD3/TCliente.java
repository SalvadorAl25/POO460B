package UNIDAD3;

public class TCliente extends TBase
{
	private double deu;
	private String fec;
	
	public void Lectura(int clv)
	{
		super.Lectura(clv);
		deu=obd.Double("Deuda");
		fec=obd.Cadena("Fecha");
	}
	
	public void Mostrar()
	{
		super.Mostrar();
		System.out.println("Deuda: "+deu);
		System.out.println("Fecha: "+fec);
	}
}
