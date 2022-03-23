package UNIDAD4;

/* EL POLIMORFISMO ES UNO DE LOS 4 PILARES DE LA PROGRAMACION QUE SE UTILIZAN EN CONVINACION CON LA HERENCIA, QUE SE PUEDE APLICAR DE DOS MANERAS DISTINTAS
 * POR MEDIO DE CLASES Y METODOS ABSTRACTOS O POR MEDIO DE INTERFASES.
 * EN LA PRACTICA EL POLIMORFISMO ES LA PROPIEDAD QUE PERMITE ENVIAR EL MISMO MSJ. A OBJETOS DE DIFERENTES CLASES DE TAL FORMA QUE CADA UNA DE ELLAS RESPONDE DE MODO DISTINTO AL MISMO MSJ. 
 * DEPENDIENDO DE SU IMPLEMENTACION, AL APLICAR EL POLIMORFISMO SE CONSTRUYEN CLASES GENERICAS QUE PUEDEN SER REUTILIZADAS POR MEDIO DE LA HERENCIA O IMPLEMENTADAS POR MEDIO DE INTERFACES,
 * cuando una clase es abstracta debe contener almenos un metodo abstracto(solo su prototipo), las clases abstractas pueden contener variables de instancia constructores y metodos normales, 
 * y su estructura es la sig. 
 * 
 * public abstract class clase
 * {
 *   //variables de instancia
 *   //constructores
 *   //metodos normales
 *   //metodos abstractods
 *   abstract tipo Metodo(args);
 * }
 * 
 * ...de una clase abstracta no es posible generar una instancia en ella, solamente se pueden generar referencias apartir de ella
 * 
 * Para poder aplicar el polimorfismo se ocupa crear clases derivadas apartir de una clase abstracta en donde se debe de aplicar la implementacion de los metodos abstractos
 * 
 * public class Derivada extends Clase
 * {
 *   //VARIABLES DE INSTANCIA
 *   //CONSTRUCTORES
 *   //METODOS NORMALES
 *   //IMPLEMENTACION DE LOS METODOS ABSTRACTOS
 *   
 *   public tipo Metodo(args)
 *   {
 *     -------
 *     -------
 *     -------
 *   }
 * }
 * }
 * NOTA: SI UNA CLASE DERIVADA NO IMPLEMENTA UN METODO ABSTRACTO DE LA CLASE BASE, LA CLASE DERIVADA SE CONVIERTE EN CLASE ABSTRACTA POR LO CUAL NO PODRIA GENERAR OBJETOS DE LA CLASE DERIVADA
 * 
 * "abstract"
 */

public abstract class Figura
{
	public Datos obd=new Datos();
	
	abstract void Area();
	
	abstract void Mostrar();
}
