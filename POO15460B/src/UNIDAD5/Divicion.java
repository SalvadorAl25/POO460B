package UNIDAD5;

import b15460.Datos;

/* un TRY permite detectar posibles errores que ocurran en tiempo de edicion o en tiempo de ejecucion.
 * el CATCH captura el error ocurrido y determina la accion a desarrollar para controlar el posible error que se genero ya sea para continuar con la instruccion del problema
 * o para presentar una salida elegante.
 * FINALLY es un bloque de codigo opcional que se puede generar o ejecutar al salir de un TRY o de un CATCH
 * 
 */

public class Divicion
{
	private int dividendo, divisor, resultado;
	private Datos obd=new Datos();
	
	public void Lectura()
	{
		dividendo=obd.Entero("Dame el dividendo");
		divisor=obd.Entero("Dame el divisor");
	}
	
	public void Calcular()
	{
		try
		{
			resultado=dividendo/divisor;
		}
		catch(ArithmeticException e) //la variable "e" se usa para almacenar el nombre de la excepcion, o el msj del error
		{
			System.out.println("El divisor no puede ser 0");
			this.Lectura();
			this.Calcular();
		}
	}
	public void Mostrar()
	{
		System.out.println("El Resultado de la divicion es "+resultado);
	}
}
