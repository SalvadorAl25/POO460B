package UNIDAD2;

public class Menu2P
{
	public static void main(String[] args)
	{
		int op;
		Datos obl=new Datos();
		do
			op=obl.Entero("Cantidad de Opciones");
		while(op<1);
		Menu obm=new Menu(op);
		do
			op=obm.Opcion();
		while(op!=obm.Salir());
	}
}
