package UNIDAD4;

public class TiendaP
{
	public static void main(String[] args)
	{
		int op, ic=-1, ip=-1, it=-1, x;
		String msj;
		String om[]={"Cliente", "Proveedor", "Trabajador", "Mostrar"};
		Menu obm=new Menu("Menu de Tienda ",om);
		Datos obl=new Datos();
		Cliente ac[];
		Trabajador at[];
		Proveedor ap[];
		Tienda ref;
		
		do
			x=obl.Entero("Cantidad");
		while(x<1);
		ac=new Cliente[x];
		at=new Trabajador[x];
		ap=new Proveedor[x];
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					if(ic+1<ac.length)
					{
						ac[++ic]=new Cliente();
						ref=ac[ic];
						x=ic;
						ref.Lectura(x, om[op-1]);
					}
					else
						System.out.println("No hay espacio");
					break;
				case 2:
					if(ip+1<ap.length)
					{
						ap[++ip]=new Proveedor();
						ref=ap[ip];
						x=ip;
						ref.Lectura(x, om[op-1]);
					}
					else
						System.out.println("No hay espacio");
				case 3:
					if(it+1<at.length)
					{
						at[++it]=new Trabajador();
						ref=at[it];
						x=it;
						ref.Lectura(x, om[op-1]);
					}
					else
						System.out.println("No hay espacio");
				case 4:
					if(ic!=-1)
					{
						msj=om[op-4];
						for(x=0; x<=ic; x++)
						{
							ref=ac[x];
							ref.Mostrar(msj);
						}
					}
					if(ip!=-1)
					{
						msj=om[op-3];
						for(x=0; x<=ip; x++)
						{
							ref=ap[x];
							ref.Mostrar(msj);
						}
					}
					if(it!=-1)
					{
						msj=om[op-2];
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
