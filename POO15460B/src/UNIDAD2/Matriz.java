package UNIDAD2;

import java.util.Random;

public class Matriz
{
	public int[] Tamaño()
	{
		Datos obl=new Datos();
		int ren, col, tam[]=new int[2];
		do
			ren=obl.Entero("Renglones");
		while(ren<2);
		do
			col=obl.Entero("Columnas");
		while(col<2);
		tam[0]=ren;
		tam[1]=col;
		return tam;
	}
	
	public int[][] Aleatorios(int ren, int col)
	{
		int mat[][]=new int [ren][col];
		Random obr=new Random();
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				mat[ren][col]=obr.nextInt(100);
		return mat;
	}
	public void Mostrar(int mat[][])
	{
		int ren, col;
		System.out.println("Datos de la matriz...");
		for (ren = 0; ren < mat.length; ren++)
		{
			for (col = 0; col < mat[ren].length; col++)
				System.out.println(mat[ren][col]+"\t");
			System.out.println();
		}
	}
}