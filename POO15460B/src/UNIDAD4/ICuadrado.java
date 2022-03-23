package UNIDAD4;

public class ICuadrado implements IFigura
{
	private int lado, res;
	
	public void Area()
	{
		lado=obl.Entero("Lado");
		res=lado*lado;
	}
	
	public void Mostrar()
	{
		System.out.println("Area del Cuadrado: "+res);
	}
}
