package Entity;

public class EntityLibro{
	
	protected String titolo;
	
	protected String autore;
	
	protected String casaEditrice;
	
	protected int codiceISBN;
	
	protected String genere;
	
	protected float prezzo;
	
	protected boolean disponibilitaLibro;
	
	public EntityLibro (String titolo, String autore, String casaEditrice, int codiceISBN, String genere, float prezzo, boolean disponibilitaLibro){
		
		super();
		this.titolo=titolo;
		this.autore=autore;
		this.casaEditrice=casaEditrice;
		this.codiceISBN=codiceISBN;
		this.genere=genere;
		this.prezzo=prezzo;
		this.disponibilitaLibro=disponibilitaLibro;
		
	}
	
	
	public String getTitolo() {
		
		return this.titolo;
		
	}
	
	
	public void setTitolo(String titolo) {
		
		this.titolo=titolo;
		
	}
	
	
	public String getAutore() {
		
		return this.autore;
		
	}
	
	
	public void setAutore(String autore) {
		
		this.autore=autore;
		
	}
	
	
	public String getCasaEditrice() {
		
		return this.casaEditrice;
		
	}
	
	
	public void setCasaEditrice(String casaEditrice) {
		
		this.casaEditrice=casaEditrice;
		
	}
	
	
	public int getCodiceISBN() {
		
		return this.codiceISBN;
		
	}
	
	public void setCodiceISBN(int codiceISBN) {
		
		this.codiceISBN=codiceISBN;
		
	}
	
	public String getGenere() {
		
		return this.genere;
		
	}
	
	
	public void setGenere(String genere) {
		
		this.genere=genere;
				
	}
	
	
	public float getPrezzo() {
		
		return this.prezzo;
		
	}
	
	
	public void setPrezzo(float prezzo) {
		
		this.prezzo=prezzo;
		
	}
	
	
	public boolean getDisponibiltaLibro() {
		
		return this.disponibilitaLibro;
		
	}
	
	
	public void setDisponibilitaLibro(boolean disponibilitaLibro) {
		
		this.disponibilitaLibro=disponibilitaLibro;
		
	}
	
	
	
}