package UNIDAD2;

public class FiguraP
{
	public static void main(String[] args)
	{
		int op;
		Figura obf;
		Datos obl=new Datos();
		
		do
		{
			System.out.println("Menu De Áreas");
			System.out.println("1) Triangulo");
			System.out.println("2) Rectangulo");
			System.out.println("3) Cuadrado");
			System.out.println("4) Circulo");
			System.out.println("5) Salir");
			op=obl.Entero("Cual es tu opcion?");
			switch(op)
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
