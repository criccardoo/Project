package Entity;

import java.util.Date;

public class EntityDownload {

    /* Definizione di variabili */

    private Date dataDownload;

    /* Definizione del costruttore */

    public EntityDownload(Date dateDownload) {

        this.dataDownload=dateDownload;

    }

    /* Definizione dei metodi */

    public Date getDataDownload() {

        return this.dataDownload;

    }

    public void setDataDownload(Date dateDownload) {

        this.dataDownload=dateDownload;

    }
    
}
