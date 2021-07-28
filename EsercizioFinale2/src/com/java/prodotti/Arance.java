package com.java.prodotti;

public class Arance extends Prodotto implements ProdottoPrezzato {
	
	private String IDProdotto; 
	private final String sigla; 
	private double prezzoAlKg;
	private double peso;
	private String origineProdotto; 
	
	public Arance(String descrizione, CategoriaProdotti categoria, String sigla,
			double peso, String origineProdotto) {
		super(descrizione, categoria);
		this.sigla = sigla; 
		this.peso = peso; 
		this.origineProdotto = origineProdotto;
		this.IDProdotto = generaIdProdotto(sigla);
	}

	public String getIdProdotto() {
		return IDProdotto;
	}

	public String getSigla() {
		return sigla;
	}

	public double getPrezzoAlKg() {
		return prezzoAlKg;
	}

	public double getPeso() {
		return peso;
	}

	public String getOrigineProdotto() {
		return origineProdotto;
	}
	
	private String generaIdProdotto(String sigla) {
		return sigla + Math.round(Math.random()*Math.pow(10,6));
	}
	
	public double getPrezzo() {
		return prezzoAlKg*peso;
	}

	public void setPrezzoAlKg(double prezzoAlKg) {
		this.prezzoAlKg = prezzoAlKg;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setOrigineProdotto(String origineProdotto) {
		this.origineProdotto = origineProdotto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((IDProdotto == null) ? 0 : IDProdotto.hashCode());
		result = prime * result + ((origineProdotto == null) ? 0 : origineProdotto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prezzoAlKg);
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
		Arance other = (Arance) obj;
		if (IDProdotto == null) {
			if (other.IDProdotto != null)
				return false;
		} else if (!IDProdotto.equals(other.IDProdotto))
			return false;
		if (origineProdotto == null) {
			if (other.origineProdotto != null)
				return false;
		} else if (!origineProdotto.equals(other.origineProdotto))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(prezzoAlKg) != Double.doubleToLongBits(other.prezzoAlKg))
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
		return "Arance [IDProdotto=" + IDProdotto + ", sigla=" + sigla + ", prezzoAlKg=" + prezzoAlKg + ", peso=" + peso
				+ ", origineProdotto=" + origineProdotto + "]";
	}


}
