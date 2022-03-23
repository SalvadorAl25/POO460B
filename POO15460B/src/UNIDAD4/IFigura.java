package UNIDAD4;

/*permite declarar un conjunto de constantes y metodos abstractos los cuales deben implementarse dentro de la clase que haga uso de la interface, en cierto modo
 *es como construir un a clase abstracta con puros metodos abstractos y constantes, para construir una interface se utiliza la palabra "interface" en lugar de la palabra
 *clase, y los prototipos de la emicion son abstractos pero no se les tiene que indicar
 *
 *
 *public interface Interfaz
 *{
 *	//constantes
 *	public fial tipo Const=valor;
 *	//metodos abstractos
 *	tipo Metodo(Args)
 *}
 *
 *Para la implementacion de una interface se realiza de manera similar a la herencia, solo que en lugar de la palabra "extends" se utiliza la palabra "implements"
 *seguido del nombre de la interface o las interfaces que quieran ser implementadas
 *
 *public class Clase implements Interfaz
 *{
 *	//variables
 *	//Constructores
 *	//Metodos normales
 *	//Metodos de las interfaces
 *}
 *
 *NOTA: cuando se implementa un metodo abstracto de una interface su implementacion debe de ser publica.
 *
 *al igual que las clases abstractas de una interface no se pueden crear objetos, pero si se pueden crear diferencias que permitan implementar el polimorfismo.
*/
public interface IFigura
{
	public final Datos obl=new Datos();
	
	void Area();
	
	void Mostrar();
}
