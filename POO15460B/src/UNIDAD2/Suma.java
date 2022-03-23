package UNIDAD2;
/*2.5 constructores y destructores.
 * es un meotodo con caracteristicas especiales que  puede entrar dentro de una clase, sus caracteristicas son:
 * 1.debe tener el mismo nombre que la clase
 * 2.no puede tener un tipo de retorno ni la palabra void
 * 3.una clase puede contener mas de un constructor
 * 4.se ejecutan de manera automatica al momento de crear un objeto de la clase que los almacena(no puede se llamados a tra es de un objeto)
 * 
 * Su Uso es de dos maneras diferentes
 * 
 * 1.la inicializacion de las variables de instancia
 * 2.la ejecucion de bloque de codigo de manera obligatoria
 * 
 * Constructores por defecto: son aquellos que no reciben nunguna cantidad de argumentos.
 * Constructores alternativos: son aquellos que reciben una cantidad de argumentos.
 * 
 * 
 * Destructor: es un metodo cuya funcion es librerar la memoria de elementos que ya no se ban a usar
 * 
 * NOTA: Java o contiene destructores para ello utilizan un recolector de basura
 */

public class Suma
{
	private int num1, num2, suma;
	
	public Suma()
	{
		Datos obl=new Datos();
		num1=obl.Entero("Primer Numero");
		num2=obl.Entero("Segundo Numero");
	}
	
	public Suma(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public void Sumas()
	{
		suma=num1+num2;
	}
	
	public void Mostrar()
	{
		System.out.println("La Suma Es "+suma);
	}
}
