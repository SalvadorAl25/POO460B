package UNIDAD4;

public class ITiendaP
{
	public static void main(String[] args)
	{
	int op, ic=-1, ip=-1, it=-1, can, x;
		String msj, om[]={"Cliente", "Proovedor", "Trabajador", "Mostrar"};
		Menu obm=new Menu("Tienda con Interfaces", om);
		Datos obl=new Datos();
		ICliente ac[]=null;
		IProveedor ap[]=null;
		ITrabajador at[]=null;
		ITienda2 ref;
		
		do
			can=obl.Entero("Cantidad");
		while(can<1);
		ac=new ICliente[can];
		ap=new IProveedor[can];
		at=new ITrabajador[can];
		
		do
			
			switch(op=obm.Opcion())
			{
				case 1:
					if(ic+1<ac.length)
					{
						ref=ac[++ic]=new ICliente();
						x=ic+1;
						ref.Lectura(x, om[op-1]);
					}
					else
						System.out.println("No hay espacio...");
					break;
				case 2:
					if(ip+1<ac.length)
					{
						ref=ap[++ip]=new IProveedor();
						x=ip+1;
						ref.Lectura(x, om[op-1]);
					}
					else
						System.out.println("No hay espacio...");
					break;
				case 3:
					if(it+1<ac.length)
					{
						ref=at[++it]=new ITrabajador();
						x=it+1;
						ref.Lectura(x, om[op-1]);
					}
					else
						System.out.println("No hay espacio...");
					break;
				case 4:
					if(ic!=-1)
					{
						msj=om[0];
						for(x=0; x<=ic; x++)
						{
							ref=ac[x];
							ref.Mostrar(msj);
						}
					}
					if(ip!=-1)
					{
						msj=om[1];
						for(x=0; x<=ip; x++)
						{
							ref=ap[x];
							ref.Mostrar(msj);
						}
					}
					if(it!=-1)
					{
						msj=om[2];
						for(x=0; x<=it; x++)
						{
							ref=at[x];
							ref.Mostrar(msj);
						}
					}
			}
		while(op!=obm.Salir());
	}
}