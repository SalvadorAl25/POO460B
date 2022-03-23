package UNIDAD1;

//String cad;
//cad=new String();
//cad=new String("Texto" u Otro_cadena);
//cad=new String(var_StringBuffer);
//cad=new String (Arreglo_char);
//cad=new String(Arreglo_char, posicion_inicial, numero_elementos);
//cad=new String(Arreglo_bytes, 0);
//cad=new String(Arreglo_bytes, 0, posicion_inicial, numero_elementos);

//Leer una cadena y presentarla de manera invertida
//leer una cadena y ver cuantas vocales tiene la cadena(hacer)

//crear el diagrama de clases vector matriz y cadena
public class Cadenas
{
	private String cad, lista[];
	private Datos obl=new Datos();
	int ind;
	
	public void Lectura()
	{
		cad=obl.Cadena("Dame Una Cadena");
	}
	public void Mostrar()
	{
		System.out.println(cad);
	}
	public void Invertir()
	{
		//int ini 
		int fin;
		/*char vec[]=new char[cad.length()];
		vec=cad.toCharArray();
		char aux;
		for (ini = 0, fin=vec.length-1; ini<fin; ini++, fin--)
		{
			aux=vec[ini];
			vec[ini]=vec[fin];
			vec[fin]=aux;
		}
		cad=new String(cad);*/
		String cad2="";
		for (fin=cad.length()-1; fin>=0; fin--)
			cad2=cad2+cad.charAt(fin);
		cad=cad2;
	}
	public void Palindromo()
	{
		cad=cad.toUpperCase();
		String aux=new String(cad);
		this.Invertir();
		if(cad.equals(aux))
			System.out.println("Es Un Palindromo...");
		else
			System.out.println("No Es Un Palindromo...");
	}
	public void Remplazo()
	{
		char org, rem;
		org=obl.Caracter("Caracter original");
		rem=obl.Caracter("Caracter de remplazo");
		cad=cad.replace(org, rem);
	}
	public void Vocales()
	{
		String voc="AEIOUaeiou¡…Õ”⁄·ÈÌÛ˙¸‹";
		String conso="BCDFGHJKLMN—PQRSTVWXYZbcdfghjklmnÒpqrstvwxyz";
		int con=0, conc=0;
		for(ind=0; ind<cad.length(); ind++)
		{
			if(voc.indexOf(cad.charAt(ind))!=-1)
				con++;
			if(conso.indexOf(cad.charAt(ind))!=-1)
				conc++;
		}
		System.out.println("Cantidad de vocales "+con);
		System.out.println("Cantidad de Consonantes "+conc);
	}
	public void BUSCAab()
	{
		int con=0;
		String sub;
		sub=obl.Cadena("Dame la sub-cadena a buscar");
		for (ind = 0; ind < cad.length(); ind++)
		{
			ind=cad.toUpperCase().indexOf(sub.toUpperCase(), ind);
			if(ind!=-1)
				con++;
			else
				break;
		}
		System.out.println("La Sub-cadena la encontre "+con+" veces...");
	}
	public void TamaÒolista()
	{
		do
			ind=obl.Entero("TamaÒo de la lista");
		while(ind<1);
		lista=new String[ind];
	}
	public void LeerLista()
	{
		System.out.println("Dame los "+lista.length+" nombres de la lista...");
		for (ind = 0; ind < lista.length; ind++)
			lista[ind]=obl.Cadena((ind+1)+".-");
	}
	public void MostrarLista()
	{
		System.out.println("Nombres de la lista...");
		for (ind = 0; ind < lista.length; ind++)
			System.out.println((ind+1)+".-\t"+lista[ind]);
	}
	public void BuscarLista()
	{
		boolean ban=true;
		cad=obl.Cadena("Nombre o Apellido a buscar");
		for (ind = 0; ind < lista.length; ind++)
			if(lista[ind].toUpperCase().indexOf(cad.toUpperCase())!=-1)
			{
				System.out.println(lista[ind]);
				ban=false;
			}
		if(ban)
			System.out.println("No Existe nadie con ese nombre o apellido...");
	}
	public void Ordenar()
	{
		int x;
		for (ind = 0; ind < lista.length; ind++)
			for (x = 0; x < lista.length-1; x++)
				if(lista[x].toLowerCase().compareTo(lista[x+1].toLowerCase())>0)
				{
					cad=lista[x];
					lista[x]=lista[x+1];
					lista[x+1]=cad;
				}
	}
	public void MenuTamaÒo()
	{
		do
			ind=obl.Entero("TamaÒo del Menu");
		while(ind>1);
		lista=new String[ind+1];
	}
	public void MenuOpciones()
	{
		System.out.println("Dame Las "+(lista.length-1)+" Opciones del menu");
		for (ind = 0; ind < lista.length-1; ind++)
			lista[ind]=obl.Cadena((ind+1)+"\t").toUpperCase();
		lista[ind]="Salir";
	}
	private void MenuMostrar()
	{
		System.out.println("  MENU  ");
		for (ind = 0; ind < lista.length; ind++)
			System.out.println((ind+1)+".- "+lista[ind]);
	}
	public void MenuOpcion()
	{
		int op;
		do
		{
			this.MenuMostrar();
			op=obl.Entero("Cual Es Tu Opcion?");
		}
		while(op!=lista.length);
	}
}
/*el uso del this es para distinguir unos datoos de otros, es decir que conn 
 * el mismo metodo 
es para generar llamadas encadenadas, y mandar llamar multiples metodos de 
la misma clase*/




