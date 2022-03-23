package UNIDAD4;

public class InterfaceP
{
	public static void main(String[] args)
	{
		int op, ij=-1, id=-1, x;
		String om[]={"Docente", "Jefe"};
		Datos obl=new Datos();
		Interface ref;
		Jefe aj[];
		Docente ad[];
		Menu obm=new Menu("Menu ITJ ", om);
		
		do
			x=obl.Entero("Cantidad de Jefes");
		while(x<1);
		aj=new Jefe[x];
		do
			x=obl.Entero("Cantidad de Docentes");
		while(x<1);
		ad=new Docente[x];
		
		do
		{
			switch(op=obm.Opcion())
			{
				case 1:
					if(ij+1<aj.length)
					{
						ref=aj[++ij]=new Jefe();
						ref.Lectura(om[op-1]);
					}
					else
						System.out.println("No hay espacio...");
					System.out.println("\nLista de Jefes...");
					for(x=0; x<=ij; x++)
					{
						ref=aj[x];
						ref.Mostrar();
						System.out.println();
					}
					break;
				case 2:
					if(id+1<aj.length)
					{
						ref=ad[++id]=new Docente();
						ref.Lectura(om[op-1]);
					}
					else
						System.out.println("No hay espacio...");
					System.out.println("\nLista de Docentes...");
					for(x=0; x<=id; x++)
					{
						ref=ad[x];
						ref.Mostrar();
					}
			}
		}
		while(op!=obm.Salir());
		
	}
}
