package UNIDAD3;

public class Fisica
{
	private String nom, pat, mat, rfc;
	private int año, mes, dia, hrs;
	private double pre, sub, imp, tot;
	public Datos obd = new Datos();

	public Fisica()
	{
		int lim;
		do
			nom = obd.Cadena("Nombre").toUpperCase();
		while (nom.length() == 0);
		do
			pat = obd.Cadena("A. Paterno").toUpperCase();
		while (pat.length() == 0);
		mat = obd.Cadena("A. Materno").toUpperCase();
		do
			año = obd.Entero("año");
		while (año < 1917 || año > 2017);
		do
			mes = obd.Entero("Mes");
		while (mes < 1 || mes > 12);
		switch (mes)
		{
			case 2:
				if (año % 4 == 0 && año % 100 == 0)
					lim = 29;
				else
					lim = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lim = 30;
			default:
				lim = 31;
		}
		do
			dia = obd.Entero("Dia");
		while (dia < 1 || dia > lim);
		this.RFC();
		System.out.println("RFC " + rfc);
	}

	private void RFC()
	{
		int pos;
		rfc = "";
		rfc += pat.charAt(0);
		for (pos = 1; pos < pat.length(); pos++)
			if ("AEIOU".indexOf(pat.charAt(pos)) != -1)
				break;
		rfc += pat.charAt(pos);
		if (mat.length() == 0)
			rfc += "X";
		else
			rfc += mat.charAt(0);
		rfc += nom.charAt(0);
		rfc += (año + "").substring(2);
		if (mes < 10)
			rfc += "0";
		rfc += mes;
		if (dia < 10)
			rfc += "0";
		rfc += dia;
	}

	public void Pago()
	{
		do
			hrs = obd.Entero("Horas Trabajadas");
		while (hrs < 1);
		do
			pre = obd.Double("Precio por hora");
		while (pre < 1);
		this.Calcular();
	}

	private void Calcular()
	{
		sub = hrs * pre;
		imp = sub * .16;
		tot = sub - imp;
	}

	public void MostrarB()
	{
		System.out.print(rfc + "\t" + nom + " " + pat + " " + mat + "\t" + dia + "/" + mes + "/" + año + "\n");
	}

	public void MostrarC()
	{
		System.out.println(hrs + " $" + pre + " $" + sub + " -$" + imp + " $" + tot);
	}

	public String RFCB()
	{
		return rfc;
	}

	public void Nombre(String nom)
	{
		this.nom = nom.toUpperCase();
		this.RFC();
	}

	public void Paterno(String pat)
	{
		this.pat = pat.toUpperCase();
		this.RFC();
	}

	public void Materno(String mat)
	{
		this.mat = mat.toUpperCase();
		this.RFC();
	}

	public void Año(int año)
	{
		this.año = año;
		this.RFC();
	}

	public void Mes(int mes)
	{
		this.mes = mes;
		this.RFC();
	}

	public void Dia(int dia)
	{
		this.dia = dia;
		this.RFC();
	}

	public void Horas(int hrs)
	{
		this.hrs = hrs;
		this.Calcular();
	}

	public void Precio(double pre)
	{
		this.pre = pre;
		this.Calcular();
	}
}