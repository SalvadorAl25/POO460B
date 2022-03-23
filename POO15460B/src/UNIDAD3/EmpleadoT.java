package UNIDAD3;

public class EmpleadoT extends TecTienda
{
	private double sue;

	public void Lectura()
	{
		super.Lectura();
		sue = obl.Double("Sueldo...");
	}

	public void Mostrar(int clv)
	{
		super.Mostrar(clv);
		System.out.println("Sueldo: " + sue + "\n");
	}
}
