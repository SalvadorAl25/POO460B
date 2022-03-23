package UNIDAD6;

import java.io.*;
import b15460.*;

public class Productos
{
	private int clv, exi;
	private String nom, fec, archivo="Productos.txt";
	private double pre;
	private DataOutputStream obo;
	private DataInputStream obi;
	private Datos obd=new Datos();
	
	public void Registro()
	{
		System.out.println("Escribe los datos del producto");
		clv=obd.Entero("Clave...");
		nom=obd.Cadena("Nombre...");
		exi=obd.Entero("Existencia...");
		pre=obd.Double("Precio...");
		fec=obd.Cadena("Fecha...");
		try
		{
			obo=new DataOutputStream(new FileOutputStream(archivo));
			obo.writeInt(clv);
			obo.writeUTF(nom);
			obo.writeInt(exi);
			obo.writeDouble(pre);
			obo.writeUTF(fec);
			obo.close();
		}
		catch(IOException e)
		{
			System.out.println("Error de Escritura");
		}
	}
	
	public void Consulta()
	{
		try
		{
			obi=new DataInputStream(new FileInputStream(archivo));
			try
			{
				while(true)
				{
					clv=obi.readInt();
					nom=obi.readUTF();
					exi=obi.readInt();
					pre=obi.readDouble();
					fec=obi.readUTF();
					System.out.println(clv+" "+nom+" "+exi+" "+pre+" "+fec);
				}
			}
			catch(EOFException e)
			{
				obi.close();
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("El archivo no existe...");
		}
		catch(IOException e)
		{
			System.out.println("Error de lectura...");
		}
	}
}
