package UNIDAD1;

//Declaracion... tipo nombre[][];  tipo [][]nombre;
//Definicion...  nombre=new tipo[no_renglones][no_columnas];
//Declaracion y Definicion tipo nombre[][]=new tipo[no_renglones][no_columnas];
//Tamaño (length) var_int_renglones=nombre.length; var_int_columnas=nombre[renglones].length;
//Inicializacion tipo nombre[][]={{e1,e2,...,eN},{e1,e2,...eN}};

import java.util.Random;

public class Matriz
{
	int mat[][]=new int [3][3], ren, col;
	Datos obl=new Datos();
	Random obr=new Random();
	
	public void Leer()
	{
		System.out.println("Dame Los "+mat.length*mat[0].length+" elementos de la matriz");
		for (ren=0; ren<mat.length; ren++)
			for (col=0; col<mat[ren].length; col++)
				mat[ren][col]=obl.Entero("[ "+(ren+1)+" ][ "+(col+1)+" ].-");
	}
	public void Tamaño()
	{
		do
			ren=obl.Entero("Numero de renglones");
		while(ren<2);
		do
			col=obl.Entero("Numero De Columnas");
		while(col<2);
		mat=new int[ren][col];
	}
	public void Mostrar()
	{
		System.out.println("Contenido de la matriz...");
		for (ren = 0; ren < mat.length; ren++)
		{
			for (col=0; col<mat[ren].length; col++)
				System.out.print(mat[ren][col]+"\t");
			System.out.println();
		}
	}
	public void Aleatorio()
	{
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat.length; col++)
				mat[ren][col]=obr.nextInt(100);
	}
	public void Suma()
	{
		int sum=0;
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat.length; col++)
				sum+=mat[ren][col];
		System.out.println("La Suma Es: "+sum);
	}
	public void Promedio()
	{
		double prom=0;
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat.length; col++)
				prom+=mat[ren][col];
		prom/=mat.length*mat[0].length;
		System.out.println("El Promedio es: "+prom);
	}
	public void Mayor()
	{
		int may=mat[0][0];
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				if(mat[ren][col]>may)
					may=mat[ren][col];
		System.out.println("El Mayot Es: "+may);
	}
	public void Menor()
	{
		int men=mat[0][0];
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				if(mat[ren][col]<men)
					men=mat[ren][col];
		System.out.println("El Menor Es: "+men);
	}
	public void Diagonal()
	{
		if(mat.length==mat[0].length)
		{
			for (ren = 0; ren < mat.length; ren++)
				for (col = 0; col < mat[ren].length; col++)
					if(ren==col)
				System.out.println(mat[ren][col]);
		}
		else
			System.out.println("No Contiene Diagonal");
					
	}
	public void SumaRen()
	{
		int suma;
		for (ren = 0; ren < mat.length; ren++)
		{
			suma=0;
			for (col = 0; col < mat[ren].length; col++)
			{
				System.out.print(mat[ren][col]+"\t");
				suma+=mat[ren][col];
			}
			System.out.println("=\t"+suma);
		}
	}
	public void Diferentes()
	{
		int num;
		boolean ban;
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat.length; col++)
				do
				{
					num=obr.nextInt((mat.length*mat[0].length)*2);
					ban=false;
					if(ren==0 && col==0)
						mat[ren][col]=num;
					else
					{
						for (int x = 0; x < mat.length; x++)
							for (int y = 0; y < mat[x].length; y++)
								//if(x!=ren && y!=col) error
									if(mat[x][y]==num)
									{
										ban=true;
										break;
									}
						if(!ban)
							mat[ren][col]=num;
					}
				}
				while(ban);
	}
	
}