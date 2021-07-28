package com.java.persone;

public class Dipendente extends Persona {

	private String codiceTesserino; 
	private int annoAssunzione; 
	private String nomeUtente; 
	private String password; 
	
	public Dipendente(String nome, String cognome, char sesso, String indirizzo,  
			String nomeUtente, String password) {
		super(nome, cognome, sesso, indirizzo);
		this.codiceTesserino = generaCodiceTesserino();
		this.annoAssunzione = generaAnnoAssunzione();
		this.nomeUtente = nomeUtente;
		this.password = password;
	}

	public String getCodiceTesserino() {
		return codiceTesserino;
	}

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}
	
	private boolean accesso() {
		 System.out.println("Inserisci il tuo username: ");
		 String user = in.next();
		 System.out.println("Inserisci la tua password: ");
		 String pass = in.next();
		 
		 return(nomeUtente.equals(user) && password.contentEquals(pass))
			? true : false;
	}

	public boolean modificaCredenziali() {
		if(accesso()) {
			System.out.print("Inserisci un nuovo nome utente: ");
			String s1 = in.next(); 
			System.out.print("Inserisci una nuova password: ");
			String s2 = in.next(); 
			System.out.print("Conferma password: ");
			String s3 = in.next(); 
			
			if(s1.equals("") || s2.equals(""))
				return false;
			
			if(s1.equals(" ") || s2.equals(" "))
				return false;
			
			if(!s2.contentEquals(s3)) 
				return false;
			
			if(s2.length() < 6)
				return false; 
			// IF A CASCATA
			
			nomeUtente = s1; 
			password = s2; 
			return true; 
		}
		else 
			return true;
	}
	
	private String generaCodiceTesserino() {
		return "CP" + Math.round(Math.random() * Math.pow(10, 6));
	}
	
	private int generaAnnoAssunzione() {
		return 2021;
	}
	
	public String[] getCredenziali() {
		if(accesso()) {
			String[] credenziali = {nomeUtente, password};
			return credenziali;
		}
		
		return null; 
	}

	@Override
	public String toString() {
		String s = super.toString(); 
		return "Impiegato [codiceTesserino=" + codiceTesserino + ", annoAssunzione=" + 
				annoAssunzione + "]";
	}
	
}
