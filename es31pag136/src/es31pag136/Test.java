package es31pag136;

public class Test {

	public static void main(String[] args) {
		
		Biblioteca al =new Biblioteca();
		
		//String autore, String libro, int anno, String editore
		Libro  l1 = new Libro("Verga","Biografia",19,"Mursia");
		Libro  l2 = new Libro("Verta","Biografia",19,"Mirsia");
		Libro  l3 = new Libro("Vefga","Biografia",19,"Murtia");
		Libro  l4 = new Libro("Verua","Bioglafia",19,"Murgia");
		try {
		
			al.aggiunta(l1);
			al.aggiunta(l2);
			al.aggiunta(l3);
			al.aggiunta(l4);
		
		stampa_biblio();
		al.ric_autore("Vefga");
		System.out.println(al.num_libri());
		al.ricerca("Bioglafia");
		}
		
		catch(BibliotecaException exc) {
			System.out.println(exc.getMessage());
		}
		
		catch(NullPointerException exc) {
			System.out.println("La ricerca e' conclusa");
		}
		catch(Exception exc) {
			System.out.println("Programma terminato improvvisamente");
		}
	}

}
