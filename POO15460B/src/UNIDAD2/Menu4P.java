package UNIDAD2;

public class Menu4P
{
	public static void main(String[] args)
	{
		int op;
		Menu obm=new Menu("Menu Principal...", 
				new String[]{"uno", "dos", "tres", "cuatro"});
		
		do
			op=obm.Opcion();
		while(op!=obm.Salir());
	}
}
