package UNIDAD5;

import java.util.*;

public class VecMat
{
	private int ren, col;
	Random obr=new Random();
	
	public void Aleatorio(int vec[])
	{
		for (ren=0; ren < vec.length; ren++)
			vec[ren]=obr.nextInt(101);
	}
	
	public void Aleatorio(int mat[][])
	{
		for (ren=0; ren < mat.length; ren++)
			for (col=0; col < mat[ren].length; col++)
			mat[ren][col]=obr.nextInt(101);
	}
	
	public void Mostrar(int vec[])
	{
		System.out.println("Datos del vector..");
		for (ren = 0; ren < vec.length; ren++)
			System.out.println(vec[ren]);
	}
	
	public void Mostrar(int mat[][])
	{
		System.out.println("Datos de la matriz...");
		for (ren = 0; ren < mat.length; ren++)
		{
			for (col = 0; col < mat.length; col++)
				System.out.println(mat[ren][col]+"\t");
			System.out.println();
		}
	}
}