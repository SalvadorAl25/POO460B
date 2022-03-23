package UNIDAD3;

public class Triangulo extends Figura
{
	public Triangulo()
	{
		double base, altura, area;
		base=this.Valor("Base");
		altura=this.Valor("Altura");
		area=base*altura/2;
		this.Mostrar("Triangulo", area);
	}
}
