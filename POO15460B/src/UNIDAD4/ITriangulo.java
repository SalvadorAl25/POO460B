package UNIDAD4;

public class ITriangulo implements IFigura
{
	private double area, base, altura;
	
	public void Area()
	{
		base=obl.Double("base...");
		altura=obl.Double("altura...");
		area=base*altura/2;
	}
	
	public void Mostrar()
	{
		System.out.println("Area del Triangulo..."+area);
	}
}
