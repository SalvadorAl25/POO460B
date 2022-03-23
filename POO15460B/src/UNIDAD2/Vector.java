package UNIDAD2;

/* Paso de Parametos
 * Por valor        Copia el valor de un parametro real a un parametro formal si el parametro
 *                  formal se modifica al parametro real no le pasa nada.
 * Por Referencia   copia la direccion de un parametro real a un parametro formal y si el parametro
 * 					se modifica al parametro real le pasa lo mismo.
 * 
 * NOTA				los unicos elementos que pasan por regerencia en java real le pasa lo mismo
 */

import  java.util.Random;
public class Vector
{
	public int tamaño()
	{
		int tam;
		Datos obl=new Datos();
		do
			tam=obl.Entero("Tamaño del Vector");
		while(tam<1);
		return tam;
	}
	
	public void Aleatorio(int vec[])
	{
		Random obr=new Random();
		int ind;
		for (ind = 0; ind < vec.length; ind++)
			vec[ind]=obr.nextInt(100);
	}
	public void Mostrar(int vec[])
	{
		int ind;
		for (ind = 0; ind < vec.length; ind++)
			System.out.println(vec[ind]);
	}
}