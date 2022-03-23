package UNIDAD3;

public class Empleado extends Tienda
{
	private String pue;
	private double sue;
	
	public void Lectura()
	{
		System.out.println("\nDatos Del Empleado...");
		Datos obl=new Datos();
		super.Lectura();
		pue=obl.Cadena("Puesto:");
		sue=obl.Double("Sueldo");
	}
	public void Mostrar()
	{
		System.out.println("Datos del Empleado");
		super.Mostrar();
		System.out.println("Puesto: "+pue);
		System.out.println("Sueldo: "+sue);
	}
}
