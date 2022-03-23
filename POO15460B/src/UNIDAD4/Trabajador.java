package UNIDAD4;

/* 
 * Esta Clase no esta obligada a utilizar los metodos, y utiliza la clase abstracta de manera indirecta...
 */
public class Trabajador extends Cliente //<-------- por esto no usa la clase abstracta directamente
{
	private double sue;
	private int ant;

	public void Lectura(int clv, String msj)
	{
		super.Lectura(clv, msj);
		sue = obl.Double("Sueldo: ");
		ant = obl.Entero("Antigüedad: ");
	}

	public void Mostrar(String msj)
	{
		super.Mostrar(msj);
		System.out.print("\t" + sue + "\t" + ant);
	}
}
