package Entity;

public class EntityClienteRegistrato {

    /* Definizione delle variabili */

    private String username;

    private String password;

    private String indirizzoEmail;

    private String indirizzoSpedizione;

    /* Definizione del costruttore */

    public EntityClienteRegistrato(String username, String password, String indirizzoEmail, String indirizzoSpedizione) {

        super();

        this.username = username;

        this.password=password;

        this.indirizzoEmail=indirizzoEmail;

        this.indirizzoSpedizione=indirizzoSpedizione;

    }

    /* Definizione dei metodi */

    public String getUsername() {

        return this.username;

    }

    public void setUsername(String username){

        this.username=username;

    }

    public String getPassword() {

        return this.password;

    }

    public void setPassword(String password) {

        this.password=password;

    }

    public String getIndirizzoEmail() {

        return this.indirizzoEmail;

    }

    public void setIndirizzoEmail(String indirizzoEmail) {

        this.indirizzoEmail=indirizzoEmail;

    }

    public String getIndirizzoSpedizione() {

        return this.indirizzoSpedizione;

    }

    public void setIndirizzoSpedizione(String indirizzoSpedizione) {

        this.indirizzoSpedizione=indirizzoSpedizione;

    }
}