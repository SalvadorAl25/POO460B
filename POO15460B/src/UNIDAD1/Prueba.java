package UNIDAD1;

public class Prueba
{
	public static void main(String[] args)
	{
		Datos obd=new Datos();
		int n;
		double d;
		char a;
		String s;
		
		n=obd.Entero("Dame Un Valor Entero");
		d=obd.Double("Dame Un Valor con desimales");
		a=obd.Caracter("Dame un caracter");
		s=obd.Cadena("Dame Una Cadena");
		
		System.out.println("Entero: "+n+"\n"+"Double: "+d+"\n"+"Caracter: "+a+"\n"+"Cadena: "+s);
	}
}