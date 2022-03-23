package UNIDAD3;

public class TBaseP
{
	public static void main(String[] args)
	{
		int op, ic=-1, ie=-1, can;
		Datos obd=new Datos();
		TCliente obc[]=null;
		TEmpleado obe[]=null;
		Menu obm=new Menu("Tarea uno...", new String[]{"Cantidad", "Cliente", "Empleado", "Mostrar"});
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					do
						can=obd.Entero("Cantidad de clientes");
					while(can<1);
					obc=new TCliente[can];
					ic=-1;
					do
						can=obd.Entero("Cantidad de empleados");
					while(can<1);
					obe=new TEmpleado[can];
					ie=-1;
					break;
				case 2:
					//if(obc instanceof TCliente[])
					if(obc!=null)
						if(ic+1<obc.length)
						{
							obc[++ic]=new TCliente();
							obc[ic].Lectura(ic+1);
						}
						else
							System.out.println("No hay espacio");
					else
						System.out.println("Entre la opcion uno...");
					break;
				case 3:
					if(obe!=null)
						if(ie+1<obe.length)
						{
							obe[++ie]=new TEmpleado();
							obe[ie].Lectura(ie+1);
						}
						else
							System.out.println("No hay espacio");
					else
						System.out.println("Entre la opcion uno...");
					break;
				case 4:
					if(ic!=-1)
					{
						System.out.println("\nDatos de los clientes");
						for(can=0; can<=ic; can++)
							obc[can].Mostrar();
					}
					if(ie!=-1)
					{
						System.out.println("\nDatos de los clientes");
						for(can=0; can<=ie; can++)
							obe[can].Mostrar();
					}
			}
		while(op!=obm.Salir());
	}
}