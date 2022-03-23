package UNIDAD3;

public class Circulo extends Figura
{
	public Circulo()
	{
		double radio, area;
		radio = this.Valor("Radio");
		area = Math.PI * Math.pow(radio, 2);
		this.Mostrar("Circulo", area);

	}
}
