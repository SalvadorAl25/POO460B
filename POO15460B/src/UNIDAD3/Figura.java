package UNIDAD3;

public class Figura
{
	public double Valor(String msj)
	{
		double valor;
		Datos obl=new Datos();
		do
			valor=obl.Double("Dame el valor de "+msj);
		while(valor<1);
		return valor;
	}
	
	public void Mostrar(String figura, double area)
	{
		System.out.println("El Area del "+figura+" es "+area);
	}
}
