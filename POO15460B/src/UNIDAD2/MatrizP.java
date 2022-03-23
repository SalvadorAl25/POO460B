package UNIDAD2;

public class MatrizP
{
	public static void main(String[] args)
	{
		int tam[];
		Matriz obm=new Matriz();
		tam=obm.Tamaño();
		obm.Mostrar(obm.Aleatorios(tam[0], tam[1]));
	}
}