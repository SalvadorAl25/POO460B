package UNIDAD4;

public class Triangulo extends Figura
{
	private double base, altura, area;
	
	public Triangulo()
	{
		base=obd.Double("Base");
		altura=obd.Double("Altura");
	}
	
	public void Area()
	{
		area=base*altura/2;
	}
	
	public void Mostrar()
	{
		System.out.println("Area del triangulo: "+area);
	}
}