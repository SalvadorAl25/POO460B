package UNIDAD2;

public class Sobrecarga
{	
	public Sobrecarga(int num1, int num2)
	{
		this.Mostrar(this.Suma(num1, num2));
	}
	
	public Sobrecarga(String cad1, String cad2)
	{
		this.Mostrar(this.Suma(cad1, cad2));
	}
	
	private int Suma(int num1, int num2)
	{
		return num1+num2;
	}
	private String Suma(String cad1, String cad2)
	{
		return cad1+cad2;
	}
	private void Mostrar(int val)
	{
		System.out.println("Suma de enteros..."+val);
	}
	private void Mostrar(String cad)
	{
		System.out.println("La concatenacion es "+cad);
	}
}
