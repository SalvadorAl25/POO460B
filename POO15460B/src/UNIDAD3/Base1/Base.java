package UNIDAD3.Base1;

public class Base
{
	public void Publico()
	{
		System.out.println("Publico dentro de base...");
	}
	
	@SuppressWarnings("unused")
	private void Privado()
	{
		System.out.println("Privado dentro de base...");
	}
	
	protected void Protegido()
	{
		System.out.println("Protegido dentro de base...");
	}
	
	void Amigable()
	{
		System.out.println("Amigable dentro de base");
	}
}
