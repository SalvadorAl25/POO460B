package UNIDAD5;

public class ControlP
{
	public static void main(String[] args)
	{
		String nc;
		Datos obd=new Datos();
		Lanzadora obz=new Lanzadora();
		
		try
		{
			nc=obd.Cadena("No. Ctrl");
			obz.Control(nc);
			
		}
		catch(ControlExcepcion e)
		{
			
		}
	}
}
