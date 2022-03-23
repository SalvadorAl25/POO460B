package UNIDAD1;

//Conjunto de elementos homogeneos definidos en una estructura finita... 
//controlada con no o mas indices
//Tipos: .-Unidimensionales(VECTORES)  .-Bidimensionales(MATRIZ)   .-Multidimensionales(MATRIZ)
//la suma de todos los elementos del vector y mostrar

import java.util.Random;

public class Vector
{
	int vec[]=new int [10], ind;
	Datos obl=new Datos();
	Random obr=new Random();
	
	public void LeerNumero()
	{
		System.out.println("Dame los "+vec.length+" numeros del arreglo");
		for (ind=0; ind<vec.length; ind++)
		{
			vec[ind]=obl.Entero((ind+1)+".-");
		}
	}
	public void Mostrar()
	{
		System.out.println("Datos del vector");
		for (ind=0; ind<vec.length; ind++)
		{
			System.out.println((ind+1)+"[ "+vec[ind]+" ]");
		}
	}
	public void Aleatorio()
	{
		for (ind=0; ind<vec.length; ind++)
			vec[ind]=obr.nextInt(101);
	}
	public void Tamaño()
	{
		int tam=0;
		do
			tam=obl.Entero("Tamaño del vector");
		while(tam<1);
		vec=new int [tam];
	}
	public void Buscar()
	{
		int bus;
		boolean ban=true;
		bus=obl.Entero("Numero a buscar");
		for (ind=0; ind<vec.length; ind++)
		{
			if(vec[ind]==bus)
			{
				System.out.println("Posicion"+(ind+1));
				ban=false;
			}
		}
		if(ban)
			System.out.println("El Numero No Esta En El Arreglo");
	}
	public void Suma()
	{
		int sum=0;
		for (ind=0; ind<vec.length; ind++)
			sum+=vec[ind];
		System.out.println("La Suma es "+sum);
	}
	public void Promedio()
	{
		double pro=0;
		for (ind=0; ind<vec.length; ind++)
			pro+=vec[ind];
		pro/=vec.length;
		System.out.println("El Promedio es "+pro);
	}
	public void Mayor()
	{
		int may=vec[0];
		for (ind=1; ind<vec.length; ind++)
			if(vec[ind]>may)
				may=vec[ind];
		System.out.println("El Mayor es "+may);
	}
	public void Menor()
	{
		int men=vec[0];
		for (ind=1; ind<vec.length; ind++)
			if(vec[ind]<men)
				men=vec[ind];
		System.out.println("El Menor Es "+men);
	}
	public void Pares()
	{
		System.out.println("Elementos pares del vector...");
		for (ind = 0; ind < vec.length; ind++)
			if(vec[ind]%2==0)
				System.out.println(vec[ind]);
	}
	public void Impares()
	{
		System.out.println("Elementos Impares del vector...");
		for (ind = 0; ind < vec.length; ind++)
			if(vec[ind]%2!=0)
				System.out.println(vec[ind]);
	}
	public void ParImpar()
	{
		int []par, impar;
		int ip=-1, ii=-1, can=0;
		for (ind = 0; ind < vec.length; ind++)
			if(vec[ind]%2==0)
				can++;
		par=new int[can];
		impar=new int[vec.length-can];
		for (ind = 0; ind < vec.length; ind++)
			if(vec[ind]%2==0)
			{
				ip++;
				par[ip]=vec[ind];
			}
			else
			{
				ii++;
				impar[ii]=vec[ind];
			}
	}
}