package UNIDAD4;

public class Circulo extends Figura
{
	private double radio, area;
	
	public Circulo()
	{
		radio=obd.Double("Radio");
	}
	
	public void Area()
	{
		area=Math.PI*Math.pow(radio, 2);
	}
	public void Mostrar()
	{
		System.out.println("Area del Circulo: "+area);
	}
}
