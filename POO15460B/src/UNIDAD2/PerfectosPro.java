package UNIDAD2;

public class PerfectosPro
{
	private int num, can;
	
	public PerfectosPro Cantidad(int can)
	{
		this.can=can;
		return this;
	}
	
	public void Control()
	{
		int con;
		for (con=1, num=1; con<=can; num++)
		{
			if(this.Calcular());
			{
				this.Mostrar();
				con++;
			}
		}
	}
	
	private boolean Calcular()
	{
		int div, sum=0;
		for(div=1; div<num; div++)
			if(num%div==0)
				sum+=div;
		return num==sum;
	}
	private void Mostrar()
	{
		System.out.println(num);
	}
}