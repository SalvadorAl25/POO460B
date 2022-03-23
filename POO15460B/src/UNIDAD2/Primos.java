package UNIDAD2;

/*crear un programa que se encarge de buscar y presentar los primeros n numeros primos a partir del numero 1, el metodo de determina la cantidad es publica
 * el metodo que determna la cantidad de numeros es publico, el metodo que determina si el eememtod es primo es privado, el que contrala la cantidad de numeros es publico, el metodo que determina si el elemento es primo es privado,
 * el que controla la cantidad de numeros ees publicvo y el que muestra los numeros primos es privado, ademas crear una clase que contenga el metodo main y que haga uso de la clase que contiene los otros metodos 
 */

public class Primos
{
	public void CantNum()
	{
		int cang, i;
		int vecg[], serie=1;
		Datos obl=new Datos();
		cang=obl.Entero("¿Hasta que numero quieres buscar?");
		vecg=new int[cang];
		for (i=0; i<vecg.length; i++)
		{
			vecg[i]=serie;
			serie++;
		}
		Mostrar(vecg);
	}
	private void Primo(int vecg[])
	{
		int i;
		for (i=0; i<vecg.length; i++)
		{
			if(vecg[i]%2!=0)
					System.out.println(vecg[i]);
		}
	}
	private void Mostrar(int vecg[])
	{
		System.out.println("Vector Generado...");
		for (int i = 0; i < vecg.length; i++)
			System.out.println(vecg[i]);
		System.out.println("Numeros Primos");
		Primo(vecg);
		{
			
		}
	}
}