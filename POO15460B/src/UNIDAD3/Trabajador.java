package UNIDAD3;

public class Trabajador extends Cliente
{
	private double sue;
	private int ant;
	
	public void Sueldo()
	{
		sue=obd.Double("Sueldo: ");
		ant=obd.Entero("Antig�edad: ");
		System.out.println("Sueldo: "+sue+"\nAntig�edad: "+ant);
	}
}
