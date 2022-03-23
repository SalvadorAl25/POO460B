package UNIDAD2;

public class FiguraPM
{
	public static void main(String[] args)
	{
		int op;
		Figura obf;
		Datos obl=new Datos();
		Menu obm=new Menu("Menu de Áreas", 
				new String[]{"Triangulo", "Rectangulo", "Cuadrado", "Circulo"});
		do
		{
			switch(op=obm.Opcion())
			{
				case 1:
					obf=new Figura(obl.Double("Base"), obl.Double("altura"));
					obf.Triangulo();
					break;
				case 2: 
					obf=new Figura(obl.Double("Base"), obl.Double("altura"));
					obf.Rectangulo();
					break;
				case 3:
					obf=new Figura(obl.Double("Lado"));
					obf.Cuadrado();
					break;
				case 4:
					obf=new Figura(obl.Double("Radio"));
					obf.Circulo();
					break;
			}
		}
		while(op!=5);
	}
}
