package UNIDAD3;

public class FiguraP
{
	public static void main(String[] args)
	{
		int op;
		Menu obm=new Menu("Menu Areas", new String[]{"Triangulo", "Rectangulo", "Cuadrado", "Circulo"});
		
		do
			switch(op=obm.Opcion())
			{
				case 1:
					new Triangulo();
					break;
				case 2:
					new Rectangulo();
					break;
				case 3:
					new Cuadrado();
					break;
				case 4:
					new Circulo(); 
			}
		while(op!=obm.Salir());
			
	}
}
