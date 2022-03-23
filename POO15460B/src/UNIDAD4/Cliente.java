package UNIDAD4;

public class Cliente extends Tienda
{
	private int clv;
	private String nom, dir, tel, email, rfc;

	void Lectura(int clv, String msj)
	{
		this.clv = clv;
		System.out.println("Dame los datos del " + msj);
		System.out.println("Clave: " + clv);
		nom = obl.Cadena("Nombre: ").toUpperCase();
		dir = obl.Cadena("Direccion: ").toUpperCase();
		tel = obl.Cadena("Telefono: ");
		email = obl.Cadena("E-mail").toUpperCase();
		rfc = obl.Cadena("RFC").toUpperCase();
	}

	void Mostrar(String msj)
	{
		System.out.println("Datos del " + msj);
		System.out.print(clv + "\t" + nom + "\t" + dir + "\t" + tel + "\t" + email + "\t" + rfc);
	}
}
