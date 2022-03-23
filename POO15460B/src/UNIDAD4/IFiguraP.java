package UNIDAD4;

public class IFiguraP
{
	public static void main(String[] args)
	{
		int op;
		Menu obm=new Menu("Areas con Interfaces", new String[]{"Triangulo", "Rectangulo", "Cuadrado", "Circulo"});
		
		/*ITriangulo obt;
		IRectangulo obr;
		ICuadrado obc;
		ICirculo obi;*/
		IFigura ref;
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					ref=new ITriangulo();
					ref.Area();
					ref.Mostrar();
					break;
				case 2:
					ref=new IRectangulo();
					ref.Area();
					ref.Mostrar();
					break;
				case 3:
					ref=new ICuadrado();
					ref.Area();
					ref.Mostrar();
					break;
				case 4:
					ref=new ICirculo();
					ref.Area();
					ref.Mostrar();
			}
		while(op!=obm.Salir());
	}
}
