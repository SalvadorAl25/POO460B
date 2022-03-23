package UNIDAD4;

public class ICirculo implements IFigura
{
	private double radio, res;
	
	public void Area()
	{
		radio=obl.Double("Radio...");
		res=Math.PI*Math.pow(radio, 2);
	}
	
	public void Mostrar()
	{
		System.out.println("Area del Circulo: "+res);
	}
}
