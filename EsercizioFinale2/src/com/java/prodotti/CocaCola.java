package com.java.prodotti;

import com.java.prodotti.ProdottoPrezzato;
import com.java.prodotti.TipoUnita;

public class CocaCola extends Prodotto implements ProdottoPrezzato {
	
	private String idProdotto;
	private final String sigla; 
	
	private double prezzoSingolo;
	private int numeroUnita;

	private String tipo; 
	private TipoUnita tipoUnita; 
	private double quantita;
	
	public CocaCola(String descrizione, CategoriaProdotti categoria, String sigla,
			double prezzoSingolo, int numeroUnita, String tipo, TipoUnita tipoUnita, double quantita) {
		super(descrizione, categoria);
		this.idProdotto = idProdotto;
		this.sigla = sigla;
		this.prezzoSingolo = prezzoSingolo;
		this.numeroUnita = numeroUnita;
		this.tipo = tipo;
		this.tipoUnita = tipoUnita;
		this.quantita = quantita;
		this.idProdotto = generaIdProdotto(sigla); 
	}

	public String getIdProdotto() {
		return idProdotto;
	}

	public String getSigla() {
		return sigla;
	}

	public double getPrezzoSingolo() {
		return prezzoSingolo;
	}

	public int getNumeroUnita() {
		return numeroUnita;
	}

	public String getTipo() {
		return tipo;
	}

	public TipoUnita getTipoUnita() {
		return tipoUnita;
	}

	public double getQuantita() {
		return quantita;
	}

	public void setPrezzoSingolo(double prezzoSingolo) {
		this.prezzoSingolo = prezzoSingolo;
	}

	public void setNumeroUnita(int numeroUnita) {
		this.numeroUnita = numeroUnita;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setTipoUnita(TipoUnita tipoUnita) {
		this.tipoUnita = tipoUnita;
	}

	public void setQuantita(double quantita) {
		this.quantita = quantita;
	} 
	
	private String generaIdProdotto(String sigla) {
		return sigla + Math.round(Math.random() * Math.pow(10, 6));
	}
	
	public double getPrezzo() {
		return numeroUnita * prezzoSingolo; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((idProdotto == null) ? 0 : idProdotto.hashCode());
		result = prime * result + numeroUnita;
		long temp;
		temp = Double.doubleToLongBits(prezzoSingolo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quantita);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((tipoUnita == null) ? 0 : tipoUnita.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CocaCola other = (CocaCola) obj;
		if (idProdotto == null) {
			if (other.idProdotto != null)
				return false;
		} else if (!idProdotto.equals(other.idProdotto))
			return false;
		if (numeroUnita != other.numeroUnita)
			return false;
		if (Double.doubleToLongBits(prezzoSingolo) != Double.doubleToLongBits(other.prezzoSingolo))
			return false;
		if (Double.doubleToLongBits(quantita) != Double.doubleToLongBits(other.quantita))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (tipoUnita != other.tipoUnita)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CocaCola [idProdotto=" + idProdotto + ", sigla=" + sigla + ", prezzoSingolo=" + prezzoSingolo
				+ ", numeroUnita=" + numeroUnita + ", tipo=" + tipo + ", tipoUnita=" + tipoUnita + ", quantita="
				+ quantita + "]";
	}
	
	
}

	
