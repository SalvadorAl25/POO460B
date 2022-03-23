package UNIDAD3;

public class Rectangulo extends Figura
{
	public Rectangulo()
	{
		double base, altura, area;
		base=this.Valor("Base");
		altura=this.Valor("Altura");
		area=base*altura;
		this.Mostrar("Rectangulo", area);
	}
}
