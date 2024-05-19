package Entity;

import java.util.Date;

public class EntityDownload {

    /* Definizione di variabili */
	
    private Date dataDownload;
    
    private int idLibroDigitale ;
    
    /* Definizione del costruttore */

    public EntityDownload(Date dateDownload, int idLibroDigitale) {

        this.dataDownload=dateDownload;
        
        this.idLibroDigitale=idLibroDigitale;

    }

    /* Definizione dei metodi */

    public Date getDataDownload() {

        return this.dataDownload;

    }

    
    public void setDataDownload(Date dateDownload) {

        this.dataDownload=dateDownload;

    }
    


	public int getIdLibroDigitale() {
		
		return this.idLibroDigitale;
		
	}
	
	
	public void setIdLibroDigitale(int idLibroDigitale) {
		
		this.idLibroDigitale=idLibroDigitale;
		
	}
}