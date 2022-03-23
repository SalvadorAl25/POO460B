package UNIDAD3;

public class Profesor extends Persona
{
	int tg;
	double sue;
	
	public void LecturaP()
	{
		Datos obl=new Datos();
		tg=obl.Entero("No. Targeta");
		sue=obl.Double("Sueldo");
		this.Leer();
	}
	public void MostarP()
	{
		System.out.println("Datos del Profesor");
		System.out.println();
		System.out.println("No. Targeta: "+tg);
		System.out.println("Sueldo: "+sue);
		this.Mostrar();
	}
}