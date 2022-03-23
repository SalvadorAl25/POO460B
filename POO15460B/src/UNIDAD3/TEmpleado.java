package UNIDAD3;

public class TEmpleado extends TBase
{
	private double sue;
	
	public void Lectura(int clv)
	{
		super.Lectura(clv);
		sue=obd.Double("Sueldo");
	}
	
	public void Mostrar()
	{
		super.Mostrar();
		System.out.println("Sueldo "+sue);
	}
}
