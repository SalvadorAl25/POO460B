package UNIDAD2;

public class ArreasEncadenadas
{
	private double val1, val2, area;
	private Datos obl=new Datos();
	
	public ArreasEncadenadas Base()
	{
		val1=obl.Double("Dame El Valor De La Base");
		return this;
	}
	public ArreasEncadenadas Altura()
	{
		val2=obl.Double("Dame El Valor De La Altura");
		return this;
	}
	public ArreasEncadenadas Radio()
	{
		val1=obl.Double("Dame El Valor Del Radio");
		return this;
	}
	public ArreasEncadenadas Lado()
	{
		val1=obl.Double("Dame El Valor Del Lado");
		return this;
	}
	public ArreasEncadenadas Triangulo()
	{
		area=val1*val2/2;
		return this;
	}
	public ArreasEncadenadas Circulo()
	{
		area=Math.PI*Math.pow(val1, 2);
		return this;
	}
	public ArreasEncadenadas Cuadrado()
	{
		area=Math.pow(val1, 2);
		return this;
	}
	public ArreasEncadenadas Rectangulo()
	{
		area=val1*val2;
		return this;
	}
	public void Mostrar(String figura)
	{
		System.out.println("El Area Del"+figura+" es "+area);
	}
	
}
