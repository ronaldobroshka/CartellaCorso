package com.java.prodotti;

public class Nutella extends Prodotto implements ProdottoPrezzato {

	private String IDProdotto; 
	private final String sigla; 
	private double prezzo;
	private String calorieProdotto; 
	
	public Nutella(String descrizione, CategoriaProdotti categoria, String sigla, 
			double prezzo, String calorieProdotto) {
		super(descrizione, categoria);
		this.sigla = sigla; 
		this.prezzo = prezzo; 
		this.calorieProdotto = calorieProdotto;
		this.IDProdotto = generaIdProdotto(sigla);
	}

	public String getIdProdotto() {
		return IDProdotto;
	}

	public String getSigla() {
		return sigla;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getCalorieProdotto() {
		return calorieProdotto;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public void setCalorieProdotto(String calorieProdotto) {
		this.calorieProdotto = calorieProdotto;
	}

	private String generaIdProdotto(String sigla) {
		return sigla + Math.round(Math.random()*Math.pow(10,6));
	}
	
	

}
