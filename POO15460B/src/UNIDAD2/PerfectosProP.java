package UNIDAD2;

public class PerfectosProP
{
	public static void main(String[] args)
	{
		PerfectosPro obpp=new PerfectosPro();
		Datos obl=new Datos();
		int can;
		do
			can=obl.Entero("Cantidad de numeros");
		while(can<1);
		obpp.Cantidad(can);
		obpp.Control();
	}
}
