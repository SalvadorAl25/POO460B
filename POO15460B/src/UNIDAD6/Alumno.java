package UNIDAD6;

import java.io.*;

import b15460.*;

/* Available   var=obj.available();
 * close       obj.close();
 * reset       obj.reset();
 * Skip        var=obj.skip(nbyte);
 * read        var=obj.read();
 * 			   var=obj.read(arr);
 * 			   var=obj.read(arr, pos, nbyte);
 */

/*
6.1 
un archivo es un elemento integrador de datos que se definde dentro de un dispositivo externo
con la finalidad de almasenar grandes cantidades de intregracion y poderlas recuperar en cualquier momento
en java los archivos se manejar atravez de Stream's(flujos) que pueden estar abiertos o cerrados para permitir que la informacion 
viaje del programa al archivo o del archico al programa

		       Out
		---------------->
	Programa		  Dispositivo    OutputStream----InputStream      "JAVA.IO.*;"
		<----------------
		       In
Flujo: en forma analogica; es la via por donde se pasan los archivo 
6.2 Clasificacion
  - [byte]Secuenciales(texto){FileOutputStream, FileInputStream}
  - [tipos Primitivos]Registro(texto){DataOutputStream, DataInputStream}
  - [tipos Primitivos]Acceso Aleatorio{RandomAccesFile}
  
  *FileOutputStream obj;
  *obj=new FileOutputStream("archivo.ext");
  *obj=new FileOutputStream("archivo.ext", true/false);  //True sirve para seguir escribiendo en el archivo, false para borrarlo
  *obj.close();--- sirve para cerrar el archivo(siempre hay que cerrar el archivo)
  *obj.flush();--- se encarga de mandar lo que esta en el buffer hacia el dispositivo de salida(obliga a guardar lo que hay en el buffer)
  *obj.write()(byte)(arr_byte)(arr_byte, pos, nbytes);--- para guardar datos al archivo
  */

/* DataOutputStream----DataInputStream
 * obo=new DataOutputStream(new FileOutputStream("archivo.txt", true));
 * obo.close();
 * obo.writeBoolean(var_Boolean);
 * obo.writeByte(var_byte);
 * obo.writeUTF(var_String);
 * 
 * boolean: 1 bit
 * byte:    1
 * char:    2
 * short    2
 * int      4
 * long     8
 * float    4
 * double   8
 * String   longitud+2
 */
public class Alumno
{
	private String nc, nom, cad, ncb;
	private int pro, var;
	private Datos obd=new Datos();
	private FileOutputStream obo;
	private FileInputStream obi;
	
	public void Guardar()
	{
		
		nc=obd.Cadena("No. Ctrl.");
		nom=obd.Cadena("Nombre");
		pro=obd.Entero("Promedio");
		try
		{
			obo=new FileOutputStream("alumnos.txt",true);
			obo.write((nc+"*"+nom+"+"+pro+"\n").getBytes());
			obo.close();
		}
		catch(IOException e)
		{
			System.out.println("Error al Guardar");
		}
	}
	public void Mostrar()
	{
		try
		{
			obi=new FileInputStream("alumnos.txt");
			do
			{
				var=obi.read();
				if(var!=-1)
					System.out.print((char)var);
			}
			while(var!=-1);
			obi.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("El Archivo no existe...");
		}
		catch(IOException e)
		{
			System.out.println("Error al mostrar...");
		}
	}
	public void Buscar()
	{
		cad=" ";
		ncb=obd.Cadena("No. Ctrl a buscar...");
		try
		{
			obi=new FileInputStream("alumnos.txt");
			do
			{
				var=obi.read();
				if(var!=10)
					cad+=(char)var;
				else
				{
					nc=cad.substring(0, cad.indexOf('*'));
					nom=cad.substring(cad.indexOf('*')+1, cad.indexOf('+'));
					pro=Integer.parseInt(cad.substring(cad.indexOf('+')+1));
					if(cad.indexOf(ncb)!=-1)
						System.out.println(nc+"\t"+nom+"\t"+pro);
					cad="";
				}
			}
			while(var!=-1);
			obi.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("el archivo no existe...");
		}
		catch(IOException e)
		{
			System.out.println("Error en el dispositivo");
		}
	}
	public void Modificar()
	{
		int op;
		Menu obm=new Menu("Eliminacion", new String[]{"No. Ctrl", "Nombre", "Promedio"});
		cad=" ";
		ncb=obd.Cadena("No. Ctrl a buscar...");
		try
		{
			obi=new FileInputStream("alumnos.txt");
			obo=new FileOutputStream("auxiliar.txt");
			do
			{
				var=obi.read();
				if(var!=10)
					cad+=(char)var;
				else
				{
					nc=cad.substring(0, cad.indexOf('*'));
					nom=cad.substring(cad.indexOf('*')+1, cad.indexOf('+'));
					pro=Integer.parseInt(cad.substring(cad.indexOf('+')+1));
					if(nc.equals(ncb))
					{
						System.out.println("Datos del alumno...");
						System.out.println(nc+"\t"+nom+"\t"+pro);
						do
							switch(op=obm.Opcion())
							{
								case 1:
									nc=obd.Cadena("No. Ctrl: ");
									break;
								case 2:
									nom=obd.Cadena("Nombre: ");
									break;
								case 3:
									pro=obd.Entero("Promedio");
							}
						while(op!=obm.Salir());
						cad=nc+"*"+nom+"+"+pro;
					}
					cad+="\n";
					obo.write(cad.getBytes());
					cad="";		
				}
			}
			while(var!=-1);
			obi.close();
			obo.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("el archivo no existe...");
		}
		catch(IOException e)
		{
			System.out.println("Error en el dispositivo");
		}
		this.Intercambio();
	}
	public void Intercambio()
	{
		
	}
	public void Eliminar()
	{
		cad=" ";
		ncb=obd.Cadena("No. Ctrl a buscar...");
		try
		{
			obi=new FileInputStream("alumnos.txt");
			do
			{
				var=obi.read();
				if(var!=10)
					cad+=(char)var;
				else
				{
					nc=cad.substring(0, cad.indexOf('*'));
					nom=cad.substring(cad.indexOf('*')+1, cad.indexOf('+'));
					pro=Integer.parseInt(cad.substring(cad.indexOf('+')+1));
					if(nc.equals(ncb))
					{
						System.out.println("Datos del alumno...");
						System.out.println(nc+"\t"+nom+"\t"+pro);
					}
					else
					{
						cad+="\n";
						obo.write(cad.getBytes());
					}
					cad="";
				}
			}
			while(var!=-1);
			obi.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("el archivo no existe...");
		}
		catch(IOException e)
		{
			System.out.println("Error en el dispositivo");
		}
	}
}
