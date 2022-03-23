package UNIDAD3;

public class TiendaCP
{
	public static void main(String[] args)
	{
		int op, ip=-1, ie=-1, can;
		ProductoC obp[]=null;
		EmpleadosC obe[]=null;
		Menu obm=new Menu("Tienda Constructores", new String[]{"Producto", "Empleado", "Mostrar"});
		Datos obl=new Datos();
		
		do
			can=obl.Entero("Cantidad de productos");
		while(can<1);
		obp=new ProductoC[can];
		do
			can=obl.Entero("Cantidad de empleados");
		while(can<1);
		obe=new EmpleadosC[can];
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					if(ip+1<obp.length)
						obp[++ip]=new ProductoC();
					else
						System.out.println("Ya no hay espacio para otro producto...");
					break;
				case 2:
					if(ie+1<obe.length)
						obe[++ie]=new EmpleadosC();
					else
						System.out.println("No hay espacio para otro empleado...");
					break;
				case 3:
					if(ip!=-1)
					{
						System.out.println("Lista de productos...");
						for(can=0; can<=ip; can++)
							obp[can].Mostrar();
					}
					else
						System.out.println("No hay productos registrados...");
					System.out.println();
					if(ie!=-1)
					{
						System.out.println("Lista de Empleados...");
						for(can=0; can<=ie; can++)
							obe[can].Mostrar();
					}
					else
						System.out.println("No hay empleados registrados...");
			}
		while(op!=obm.Salir());
	}
}