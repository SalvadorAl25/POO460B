package UNIDAD4;

public class IRectangulo implements IFigura
{
	private double area, base, altura;
	
	public void Area()
	{
		base=obl.Double("Base...");
		altura=obl.Double("Altura...");
		area=base*altura;
	}
	
	public void Mostrar()
	{
		System.out.println("Area del Rectangulo: "+area);
	}
}
