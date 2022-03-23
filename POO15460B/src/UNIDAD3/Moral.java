package UNIDAD3;

public class Moral extends Fisica
{
	private int hrs;
	private double pre, sub, imp, tot;
	public void Pago()
	{
		do
			hrs=obd.Entero("Horas Trabajadas");
		while(hrs<1);
		do
			pre=obd.Double("Precio por hora");
		while(pre<1);
		
		System.out.println("Sub-total "+sub+"\nImpuesto "+imp+"\nTotal "+tot);
	}
	
	public void MostrarC()
	{
		System.out.println(hrs + " $" + pre + " $" + sub + " -$" + imp + " $" + tot);
	}
	
	private void Calcular()
	{
		sub=hrs*pre;
		imp=sub*.35;
		tot=sub-imp;
	}
	
	public void Horas(int hrs)
	{
		this.hrs=hrs;
		this.Calcular();
	}
	public void Precio(double pre)
	{
		this.pre=pre;
		this.Calcular();
	}
}
