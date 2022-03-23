package UNIDAD4;

public class ICliente implements ITienda2
{
	private int clv;
	private String nom, dir, tel, email, rfc;
	
	public void Lectura(int clv, String msj)
	{
		this.clv=clv;
		System.out.println("Dame los datos del "+msj);
		System.out.println("Clave "+clv);
		nom=obl.Cadena("Nombre");
		dir=obl.Cadena("Direccion");
		tel=obl.Cadena("Telefono");
		email=obl.Cadena("E-mail");
		rfc=obl.Cadena("RFC");
	}
	
	public void Mostrar(String msj)
	{
		System.out.println("Datos del "+msj);
		System.out.println(clv+"\t"+nom+"\t"+dir+"\t"+tel+"\t"+email+"\t"+rfc);
	}
}
