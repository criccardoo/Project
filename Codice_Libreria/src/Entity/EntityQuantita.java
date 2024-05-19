package Entity;

public class EntityQuantita {

    /*Definizione delle variabili */

    private int quantitaArticolo;

    /*Definizione del costruttore */

    public EntityQuantita(int quantitaArticolo) {

        this.quantitaArticolo=quantitaArticolo;

    }

    /*Definizione dei metodi */

    public int getQuantitaArticolo() {

        return this.quantitaArticolo;
        
    }

    public void setQuantitaArticolo(int quantitaArticolo) {

        this.quantitaArticolo=quantitaArticolo;
        
    }
    
}
