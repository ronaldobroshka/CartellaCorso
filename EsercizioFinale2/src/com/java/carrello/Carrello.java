package com.java.carrello;

import java.util.Arrays;

import com.java.prodotti.*;

public class Carrello {

	private ProdottoPrezzato[] prodottiPrezzati;
	private static int capienzaCarrello = 100; 
	
	public Carrello() {
		prodottiPrezzati = new ProdottoPrezzato[100];
	} // TUTTE LE CELLE/ELEMENTI PUNTERANNO A null

	public boolean aggiungiProdotto(ProdottoPrezzato prodotto) {
		for(int i = 0; i < prodottiPrezzati.length; ++ i) 
			if(prodottiPrezzati[i] == null) {
				prodottiPrezzati[i] = prodotto; 
				return true;
			}
			return false;
		}
	
	public boolean rimuoviProdotto(String IdProdotto) {
		for(int i = 0; i < prodottiPrezzati.length; ++ i)
			if(prodottiPrezzati[i].getIdProdotto().equals(IdProdotto)){
				prodottiPrezzati[i] = null; 
				return true;
			}
			return false; 
	}

	public ProdottoPrezzato prendiProdotto(int posizione) {
		return (posizione < 0 || posizione>= capienzaCarrello) ?
				null : prodottiPrezzati[posizione];
		}

	public ProdottoPrezzato[] getProdottiPrezzati() {
		return prodottiPrezzati;
	}

	public static int getCapienzaCarrello() {
		return capienzaCarrello;
	}

	public void setProdottiPrezzati(ProdottoPrezzato[] prodottiPrezzati) {
		this.prodottiPrezzati = prodottiPrezzati;
	}

	public static void setCapienzaCarrello(int capienzaCarrello) {
		Carrello.capienzaCarrello = capienzaCarrello;
	}

	@Override
	public String toString() {
		return "Carrello [prodottiPrezzati=" + Arrays.toString(prodottiPrezzati) + "]";
	}
	
	
}