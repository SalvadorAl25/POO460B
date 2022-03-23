package UNIDAD5;

import b15460.*;

/* la creacion de una excepicion en java requiere herencia, para el uso de excepciones definidas por java, la nueva excepcion
 * se puede crear de manera directa o indirecta. cuando una excepcion se crea de manera directa es extendida de la clase excepction
 * que es la clase base de las excepciones en java y cuando es de forma indirecta se crea extendida de cualquier otra excepcion definida por java
 * menos exception
 * 
 * su sintaxis es la sig
 * 
 * public class NuevaExcepcion extends Exception
 * {
 * 		public NuevaException(String msj)
 * 		{
 * 			super(msj);
 * 		}
 * }
 * Como lanzar una excepcion
 * 
 * public class Lanzadora
 * {
 * 		public void Metodo(args) throws NuevaExcepcion
 * 		{
 * 			if(arg==true)
 * 				throw new NuevaExcepcion("Mensaje...");
 * 		}
 * }
 * 
 */

public class VecMatP
{
	public static void main(String[] args)
	{
		int op, ren, col, vec[]=null, mat[][]=null;
		Menu obm=new Menu("Arreglos....", new String[]{"Vector", "Matriz", "Mostrar"});
		VecMat obv=new VecMat();
		Datos obd=new Datos();
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					try
					{
						ren=obd.Entero("Tamaño del vector...");
						vec=new int[ren];
						obv.Aleatorio(vec);
					}
					catch(NegativeArraySizeException e)
					{
						System.out.println("El tamaño no puede ser negativo");
					}
					break;
				case 2:
					try
					{
						ren=obd.Entero("Renglones...");
						col=obd.Entero("Columnas....");
						mat=new int[ren][col];
						obv.Aleatorio(mat);
					}
					catch(NegativeArraySizeException e)
					{
						System.out.println("El tamaño no puede ser negativo");
					}
					break;
				case 3:
					try
					{
						obv.Mostrar(vec);
					}
					catch(NullPointerException e)
					{
						System.out.println("el vecto no tiene datos");
					}
					try
					{
						obv.Mostrar(mat);
					}
					catch(NullPointerException e)
					{
						System.out.println("la matriz no tiene datos");
					}
			}
		while(op!=obm.Salir());
	}
}
