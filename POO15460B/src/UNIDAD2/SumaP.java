package UNIDAD2;

public class SumaP
{
	public static void main(String[] args)
	{
		Suma obs;
		Datos obl=new Datos();
		
		System.out.println("Constructor por defecto...");
		obs=new Suma();
		obs.Sumas();
		obs.Mostrar();
		
		System.out.println("\nConstructor Alternativo...");
		obs=new Suma(obl.Entero("Prmer numero"),obl.Entero("Segundo Numero"));
		obs.Sumas();
		obs.Mostrar();
	}
}
