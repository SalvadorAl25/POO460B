package UNIDAD5;

import java.io.*;

public class Datos
{
	private BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));

	public byte Byte(String msj) throws IOException
	{
		byte x = 0;
		try
		{
			System.out.println(msj + " ");
			x = Byte.parseByte(obb.readLine().trim());
		} 
		catch (NumberFormatException e)
		{
			x = this.Byte(msj);
		} 
		catch (IOException e)
		{
			System.out.println("Error de la lectura...");
		}
		return x;
	}
	
	public short Corto(String msj) 
	{
		short x = 0;
		try
		{
			System.out.println(msj + " ");
			x =Short.parseShort(obb.readLine().trim());
		} 
		catch (NumberFormatException e)
		{
			x = this.Corto(msj);
		} 
		catch (IOException e)
		{
			System.out.println("Error de la lectura...");
		}
		return x;
	}
	
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
	
	public long Largo(String msj) 
	{
		long x = 0;
		try
		{
			System.out.println(msj + " ");
			x =Long.parseLong(obb.readLine().trim());
		} 
		catch (NumberFormatException e)
		{
			x = this.Largo(msj);
		} 
		catch (IOException e)
		{
			System.out.println("Error de la lectura...");
		}
		return x;
	}
	
	public float Flotante(String msj) 
	{
		float x = 0;
		try
		{
			System.out.println(msj + " ");
			x =Float.parseFloat(obb.readLine().trim());
		} 
		catch (NumberFormatException e)
		{
			x = this.Flotante(msj);
		} 
		catch (IOException e)
		{
			System.out.println("Error de la lectura...");
		}
		return x;
	}
	
	public double Doble(String msj)
	{
		double x=0;
		try
		{
			System.out.print(msj+" ");
			x=Double.parseDouble(obb.readLine().trim());
		}
		catch(NumberFormatException e)
		{
			x=this.Doble(msj);
		}
		catch(IOException e)
		{
			System.out.println("Error de lectura...");
		}
		
		return x;
	}
	
	public char Caracter(String msj) 
	{
		char x = ' ';
		try
		{
			System.out.println(msj + " ");
			x =obb.readLine().trim().charAt(0);
		} 
		catch (StringIndexOutOfBoundsException e)
		{
			x = this.Caracter(msj);
		} 
		catch (IOException e)
		{
			System.out.println("Error de la lectura...");
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