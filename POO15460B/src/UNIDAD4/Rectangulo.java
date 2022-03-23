package UNIDAD4;

public class Rectangulo extends Figura
{
private double base, altura, area;
	
	public Rectangulo()
	{
		base=obd.Double("Base");
		altura=obd.Double("Altura");
	}
	
	public void Area()
	{
		area=base*altura;
	}
	
	public void Mostrar()
	{
		System.out.println("Area del rectangulo: "+area);
	}
}
