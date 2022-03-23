package UNIDAD2;

/* Tarea:
 * Aplicando los dos usos de la referencia "this", 
 * encuentra los primeros N numeros Perfectos, y presentalos
 */

public class Perfectos
{	
	private int n;
	public Perfectos(int n)
	{
		this.Calculo(this.n);
	}
	public void Calculo(int n)
	{
		int np=1;
        String numerosp="";
        int suma=0;
        while(np<5)
        {
            n++;
            for(int x=1;x<n;x++)
            {
                if(n%x==0)
                {
                   suma=suma+x;
                }
            }
            if(suma==n)
            {
                np=np+1;
                numerosp=numerosp+suma+"|";
                suma=0;
            }
            else
            {
                System.out.println(n+" no es Perfecto");
                suma=0;
            }
        }
        System.out.println("No. Perfecto: "+numerosp);
	}
}