package Entity;

public class EntityLibroCartaceo extends EntityLibro{
	
	
	private int quantitaDisponibile;
	
	public EntityLibroCartaceo (String titolo, String autore, String casaEditrice, int codiceISBN, String genere, float prezzo, int quantitaDisponibile, boolean disponibilitaLibro){
		
		super(titolo, autore, casaEditrice, codiceISBN, genere, prezzo, disponibilitaLibro);
		
		this.quantitaDisponibile=quantitaDisponibile;
		
	}

	
	public int getQuantitaDisponibile() {
		
		return this.quantitaDisponibile;
		
	}
	
	public void setQuantitàDisponibile(int quantitaDisponibile) {
		
		this.quantitaDisponibile=quantitaDisponibile;
		
	}
	

}
