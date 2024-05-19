package Entity;

import java.util.Date;

public class EntityDipendente{
	
	
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String residenza;
	private String username;
	private String password;
	
	public EntityDipendente(String nome,String cognome,Date dataNascita, String residenza, String username, String password) {
		
		super();  //chiamo il costruttore di superclasse
		this.nome=nome;
		this.cognome=cognome;
		this.dataNascita= dataNascita;
		this.residenza= residenza;
		this.username=username;
		this.password=password;
		
	}
	
	public String getNome() {
		
		return this.nome;
				
	}
	
	public void setNome(String nome) {
		
		this.nome=nome;
		
	}
	
	public String getCognome() {
		
		return this.cognome;
				
	}
	
	public void setCognome(String cognome) {
		
		this.cognome=cognome;
		
	}
	
	public Date getDataNascita() {
		
		return this.dataNascita;
				
	}

	public void setDataNascita(Date dataNascita ) {
		
		this.dataNascita=dataNascita;
		
	}

	public String getResidenza() {
		
		return this.residenza;
				
	}
	
	public void setResidenza(String residenza) {
		
		this.residenza=residenza;
		
	}
	
	public String getUsername() {
		
		return this.username;
				
	}

	public void setUsername(String username) {
		
		this.username=username;
		
	}

	public String getPassword() {
		
		return this.password;
				
	}
	
	public void setPassword(String password) {
		
		this.password=password;
		
	}
	
}