package UNIDAD2;

public class Figura
{
	private double base, altura, radiolado, area;

	public Figura(double radiolado)
	{
		this.radiolado = radiolado;
	}

	public Figura(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}

	private void Mostrar(String nomfig)
	{
		System.out.println("El area del " + nomfig + " es " + area);
	}

	public void Triangulo()
	{
		area = base * altura / 2;
		this.Mostrar("Triangulo");
	}

	public void Rectangulo()
	{
		area = base * altura;
		this.Mostrar("Rectangulo");
	}

	public void Cuadrado()
	{
		area = Math.pow(radiolado, 2);
		this.Mostrar("Cuadrado");
	}

	public void Circulo()
	{
		area = Math.PI * Math.pow(radiolado, 2);
		this.Mostrar("Circulo");
	}
}