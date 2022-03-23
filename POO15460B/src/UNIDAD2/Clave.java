package UNIDAD2;
/* leer una clave en 5 intentos cuando la clave sea la correcta presentar el msj acceso autorizado
 * si la clave  no es la correcta presentar el msj, acceso denegado, solo tiene 5 intentos
 * la clave es el NC propio
 * 
 */
public class Clave
{
	
	public Clave()
	{
		int con=1, clave;
		Datos obl=new Datos();
		do
		{
			clave=obl.Entero("Clave");
			con++;
		}
		while(con<=5 && clave!=15420460);
		this.Mostrar(clave);
	}
	public Clave(int can)
	{
		int con=1, clave;
		Datos obl=new Datos();
		do
		{
			clave=obl.Entero("Clave");
			con++;
		}
		while(con<=can && clave!=15420460);
		this.Mostrar(clave);
	}
	
	private void Mostrar(int clave)
	{
		if(clave==15420460)
			System.out.println("Acceso Autorizado...");
		else
			System.out.println("Acceso Dengado...");
	}
}
