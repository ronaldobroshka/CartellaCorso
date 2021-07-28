package com.java.prodotti;

public class Zucchero extends Prodotto implements ProdottoPrezzato {

	private String idProdotto;
	private final String sigla; 

	private double prezzoAlKg ;
	private double peso;

	private String tipo; 
	
	public Zucchero(String descrizione, CategoriaProdotti categoria, String sigla, double prezzoAlKg,
			double peso, String tipo) {
		super(descrizione, categoria);
		this.idProdotto = idProdotto;
		this.sigla = sigla;
		this.prezzoAlKg = prezzoAlKg;
		this.peso = peso;
		this.tipo = tipo;
		this.idProdotto = generaIdProdotto(sigla);
	} 
	
	public String getIdProdotto() {
		return idProdotto;
	}

	public String getSigla() {
		return sigla;
	}

	public double getPrezzoAlKg() {
		return prezzoAlKg;
	}
	
	public double getPrezzo() {
		return prezzoAlKg * peso;
	}
	public double getPeso() {
		return peso;
	}

	public String getTipo() {
		return tipo;
	}


	public void setPrezzoAlKg(double prezzoAlKg) {
		this.prezzoAlKg = prezzoAlKg;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private String generaIdProdotto(String sigla) {
		return sigla + Math.round(Math.random()*Math.pow(10,6));
	}

}
