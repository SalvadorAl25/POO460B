package UNIDAD3;

public class FisicaMoralNP
{
	public static void main(String[] args)
	{
		/*int op, os,om, ipf=-1, ipm=-1, can;
		String rfc, oms[]={"Nueva", "Lista", "Buscar", "Modificar", "Eliminar"};
		String omm[]={"nombre", "A. Paterno", "A. Materno", "Año", "Mes", "Dia", "Horas", "Precio"};
		Menu mp, ms, mm;
		Fisica obf[];
		Moral obm[];
		Datos obd=new Datos();
		mp=new Menu("Menu Principal...", new String[]{"Fosica",});
		
		mp=new Menu("Menu Principal...", new String[]{"Fisica", "Moral"});
		
		do
			can=obd.Entero("Cantidad de personas Fisicas");
		while(can<1);
		obf=new Fisica[can];
		do
			can=obd.Entero("Cantidad de personas Morales");
		while(can<1);
		obm=new Moral[can];
		
		
		/*do
			switch(op=mp.Opcion())
			{
				case 1:
					ms=new Menu("Personas Fisicas...", oms);
					do
						switch(os=ms.Opcion())
						{
							case 1:
								if(ipf+1<obf.length)
								{
									obf[++ipf]=new Fisica();
									obf[ipf].Pago();
								}
								else
									System.out.println("No hay espacio...");
								break;
							case 2:
								if(ipf!=-1)
									
								break;
							case 3:
								if(ipf!=-1)
								{
									do
										rfc=obd.Cadena("RFC de la persona que busca");
									while(rfc.length()!=10);
									for(can=0; can<=ipf; can++)
										if(obf[can].RFCB().equalsIgnoreCase(rfc))
										{
											System.out.println("Datos de la persona...");
											obf[can].MostrarB();
											obf[can].MostrarC();
											break;
										}
								}
								if(can>ipf)
									System.out.println("el RFC no existe");
						}
					else
						System.out.println();
								break;
							case 4:
								break;
							case 5:
						}
					while(os!=ms.Salir());
					break;
				case 2:
		while(op!=mp.Salir());*/
	}
}
