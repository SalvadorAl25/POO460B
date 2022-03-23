package UNIDAD5;

public class Lanzadora
{
	public void Size(int tam) throws SizeVectorException
	{
		if(tam<0)
			throw new SizeVectorException("El TamaÒo del vector no puede ser negativo...");
		if(tam==0)
			throw new SizeVectorException("El TamaÒo del vector no puede ser cero");
	}
	
	public void Control(String nc) throws ControlExcepcion
	{
		String validos="0123456789", nv="";
		int x, num;
		if(nc.length()!=8)
			throw new ControlExcepcion("No Son Los Digitos Correctos, son 8...");
		for(x=0; x<nc.length(); x++)
			if(validos.indexOf(nc.charAt(x))==-1)
				nv+=nc.charAt(x);
		if(nv.length()!=0)
				throw new ControlExcepcion("Caracter invalido "+nv+"...");
		if(!(nc.substring(2,4).equals("42")))
			throw new ControlExcepcion("El Numero No Es De Este Tecnologico");
		if(!(nc.substring(4, nc.length()).equals("0000")))
			throw new ControlExcepcion("No Deve Existir Alumno 0000");
		num=Integer.parseInt(nc.substring(0,2));
		if(num>17)
			throw new ControlExcepcion("el aÒo "+num+"no es valido...");
	}
	
	public void Nombre(String nom) throws NameExcepcion
	{
		int x;
		nom=nom.toUpperCase();
		String validos="ABCDEFGHIJKLMN—OPQRSTUVWXYZ¡…Õ”⁄. ", y="", voc="AEIOU¡…Õ”⁄", mal[]={"NEPE","PENE","PENDEJO","BENITOMAMESTA", "BENITOCAMELO", "DEVORATESTA"};
		if(nom.length()!=0)
			throw new NameExcepcion("La longitud del nombre es incorrecta...");
		for(x=0; x<nom.length(); x++)
			if(validos.indexOf(nom.charAt(x))==-1)
				y+=nom.charAt(x);
		if(y.length()!=0)
			throw new NameExcepcion("El Caracter: "+y+ ", No Es Valido");
		y="";
		for (x = 0; x < nom.length(); x++)
			if(voc.indexOf(nom.charAt(x))!=-1)
				y+=nom.charAt(x);
		if(y.length()==0)
			throw new NameExcepcion("El nombre debe tener al menos una vocal...");
		y="";
		for(x=0; x<mal.length; x++)
			if(mal[x].equals(nom))
				y+=mal[x]+" ";
		if(y.length()!=0)
			throw new NameExcepcion("Palabras incorrecta"+y+"...");
	}
}
