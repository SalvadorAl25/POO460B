package UNIDAD5;

import java.util.*;
import b15460.Datos;

/* crear un vector de tama�o N llenarlo de numeros aleatorios[tiene un ciclo infinito]
 * Mostrarlo desde un Ciclo infinito
 */

public class Vector
{
	int vec[], ind,tam;
	private Datos obl=new Datos();
	private Random obr=new Random();
	
	public void Tama�o()
	{
		try
		{
		tam=obl.Entero("Tama�o del Vector");
		vec=new int[tam];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("El Tama�o no puede ser negativo");
			this.Tama�o();
		}
	}
	
	public void Aleatorio()
	{
		ind=0;
		try
		{
		for(;;)
			vec[ind++]=obr.nextInt(100);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Datos Asignados al vector...");
		}
	}
	public void Mostrar()
	{
		ind=0;
		try
		{
			for(;;)
				System.out.println(vec[ind++]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Fin del programa...");
		}
	}
}