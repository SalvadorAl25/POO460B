package UNIDAD2;

import java.util.Random;
/* Tarea
 * Crear una clase que contenga los constructores. 
 * el 1ro es un constructor por defecto, que se encarga de definir un arreglo bidimencional de 3x3, ejecutar un metodo que asigune elementos aleatorios al arreglo definido
 * y ademas ejecuta el metodo que presente el contenido del arreglo;
 * el 2do constructor alternativo resibe el tamaño del arreglo bidimencional para construirlo y realiza la llamada a los metodos "Aleatorios" y "Mostrar".
 *
 */

public class VidiVidiBanBan
{
	int vidi[][];
	int ren, col;
	
	public VidiVidiBanBan()
	{
		Datos obd=new Datos();
		do
			ren=obd.Entero("No. Renglones");
		while(ren<2);
		do
			col=obd.Entero("No. Columnas");
		while(col<2);
		vidi=new int [ren][col];
	}
	public VidiVidiBanBan(int ren, int col)
	{
		vidi=new int [ren][col];
		this.Aleatorios();
		this.Mostrar();
	}
	public void Aleatorios()
	{
		Random obr=new Random();
		for (ren=0; ren < vidi.length; ren++)
			for (col=0; col < vidi[ren].length; col++)
			{
				do
					vidi[ren][col]=obr.nextInt(101);
				while(vidi[ren][col]<10);
			}
	}
	public void Mostrar()
	{
		System.out.println("Arreglo Bidimencional...");
		for (ren=0; ren<vidi.length; ren++)
		{
			for (col=0; col<vidi[ren].length; col++)
				System.out.print(vidi[ren][col]+"\t");
			System.out.println();
		}
	}
}
