package UNIDAD3;

public class Cuadrado extends Figura
{
	public Cuadrado()
	{
		double lado, area;
		lado = this.Valor("Lado");
		area = Math.pow(lado, 2);
		this.Mostrar("Cuadrado", area);
	}
}
