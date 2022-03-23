package UNIDAD5;

public class SizeVectorException extends NegativeArraySizeException
{
	private static final long serialVersionUID = 1L;

	public SizeVectorException(String msj)
	{
		super(msj);
	}
}