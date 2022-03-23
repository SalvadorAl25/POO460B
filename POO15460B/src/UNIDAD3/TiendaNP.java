package UNIDAD3;

/* cuando se tienen constructores en la clase base y en la clase derivada, dichos constructores se pueden ejecutar de manera implicita o explisita
 * es decir autormatica o indicada por el programador, cuand se tienen constructores por defecto la ejecucion es de manera implisita, al crear un objeto de la clase derivada,
 * cuando se tienen constructores alternativos, su ejecucion debe ser explisita para poder determinar, cual es el constructor que se debe ejecutar.
 */

public class TiendaNP
{
	public static void main(String[] args)
	{
		int op, ip=-1, ie=-1, can;
		Producto obp[];
		Empleado obe[];
		Datos obl=new Datos();
		Menu obm=new Menu("Tienda del tec...", new String[]{"Producto", "Empleado", "Mostrar"});
		do
			can=obl.Entero("Cantidad de productos de la tienda");
		while(can<1);
		obp=new Producto[can];
		do
			can=obl.Entero("Cantidad de empleado de la tienda");
		while(can<1);
		obe=new Empleado[can];
		
		do
			switch(op=obm.Opcion())
			{
				case 1: 
					if(ip+1<obp.length)
					{
						obp[++ip]=new Producto();
						obp[ip].Lectura();
					}
					else
						System.out.println("No hay espacio para otros productos");
					break;
				case 2:
					if(ie+1<obe.length)
					{
						obe[++ie]=new Empleado();
						obe[ie].Lectura();
					}
					else
						System.out.println("No hay espacio para otro empleado");
					break;
				case 3:
					if(ip!=-1)
						for(can=0; can<=ip; can++)
							obp[can].Mostrar();
					else
						System.out.println("No hay productos registrados...");
					if(ie!=-1)
						for(can=0; can<=ie; can++)
							obe[can].Mostrar();
					else
						System.out.println("No hay empleados Registrados");
			}
		while(op!=obm.Salir());
	}
}
