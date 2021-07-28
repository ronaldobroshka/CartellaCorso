package com.java.persone;

public class Professore extends Persona{
	private String nome;
	private String cognome;
	private char sesso; 
	private String indirizzo; 
	
	private String codiceDocente;
	private String dipartimento; 
	
	public Professore(String nome, String cognome, char sesso, String indirizzo,
			 String codiceDocente, String dipartimento) {
		super(nome, cognome, sesso, indirizzo);
		this.codiceDocente = codiceDocente; 
		this.dipartimento = dipartimento;
	}


	public String getCodiceDocente() {
		return codiceDocente;
	}

	public String getDipartimento() {
		return dipartimento;
	}


	public void setCodiceDocente(String codiceDocente) {
		this.codiceDocente = codiceDocente;
	}

	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	public void visualizza() {
		super.visualizza();
		System.out.println("CODICE: " + codiceDocente);
		System.out.println("DIPARTIMENTO: " + dipartimento);
	}
}

