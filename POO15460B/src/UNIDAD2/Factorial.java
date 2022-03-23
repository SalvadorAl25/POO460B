package UNIDAD2;

/*Crear un programa que calcule el factorial de cualquier numero para lo cual debe de utilizar que contenga los numero para leer un numero factorial y mostrar
 * P.D. no existen variables de instancia*/
public class Factorial
{
	public int Leer()
	{
		int num;
		Datos obl=new Datos();
		do
			num=obl.Entero("Dame Un Numero");
		while(num<0);
		return num;
	}
	public int Calcular(int num)
	{
		int fac=1;
		for (; num>1; fac*=num, num--);
		return fac;
	}
	public void Mostrar(int fac)
	{
		System.out.println("El Factorial es "+fac);
	}
}
