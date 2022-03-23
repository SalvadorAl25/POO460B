package UNIDAD2;

public class Menu1P
{
	public static void main(String[] args)
	{
		int op;
		Menu obm=new Menu();
		do
			op=obm.Opcion();
		while(op!=obm.Salir());
	}
}
