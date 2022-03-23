package UNIDAD3;

public class TBase
{
	private int clv;
	private String nom;
	public Datos obd=new Datos();
	
	public void Lectura(int clv)
	{
		this.clv=clv;
		System.out.println("Clave "+clv);
		nom=obd.Cadena("Nombre");
	}
	
	public void Mostrar()
	{
		System.out.println("Clave "+clv);
		System.out.println("Nombre "+nom);
	}
}
