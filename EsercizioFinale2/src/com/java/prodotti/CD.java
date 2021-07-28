package com.java.prodotti;

import java.util.Arrays;

public class CD extends Prodotto implements ProdottoPrezzato {
	
	private String idProdotto;
	private final String sigla; 

	private double prezzo; 

	private String titoloAlbum;
	private String nomeArtista;
	private String[] elencoCanzoni;
	
	public CD(String descrizione, CategoriaProdotti categoria, String sigla, double prezzo,
			String titoloAlbum, String nomeArtista, String[] elencoCanzoni) {
		super(descrizione, categoria);
		this.sigla = sigla;
		this.prezzo = prezzo;
		this.titoloAlbum = titoloAlbum;
		this.nomeArtista = nomeArtista;
		this.elencoCanzoni = elencoCanzoni;
		this.idProdotto = generaIdProdotto(sigla);
	}
	
	private String generaIdProdotto(String sigla) {
		return sigla + Math.round(Math.random()*Math.pow(10,6));
	}

	public String getIdProdotto() {
		return idProdotto;
	}

	public String getSigla() {
		return sigla;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getTitoloAlbum() {
		return titoloAlbum;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public String[] getElencoCanzoni() {
		return elencoCanzoni;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public void setTitoloAlbum(String titoloAlbum) {
		this.titoloAlbum = titoloAlbum;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public void setElencoCanzoni(String[] elencoCanzoni) {
		this.elencoCanzoni = elencoCanzoni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(elencoCanzoni);
		result = prime * result + ((idProdotto == null) ? 0 : idProdotto.hashCode());
		result = prime * result + ((nomeArtista == null) ? 0 : nomeArtista.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prezzo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		result = prime * result + ((titoloAlbum == null) ? 0 : titoloAlbum.hashCode());
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
		CD other = (CD) obj;
		if (!Arrays.equals(elencoCanzoni, other.elencoCanzoni))
			return false;
		if (idProdotto == null) {
			if (other.idProdotto != null)
				return false;
		} else if (!idProdotto.equals(other.idProdotto))
			return false;
		if (nomeArtista == null) {
			if (other.nomeArtista != null)
				return false;
		} else if (!nomeArtista.equals(other.nomeArtista))
			return false;
		if (Double.doubleToLongBits(prezzo) != Double.doubleToLongBits(other.prezzo))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		if (titoloAlbum == null) {
			if (other.titoloAlbum != null)
				return false;
		} else if (!titoloAlbum.equals(other.titoloAlbum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CD [idProdotto=" + idProdotto + ", sigla=" + sigla + ", prezzo=" + prezzo + ", titoloAlbum="
				+ titoloAlbum + ", nomeArtista=" + nomeArtista + ", elencoCanzoni=" + Arrays.toString(elencoCanzoni)
				+ "]";
	}
	
	
}
