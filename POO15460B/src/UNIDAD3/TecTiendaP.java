package UNIDAD3;

public class TecTiendaP
{
	public static void main(String[] args)
	{
		int op, ic = -1, ie = -1, can, clv;
		ClienteT obc[] = null;
		EmpleadoT obe[] = null;
		Datos obl = new Datos();
		Menu obm = new Menu("Tienda Tec", new String[] { "Cantidad", "Cliente", "Empleado", "Mostrar" });

		do
			switch (op = obm.Opcion())
			{
				case 1:
					do
						can = obl.Entero("Cantidad de Clientes...");
					while (can < 1);
					obc = new ClienteT[can];
					do
						can = obl.Entero("Cantidad de Empleados");
					while (can < 1);
					obe = new EmpleadoT[can];
					break;
				case 2:
					if (ic + 1 < obc.length)
					{
						obc[++ic] = new ClienteT();
						obc[ic].Lectura();
					} else
						System.out.println("No hay espacio para mas Clientes");
					break;
				case 3:
					if (ie + 1 < obe.length)
					{
						obe[++ie] = new EmpleadoT();
						obe[ie].Lectura();
					} else
						System.out.println("No hay espacio para mas Empleados");
					break;
				case 4:
					System.out.println("Clientes...");
					if (ic != -1)
						for (can = 0, clv = 1; can <= ic; can++, clv++)
							obc[can].Mostrar(clv);
					else
						System.out.println("No hay Clientes registrados... \n");
					System.out.println("Empleados...");
					if (ie != -1)
						for (can = 0, clv = 1; can <= ie; can++, clv++)
							obe[can].Mostrar(clv);
					else
						System.out.println("No hay Empleados registrados... \n");
			}
		while (op != obm.Salir());
	}
}
