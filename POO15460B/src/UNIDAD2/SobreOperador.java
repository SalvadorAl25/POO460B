package UNIDAD2;

public class SobreOperador
{
	public static void main(String[] args)
	{
		int num1, num2;
		Datos obl=new Datos();
		num1=obl.Entero("Primer Numero");
		num2=obl.Entero("Segundo Numero");
		System.out.println("La suma es... "+(num1+num2));
		System.out.println("La concatenacion es "+num1+num2);
	}
}
