package UNIDAD3;

/* Tarea
 * crear una clase llamada "Cliente" que controla "Clave", "Nombre", "Deuda" y "Fecha"; dentro de una segunda clase llamada empleado
 * controla "nombre", "clave", "Sueldo". las dos clases ban a tener lectura y mostrar.
 * Menu con "Cantidad" "Cliente" "Empleado" "Mostrar".
 */

public class TecTienda
{
	private String nom;
	Datos obl = new Datos();

	public void Lectura()
	{
		nom = obl.Cadena("Nombre...");
	}

	public void Mostrar(int clv)
	{
		System.out.println("Clave: " + clv + "\nNombre: " + nom);
	}
}
