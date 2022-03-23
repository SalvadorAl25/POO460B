package UNIDAD3;

public class Trabajador extends Cliente
{
	private double sue;
	private int ant;
	
	public void Sueldo()
	{
		sue=obd.Double("Sueldo: ");
		ant=obd.Entero("Antigüedad: ");
		System.out.println("Sueldo: "+sue+"\nAntigüedad: "+ant);
	}
}
