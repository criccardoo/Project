package Entity;

import java.util.ArrayList;
import java.util.Date;

public class EntityOrdine {

    /* Definizione di variabili */

    private int identificativoOrdine;

    private float prezzoTotale;

    private Date dataAcquisto;

    private Date dataConsegna;

    private Stato stato;
    
    
    //Aggiungo collegamento con cliente registrato 
    private int idClienteRegistrato;
    private ArrayList<Integer> listaIdQuantita;

    /* Definizione il costruttore */

    public EntityOrdine(int identificativoOrdine, float prezzoTotale, Date dataAcquisto, Date dataConsegna, int idClienteRegistrato) {

        this.identificativoOrdine=identificativoOrdine;

        this.prezzoTotale=prezzoTotale;

        this.dataAcquisto=dataAcquisto;

        this.dataConsegna=dataConsegna;

        this.stato=Stato.IN_CORSO;
        
        this.idClienteRegistrato = idClienteRegistrato;
    }

    /* Definizione i metodi */

    public int getIdentificativoOrdine() {

        return this.identificativoOrdine;

    }

    public void setIdentificativoOrdine(int identificativoOrdine) {

        this.identificativoOrdine=identificativoOrdine;

    }

    public float getPrezzoTotale() {

        return this.prezzoTotale;

    }

    public void setPrezzoTotale(float prezzoTotale) {

        this.prezzoTotale=prezzoTotale;

    }

    public Date getDataAcquisto() {

        return this.dataAcquisto;

    }

    public void setDataAcquisto(Date dataAcquisto) {

        this.dataAcquisto=dataAcquisto;

    }

    public Date getDataConsegna() {

        return this.dataConsegna;

    }

    public void setDataConsegna(Date dataConsegna) {

        this.dataConsegna=dataConsegna;
        
    }

    public Stato getStato() {

        return this.stato;

    }

    public void setStato(Stato stato) {

        this.stato=stato;
        
    }
    
    public int getIdClienteRegistrato() {
    	
    	return this.idClienteRegistrato;
    	
    }

    public void setIdClienteRegistrato(int idClienteRegistrato) {
    	
    	this.idClienteRegistrato=idClienteRegistrato;
    	
    }
}
