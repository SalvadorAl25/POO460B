package UNIDAD3;
/* Tarea
 * Cliente: Clave[Automatica], nombre, direccion, telefono, e-mail, rfc
 * Proveedor: *, Credito
 * Trabajador *, sueldo, antigüedad.
 * 
 * Nota: con constructores
 */
public class Cliente
{
	private String nom, pat, mat, dir, tel, email, rfc;
	private int dia, mes, año;
	public Datos obd=new Datos();
	
	public Cliente()
	{
		int lim;
		do
			nom=obd.Cadena("Nombre").toUpperCase();
		while(nom.length()==0);
		do
			pat=obd.Cadena("A. Paterno").toUpperCase();
		while(pat.length()==0);
		mat=obd.Cadena("A. Materno").toUpperCase();
		do
			año=obd.Entero("año");
		while(año<1917 || año>2017);
		do
			mes=obd.Entero("Mes");
		while(mes<1 || mes>12);
		switch(mes)
		{
			case 2: 
				if(año%4==0 && año%100==0)
					lim=29;
				else
					lim=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lim=30;
			default:
				lim=31;
		} 
		do
			dia=obd.Entero("Dia");
		while(dia<1 || dia>lim);
		this.RFC();
		System.out.println("RFC "+rfc);
		dir=obd.Cadena("Direccion:");
		ValNum();
		email=obd.Cadena("E-Mail");
		System.out.println("Nombre: "+nom+" "+pat+" "+mat+"\nDireccion: "+dir+"\nTelefono: "+tel+"\nE-Mail: "+email);
	}
	
	private void ValNum()
	{
		//(xxx)x-xx-xx
		String tele="()--";
		String tel;
		tel=obd.Cadena("Telefono((123)4-56-78): ");
		if(tele.indexOf(tel.charAt(0))!=-1)
			if(tele.indexOf(tel.charAt(4))!=-1)
				if(tele.indexOf(tel.charAt(6))!=-1)
					if(tele.indexOf(tel.charAt(9))!=1)
						this.tel=tel;
					else
						System.out.println("El Numero esta mal escrito");
				else
					System.out.println("El numero esta mal escrito");
			else
				System.out.println("El numero esta mal escrito");
		else
			System.out.println("El numero esta mal escrito");
	}
	
	private void RFC()
	{
		int pos;
		rfc="";
		rfc+=pat.charAt(0);
		for(pos=1; pos<pat.length(); pos++)
			if("AEIOU".indexOf(pat.charAt(pos))!=-1)
				break;
		rfc+=pat.charAt(pos);
		if(mat.length()==0)
			rfc+="X";
		else
			rfc+=mat.charAt(0);
		rfc+=nom.charAt(0);
		rfc+=año%100;
		if(mes<10)
			rfc+="0";
		rfc+=mes;
		if(dia<10)
			rfc+="0";
		rfc+=dia;
	}
}