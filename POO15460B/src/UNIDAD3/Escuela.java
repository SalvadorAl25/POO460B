package UNIDAD3;

/* Crear una clase base llamada ESCUELA, programa que almacene los datos de PERSONAS y PROFESORES que aplique herencia simple, la clase ALUMNO tiene [No. Control,Nombre, Direccion, Tel, Sexo, Edad, No. Materias]
 * la clase PROFESOR [Nombre, Direccion, Telefono, Edad, Sexo, ID, Horario, Sueldo] y crear su menu
 */

public class Escuela
{
	public Datos obl=new Datos();
	private String nom, dir, tel;
	private char sex;
	private int edad;
	
	public void Lectura()
	{
		nom=obl.Cadena("Nombre: ");
		dir=obl.Cadena("Direccion: ");
		tel=obl.Cadena("Telefono: ");
		sex=obl.Caracter("Sexo: ");
		edad=obl.Entero("Edad: ");
	}
	
	public void Mostrar()
	{
		System.out.print(nom+"\t"+dir+"\t"+tel+"\t"+tel+"\t"+sex+"\t"+edad);
	}
}