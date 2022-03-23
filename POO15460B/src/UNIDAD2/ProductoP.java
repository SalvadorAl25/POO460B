package UNIDAD2;

public class ProductoP
{
	public static void main(String[] args)
	{
		int tam[]=new int[4];
		int[][] a, b, c;
		Producto obp=new Producto();
		obp.Tamaño(tam);
		a=new int [tam[0]][tam[1]];
		b=new int [tam[2]][tam[3]];
		c=new int [tam[0]][tam[3]];
		obp.Aleatorios(a);
		obp.Aleatorios(b);
		obp.Multiplicar(a, b, c);
		System.out.println("Datos de A");
		obp.Mostrar(a);
		System.out.println("Datos de B");
		obp.Mostrar(b);
		System.out.println("Datos de C");
		obp.Mostrar(c);
	}
}
