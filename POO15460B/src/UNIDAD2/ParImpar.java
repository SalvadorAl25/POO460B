package UNIDAD2;

/*Leer un numero y determinar si es par o impar empleando sumas, el numero se lee en un metodo 
 * y se valida para que no sea un zero, un segundo metodo determina si es un par o impar
 * para que un tercer metodo muestre el resultado
 * NO HAY VARIABLE DE INSTANCIA*/

public class ParImpar
{
	public int Numero()
	{
		int num;
		Datos obl=new Datos();
		do
			num=obl.Entero("DAME UN NUMERO");
		while(num==0);
		return num;
	}
	
	public boolean Calcular(int num)
	{
		if(num>0)
			for(;num>=2; num-=2);
		else
			for(;num<=-2;num+=2);
		if(num==0)
			return true;
		else
			return false;
	}
	public void Mostrar(boolean pi)
	{
		if(pi)
			System.out.println("Es Un Par");
		else
			System.out.println("Es Un Impar");	
	}
}