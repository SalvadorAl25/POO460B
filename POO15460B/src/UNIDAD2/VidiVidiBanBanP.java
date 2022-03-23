package UNIDAD2;

public class VidiVidiBanBanP
{
	public static void main(String[] args)
	{
		//VidiVidiBanBan obv=new VidiVidiBanBan();
		//obv.Aleatorios();
		//obv.Mostrar();
		
		Datos obd=new Datos();
		int ren, col;
		do
			ren=obd.Entero("Renglones");
		while(ren<2);
		do
			col=obd.Entero("Columnas");
		while(col<2);
		new VidiVidiBanBan(ren, col);
	}
}
