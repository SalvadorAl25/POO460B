package UNIDAD2;

/* que dentro de un metodo lea tres semillas 
 * en el 2do lea la cantidad de metodos que quiera general
 * en el 3er metodo meta la serie de fibonacci
 * y un carto metodo lleva todas las series
 * nota: las 3 semilas no pueden ser zero
 * 
 */
public class Tabla
{
	public int Numero()
	{
		Datos obl=new Datos();
		return obl.Entero("Numero de la tabla");
	}
	
	public String Multiplicar(int num)
	{
		int con;
		String msj="";
		for(con=1; con<=10; con++)
			msj+=num+" * "+con+" = "+(num*con)+" \n ";
		return msj;
	}
	public void Mostrar(String msj)
	{
		System.out.println(msj);
	}
}
