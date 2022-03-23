package UNIDAD2;

public class Menu3P
{
	public static void main(String[] args)
	{
		int op;
		String titulo="Menu Principal...";
		String opc[]={"Uno", "Dos", "tres", "cuatro", "cinco"};
		Menu obm=new Menu(titulo, opc);
		
		do
			op=obm.Opcion();
		while(op!=obm.Salir());
	}
}
