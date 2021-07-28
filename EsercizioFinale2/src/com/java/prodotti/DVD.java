package com.java.prodotti;

public class DVD extends Prodotto implements ProdottoPrezzato {

	private String idProdotto;
	private final String sigla; 

	private double prezzo; 

	private String titoloFilm;
	private String regista;
	
	
	public DVD(String descrizione, CategoriaProdotti categoria, String idProdotto, String sigla, double prezzo,
			String titoloFilm, String regista) {
		super(descrizione, categoria);
		this.sigla = sigla;
		this.prezzo = prezzo;
		this.titoloFilm = titoloFilm;
		this.regista = regista;
		this.idProdotto = generaIdProdotto(sigla);
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


	public String getTitoloFilm() {
		return titoloFilm;
	}

	public String getRegista() {
		return regista;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public void setTitoloFilm(String titoloFilm) {
		this.titoloFilm = titoloFilm;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	private String generaIdProdotto(String sigla) {
		return sigla + Math.round(Math.random()*Math.pow(10,6));
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((idProdotto == null) ? 0 : idProdotto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prezzo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((regista == null) ? 0 : regista.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		result = prime * result + ((titoloFilm == null) ? 0 : titoloFilm.hashCode());
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
		DVD other = (DVD) obj;
		if (idProdotto == null) {
			if (other.idProdotto != null)
				return false;
		} else if (!idProdotto.equals(other.idProdotto))
			return false;
		if (Double.doubleToLongBits(prezzo) != Double.doubleToLongBits(other.prezzo))
			return false;
		if (regista == null) {
			if (other.regista != null)
				return false;
		} else if (!regista.equals(other.regista))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		if (titoloFilm == null) {
			if (other.titoloFilm != null)
				return false;
		} else if (!titoloFilm.equals(other.titoloFilm))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "DVD [idProdotto=" + idProdotto + ", sigla=" + sigla + ", prezzo=" + prezzo + ", titoloFilm="
				+ titoloFilm + ", regista=" + regista + "]";
	}

}
