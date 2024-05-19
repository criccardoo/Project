package Entity;

public class EntityQuantita {

    /*Definizione delle variabili */

    private int quantitaArticolo;

    private int idLibro;
    
    /*Definizione del costruttore */

    public EntityQuantita(int quantitaArticolo, int idLibro) {

        this.quantitaArticolo=quantitaArticolo;
        this.idLibro= idLibro;

    }

    /*Definizione dei metodi */

    public int getQuantitaArticolo() {

        return this.quantitaArticolo;
        
    }

    public void setQuantitaArticolo(int quantitaArticolo) {

        this.quantitaArticolo=quantitaArticolo;
        
    }
    
    public int getIdLibro(){
    	
    	return this.idLibro;
    	
    }
    
    public void setIdLibro(int idLibro) {
    	
    	this.idLibro=idLibro;
    	
    }
    
}
