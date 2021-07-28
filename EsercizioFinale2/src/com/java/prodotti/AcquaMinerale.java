package com.java.prodotti;

public class AcquaMinerale extends Prodotto implements ProdottoPrezzato {
	
	private String IDProdotto; 
	private final String sigla; 
	private double prezzoSingoloProdotto;
	private int numeroProdottiPerConfezione;
	private String marcaProdotto; 
	
	public AcquaMinerale(String descrizione, CategoriaProdotti categoria, String sigla,
			double prezzoSingoloProdotto, int numeroProdottiPerConfezione, 
			String marcaProdotto) {
		super(descrizione, categoria);
		this.sigla = sigla; 
		this.prezzoSingoloProdotto = prezzoSingoloProdotto; 
		this.numeroProdottiPerConfezione = numeroProdottiPerConfezione; 
		this.marcaProdotto = marcaProdotto;
		this.IDProdotto = generaIdProdotto(sigla);
	}

	public String getIdProdotto() {
		return IDProdotto;
	}

	public String getSigla() {
		return sigla;
	}

	public double getPrezzoSingoloProdotto() {
		return prezzoSingoloProdotto;
	}

	public int getNumeroProdottiPerConfezione() {
		return numeroProdottiPerConfezione;
	}
	
	public double getPrezzo() {
		return numeroProdottiPerConfezione*prezzoSingoloProdotto;
	}
	
	public String getMarcaProdotto() {
		return marcaProdotto;
	}

	public void setPrezzoSingoloProdotto(double prezzoSingoloProdotto) {
		this.prezzoSingoloProdotto = prezzoSingoloProdotto;
	}

	public void setNumeroProdottiPerConfezione(int numeroProdottiPerConfezione) {
		this.numeroProdottiPerConfezione = numeroProdottiPerConfezione;
	}

	public void setMarcaProdotto(String marcaProdotto) {
		this.marcaProdotto = marcaProdotto;
	}

	private String generaIdProdotto(String sigla) {
		return sigla + Math.round(Math.random()*Math.pow(10,6));
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((IDProdotto == null) ? 0 : IDProdotto.hashCode());
		result = prime * result + ((marcaProdotto == null) ? 0 : marcaProdotto.hashCode());
		result = prime * result + numeroProdottiPerConfezione;
		long temp;
		temp = Double.doubleToLongBits(prezzoSingoloProdotto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
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
		AcquaMinerale other = (AcquaMinerale) obj;
		if (IDProdotto == null) {
			if (other.IDProdotto != null)
				return false;
		} else if (!IDProdotto.equals(other.IDProdotto))
			return false;
		if (marcaProdotto == null) {
			if (other.marcaProdotto != null)
				return false;
		} else if (!marcaProdotto.equals(other.marcaProdotto))
			return false;
		if (numeroProdottiPerConfezione != other.numeroProdottiPerConfezione)
			return false;
		if (Double.doubleToLongBits(prezzoSingoloProdotto) != Double.doubleToLongBits(other.prezzoSingoloProdotto))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AcquaMinerale [IDProdotto=" + IDProdotto + ", sigla=" + sigla + ", prezzoSingoloProdotto="
				+ prezzoSingoloProdotto + ", numeroProdottiPerConfezione=" + numeroProdottiPerConfezione
				+ ", marcaProdotto=" + marcaProdotto + "]";
	}
	
	
	

}
