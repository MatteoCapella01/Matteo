package es31pag136;

public class Biblioteca {
	

	private Libro biblioteca[];
	private char[] toString;
	static private int Nmax=1000;
	
	public Biblioteca() {
		
		biblioteca = new Libro[Nmax];
	}

	public Libro[] getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Libro[] biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	public static int getNmax() {
		return Nmax;
	}

	public static void setNmax(int nmax) {
		Nmax = nmax;
	}

	public void aggiunta(Libro gt) throws BibliotecaException 
	{
			int i;
			for(i=0;i<Nmax;i++) {
			
				if(biblioteca[i]==null) {
				
					biblioteca[i]=gt;
					break;}
				}				
				if(i==Nmax-1)
					throw new BibliotecaException();
		}
		
	public void stampa_biblio() t
	{		int i;
			for(i=0;i<Nmax;i++) {
	try {		 
				biblioteca[i].toString();
		}				
	catch(NullPointerException) { System.out.println("");
	}
	}
		}
	}
	
	public void ricerca(String nm) throws NullPointerException {
		
		int i;
		for(i=0;i<Nmax;i++) {
	try {		
			if(biblioteca[i].getNome().equals(nm)) {
				
				 biblioteca[i].toString();				
			} 		
		
	System.out.println("fine ricerca per titolo")
	}
		catch() { System.out.println("");
	
	}
	
	
	public void ric_autore(String au) throws NullPointerException {
		
		int i;

		for(i=0;i<Nmax;i++) {
			
			if(biblioteca[i].getAutore().equals(au)) {
				
				biblioteca[i].toString();		
				
			}
		}
	}
	
	public int num_libri() {
		
		int f=0;
		for(Libro a:biblioteca) {
			
			if(a==null) {
				
				f++;
			}
		}
		return f;
	}
}
