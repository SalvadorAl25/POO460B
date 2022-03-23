package UNIDAD3;

public class ClienteT extends TecTienda
{
	private double deu;
	private int dia, mes, año;
	private String fec;

	public void Lectura()
	{
		super.Lectura();
		deu = obl.Double("Deuda...");
		do
			dia=obl.Entero("Dia: ");
		while(dia>31);
		do
			mes=obl.Entero("Mes: ");
		while(mes>12);
		do
			año=obl.Entero("Año: ");
		while(año>2017);
		fec=dia+"/"+mes+"/"+año;
	}

	public void Mostrar(int clv)
	{
		super.Mostrar(clv);
		System.out.println("Deuda: " + deu);
		System.out.println("Fecha: " + fec + "\n");
	}
}
