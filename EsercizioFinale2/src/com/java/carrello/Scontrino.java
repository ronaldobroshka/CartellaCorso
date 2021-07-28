package com.java.carrello;

public class Scontrino {
	private String scontrinoStampato = "";
	private boolean scontrinoTerminato;
	
	public Scontrino() {}
	
	public boolean aggiungiRiga(String riga) {
		if(riga == null || riga.isEmpty())
			return false; 
		
		scontrinoStampato += riga; 
		return true; 
	}
	
	public String stampaScontrino() {
		if(!scontrinoTerminato)
			return null; 
		
		return scontrinoStampato; 
	}

	public String getScontrinoStampato() {
		return scontrinoStampato;
	}

	public boolean isScontrinoTerminato() {
		return scontrinoTerminato;
	}

	public void setScontrinoStampato(String scontrinoStampato) {
		this.scontrinoStampato = scontrinoStampato;
	}

	public void setScontrinoTerminato(boolean scontrinoTerminato) {
		this.scontrinoTerminato = scontrinoTerminato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scontrinoStampato == null) ? 0 : scontrinoStampato.hashCode());
		result = prime * result + (scontrinoTerminato ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scontrino other = (Scontrino) obj;
		if (scontrinoStampato == null) {
			if (other.scontrinoStampato != null)
				return false;
		} else if (!scontrinoStampato.equals(other.scontrinoStampato))
			return false;
		if (scontrinoTerminato != other.scontrinoTerminato)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Scontrino [scontrinoStampato=" + scontrinoStampato + ", scontrinoTerminato=" + scontrinoTerminato + "]";
	}
	
	
}
