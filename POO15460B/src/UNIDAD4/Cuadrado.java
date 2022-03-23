package UNIDAD4;

public class Cuadrado extends Figura
{
	private double lado, area;
	
	public Cuadrado()
	{
		lado=obd.Double("Lado");
	}
	
	public void Area()
	{
		area=lado*lado;
	}
	
	public void Mostrar()
	{
		System.out.println("Area del Cuadrado: "+area);
	}
	
}
