package UNIDAD3;

public class EmpleadosC extends TiendaC
{
	private String pue;
	private double sue;
	
	public EmpleadosC()
	{
		pue=obl.Cadena("Puesto...");
		sue=obl.Double("Sueldo...");
	}
	public void Mostrar()
	{
		super.Mostrar();
		System.out.print(pue+"\t"+sue);
	}
}
