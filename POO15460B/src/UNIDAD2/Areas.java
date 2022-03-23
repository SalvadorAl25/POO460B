package UNIDAD2;
/*				1.- [void Metodo()]
 * 				2.- [void Metodo(args)]
 * prototipos 	3.- [Tipo Metodo()]
 * 				4.- [Tipo Metodo(args)]
 */
public class Areas
{
	private double val1, val2, area;
	private Datos obl=new Datos(); 
	
	private void BaseAltura()
	{
		val1=obl.Double("Dame El Valor de la Base");
		val2=obl.Double("Dame El Valor de la Altura");
	}
	private void RadioLado()
	{
		val1=obl.Double("Valor del radio o lado");
	}
	public void Area()
	{
		System.out.println("El Area es "+area);
	}
	public void Triangulo()
	{
		this.BaseAltura();
		area=val1*val2/2;
		this.Area();
	}
	public void Circulo()
	{
		this.RadioLado();
		area=Math.PI*Math.pow(val1, 2);
		this.Area();
	}
	public void Cuadrado()
	{
		this.RadioLado();
		area=Math.pow(val1, 2);
		this.Area();
	}
	public void Rectangulo()
	{
		this.BaseAltura();
		area=val1*val2;
		this.Area();
	}
}