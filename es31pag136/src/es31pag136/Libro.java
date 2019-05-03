package es31pag136;

public class Libro {
	
	private String autore;
	private String nome;
	private int anno;
	private String editore;
	
	public Libro(String autore, String nome, int anno, String editore) {
		
		this.autore = autore;
		this.nome = nome;
		this.anno = anno;
		this.editore = editore;
	}
	
	public Libro(Libro l) {
		
		autore=l.getAutore();
		nome=l.getNome();
		anno=l.getAnno();
		editore=l.getEditore();
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", nome=" + nome + ", anno=" + anno + ", editore=" + editore + "]";
	}
}
