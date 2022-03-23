package UNIDAD3;

public class EstProMenu
{
	public static void main(String[] args)
	{
		Menu obm=new Menu("Menu ITJ", new String[]
				{"Cantidad", "Estudiantes", "Profesor", "Mostrar"});
		int op, ie=-1, ip=-1, can;
		Estudiante obe[]=null;
		Profesor obp[]=null;
		Datos obl=new Datos();
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					do
						can=obl.Entero("Cantos estudiantes serán?");
					while(can<1);
					obe=new Estudiante[can]; //Definicion de arreglo en un Objeto;
					ie=-1;
					do
						can=obl.Entero("Cuantos Profesores serán?");
					while(can<1);
					obp=new Profesor[can];
					ip=-1;
					break;
				case 2:
					if(obe!=null)
						if(ie+1<obe.length)
						{
							ie++;
							obe[ie]=new Estudiante(); //Define un Objeto
							obe[ie].LecturaE();
						}
						else
							System.out.println("Ya no hay espacio...");
					else
						System.out.println("Debe entrar primero a la opcion 1 del menu");
					break;
				case 3:
					if(obp!=null)
						if(ip+1<obp.length)
						{
							ip++;
							obp[ip]=new Profesor();
							obp[ip].LecturaP();
						}
						else
							System.out.println("Ya no hay espacio");
					else
						System.out.println("Debe entrar primero a la opcion 1 del menu");
					break;
				case 4:
					if(ie!=-1)
					{
						System.out.println("Datos de los estudiantes");
						for(can=0; can<=ie; can++)
							obe[can].MostrarE();
					}
					else
						System.out.println("No Hay Estudiantes registrados");
					if(ip!=-1)
					{
						System.out.println("Datos de los profesores...");
						for(can=0; can<=ip; can++)
							obp[can].MostarP();
					}
					else
						System.out.println("no hay profesores registrados...");
					break;
			}
		while(op!=obm.Salir());
	}
}
