package UNIDAD3;

public class Trabajador extends Cliente
{
	private double sue;
	private int ant;
	
	public void Sueldo()
	{
		sue=obd.Double("Sueldo: ");
		ant=obd.Entero("AntigŁedad: ");
		System.out.println("Sueldo: "+sue+"\nAntigŁedad: "+ant);
	}
}
