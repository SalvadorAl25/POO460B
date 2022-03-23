package UNIDAD2;

public class Fibonacci
{
	public String Semillas()
	{
		int se1, se2, se3;
		Datos obl=new Datos();
		do
		{
			se1=obl.Entero("Semilla 1");
			se2=obl.Entero("Semilla 2");
			se3=obl.Entero("Semilla 3");
		}
		while(se1==0 && se2==0 && se3==0);
		return se1+"/"+se2+"/"+se3;
	}
	
	public int Cantidad()
	{
		int can;
		Datos obl=new Datos();
		do
			can=obl.Entero("Cantidad de numeros de la serie");
		while(can<1);
		return can;
	}
	public String Serie(String sem, int can)
	{
		long se1, se2, se3, con, num;
		String serie="";
		se1=Long.parseLong(sem.substring(0, sem.indexOf("/")));
		se2=Long.parseLong(sem.substring(sem.indexOf("/")+1, sem.lastIndexOf("/")));
		se3=Long.parseLong(sem.substring(sem.lastIndexOf("/")+1, sem.length()));
		for(con=1; con<=can; con++)
		{
			num=se1+se2+se3;
			serie+=this.Tamaño(num);
			if(con%10==0)
				serie+="\n";
			se1=se2;
			se2=se3;
			se3=num;
		}
		return serie;
	}
	
	public void Mostrar(String serie)
	{
		System.out.println(serie);
	}
	public String Tamaño(long num)
	{
		String cad=num+"";
		while(cad.length()<22)
			cad+=" ";
		return cad;
	}
}