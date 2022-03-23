package UNIDAD2;

public class Menu
{
	Datos obl=new Datos();
	private String titulo, op[];
	private int ind;
	
	public Menu()
	{
		do
			ind=obl.Entero("Número De Opciones del Menú...");
		while(ind<1);
		op=new String[ind+1];
		titulo=obl.Cadena("Titulo Del Menú").toUpperCase();
		for(ind=0; ind<op.length-1; ind++)
			op[ind]=obl.Cadena((ind+1)+") ");
		op[ind]="Salir";
	}
	
	public Menu(int tam)
	{
		op=new String[tam+1];
		this.TextoMenu();
	}
	
	private void TextoMenu()
	{
		do
			ind=obl.Entero("Número De Opciones del Menú...");
		while(ind<1);
		op=new String[ind+1];
		titulo=obl.Cadena("Titulo Del Menú").toUpperCase();
		for(ind=0; ind<op.length-1; ind++)
			op[ind]=obl.Cadena((ind+1)+") ");
		op[ind]="Salir";
	}
	
	public Menu(String titulo, String op[])
	{
		this.op=new String[op.length];
		this.titulo=titulo;
		for(ind=0; ind<this.op.length-1; ind++)
			this.op[ind]=op[ind];
		this.op[ind]="Salir";
	}
	
	public Menu(String op[],String titulo)
	{
		//busca el constructor similar, osea, el de arriba
		this(titulo, op);
	}
	private void Mostrar()
	{
		System.out.println("\n"+titulo.toUpperCase());
		for (ind = 0; ind < op.length; ind++)
			System.out.println("\t"+(ind+1)+") "+op[ind].toUpperCase());
	}
	
	public int Opcion()
	{
		int opc;
		do
		{
			this.Mostrar();
			opc=obl.Entero("¿Cual es tu opcion?");
			System.out.println();
		}
		while(opc<1 || opc>op.length);
		return opc;
	}
	
	public int Salir()
	{
		return op.length;
	}
}