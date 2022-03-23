package UNIDAD1;

import java.util.Random;

public class Vocales
{
	char vec[]=new char[5];
	int ind;
	Datos obl=new Datos();
	
	public void Tamaño()
	{
		int tam;
		do
			tam=obl.Entero("Dame el tamaño del vector");
		while(tam<1);
		vec=new char[tam];
	}
	public void Aleatorio()
	{
		String vocales="AEIOUaeiou";
		Random obr=new Random();
		for (ind=0; ind<vec.length; ind++)
			vec[ind]=vocales.charAt(obr.nextInt(10));
	}
	public void Mostrar()
	{
		System.out.println("Contenido del Vector...");
		for (ind=0; ind<vec.length; ind++)
			System.out.println((ind+1)+".-"+vec[ind]);
	}
}