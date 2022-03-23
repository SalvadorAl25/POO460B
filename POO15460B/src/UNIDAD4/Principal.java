package UNIDAD4;

public class Principal
{
	public static void main(String[] args)
	{
		Persona ref;
		ref=new Profesor();
		ref.Lectura();
		ref.Mostrar();
		
		ref=new Estudiante();
		ref.Lectura();
		ref.Mostrar();
	}
}