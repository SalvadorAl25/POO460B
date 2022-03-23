package UNIDAD4;

public class Profesor extends Persona
{
	private int nt;
	private double sue;

	public void Lectura()
	{
		System.out.println("Datos del Profesor");
		nt = obl.Entero("No.Tarjeta: ");
		super.Lectura();
		sue = obl.Double("Sueldo:");
	}

	public void Mostrar()
	{
		super.Mostrar();
		System.out.println("Sueldo: "+sue);
		System.out.println("Numero De Targeta: "+nt);
	}
}