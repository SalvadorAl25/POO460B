package UNIDAD5;

/*
 * crear una excepcion de manera directa encargada de validar la lectura de una calificacion, en donde las calificaciones validas pueden ser NA o de 7 a 100
 */

public class NameP
{
	public static void main(String[] args)
	{
		String nom;
		Datos obd=new Datos();
		Lanzadora obz=new Lanzadora();
		
		try
		{
			nom=obd.Cadena("Dame el nombre");
			obz.Nombre(nom);
			System.out.println("Nombre incorrecto...");
		}
		catch(NameExcepcion e)
		{
			System.out.println("\t"+e.getMessage());
			main(args);
		}
	}
}
