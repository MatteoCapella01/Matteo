package es31pag136;

public class BibliotecaException extends Exception
{
	private String messaggio = "Biblioteca piena";
	
	BibliotecaException(){
		
	}
	
	public String getMessage()
	{
		return messaggio;
	}
}
