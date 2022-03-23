package UNIDAD4;

public class FiguraP
{
	public static void main(String[] args)
	{
		int op;
		Menu obm=new Menu("Menu de areas", new String[]{"Triangulo", "Rectangulo", "Cuadrado", "Circulo"});
		Figura ref;
		Triangulo obt;
		Rectangulo obr;
		Cuadrado obc;
		Circulo obi;
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					obt= new Triangulo();
					ref=obt;
					ref.Area();
					ref.Mostrar();
					break;
				case 2:
					obr=new Rectangulo();
					ref=obr;
					ref.Area();
					ref.Mostrar();
					break;
				case 3:
					obc=new Cuadrado();
					ref=obc;
					ref.Area();
					ref.Mostrar();
					break;
				case 4:
					obi=new Circulo();
					ref=obi;
					ref.Area();
					ref.Mostrar();
			}
		while(op!=obm.Salir());
	}
}
