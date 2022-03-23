package UNIDAD3;

public class Persona
{
	private String nom, dir, mail;
	
	public void Leer()
	{
		Datos obl=new Datos();
		nom=obl.Cadena("Nombre");
		dir=obl.Cadena("Direccion");
		mail=obl.Cadena("e-Mail");
	}
	public void Mostrar()
	{
		System.out.println("Nombre: "+nom);
		System.out.println("Direccion: "+dir);
		System.out.println("e-mail: "+mail);
	}
}
