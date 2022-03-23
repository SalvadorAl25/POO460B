package UNIDAD5;

public class Vector2
{
	private int ind, vec[];
	private b15460.Datos obd=new b15460.Datos(); 
	private java.util.Random obr=new java.util.Random();
	private Lanzadora obz=new Lanzadora();
	
	public void Tamaño()
	{
		try
		{
			ind=obd.Entero("Dame el tamaño del vector");
			obz.Size(ind);
			vec=new int[ind];
		}
		catch(SizeVectorException e)
		{
			System.out.println(e.getMessage());
			this.Tamaño();
		}
	}
	public void Aleatorio()
	{
		for (ind = 0; ind < vec.length; ind++)
			vec[ind]=obr.nextInt(101);
	}
	
	public void Mostrar()
	{
		System.out.println("Datos del vector...");
		for (ind = 0; ind < vec.length; ind++)
			System.out.println(vec[ind]);
	}
}