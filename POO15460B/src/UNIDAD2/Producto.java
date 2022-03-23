package UNIDAD2;

import java.util.Random;

public class Producto
{
	public void Tamaño(int tam[])
	{
		Datos obl=new Datos();
		do
		{
			tam[0]=obl.Entero("Renglones de A");
			tam[1]=obl.Entero("Columnas de A");
			tam[2]=obl.Entero("Renglones de B");
			tam[3]=obl.Entero("Columnas de B");
		}
		while(tam[0]<2 || tam[1]<2 || tam[3]<2 || tam[2]!=tam[1]);
	}
	public void Aleatorios(int mat[][])
	{
		int ren, col;
		Random obr=new Random();
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				mat[ren][col]=obr.nextInt(10);
	}
	
	public void Multiplicar(int a[][], int b[][], int c[][])
	{
		int ren, col, x;
		for (ren = 0; ren < c.length; ren++)
			for (col = 0; col < c[ren].length; col++)
				for(x=0; x<b.length; x++)
					c[ren][col]+=a[ren][x]*b[x][col];
	}
	
	public void Mostrar(int mat[][])
	{
		int ren, col;
		for (ren = 0; ren < mat.length; ren++)
		{
			for (col = 0; col < mat[ren].length; col++)
				System.out.print(mat[ren][col]+"\t");
			System.out.println();
		}
	}
}