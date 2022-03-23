package UNIDAD4;

import java.io.*;

public class Datos
{
	BufferedReader obb=new BufferedReader(new InputStreamReader(System.in));
	
	public int Entero(String msj)
	{
		int x=0;
		try
		{
			System.out.print(msj+" ");
			x=Integer.parseInt(obb.readLine().trim());
		}
		catch(NumberFormatException e)
		{
			x=this.Entero(msj);
		}
		catch(IOException e)
		{
			System.out.println("Error de lectura...");
		}
		return x;
	}
	public double Double(String msj)
	{
		double x=0;
		try
		{
			System.out.print(msj+" ");
			x=Double.parseDouble(obb.readLine().trim());
		}
		catch(NumberFormatException e)
		{
			x=this.Double(msj);
		}
		catch(IOException e)
		{
			System.out.println("Error de lectura...");
		}
		return x;
	}
	public char Caracter(String msj)
	{
		char x=' ';
		try
		{
			System.out.print(msj+" ");
			x=obb.readLine().trim().charAt(0);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			x=this.Caracter(msj);
		}
		catch(IOException e)
		{
			System.out.println("Error de lectura...");
		}
		return x;
	}
	public String Cadena(String msj)
	{
		String x=" ";
		try
		{
			System.out.print(msj+" ");
			x=obb.readLine().trim();
		}
		catch(IOException e)
		{
			System.out.println("Error de lectura...");
		}
		return x;
	}
}