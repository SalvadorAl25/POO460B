package UNIDAD4;

public class Proveedor extends Tienda
{
	private double cre;
	private Cliente obc = new Cliente();

	void Lectura(int clv, String msj)
	{
		obc.Lectura(clv, msj);
		cre = obl.Double("Credito");
	}

	void Mostrar(String msj)
	{
		obc.Mostrar(msj);
		System.out.print("\t" + cre);
	}
}
