package com.java.test;

import com.java.carrello.Cassa;
import com.java.carrello.Scontrino;
import com.java.persone.Persona;
import com.java.prodotti.Birra;
import com.java.prodotti.CategoriaProdotti;
import com.java.prodotti.ProdottoPrezzato;
import com.java.prodotti.TipoUnita;
import com.java.prodotti.*;

public class Test {
	
	public static void main(String[] args) {
		
		ProdottoPrezzato p3 = new Birra("Birra", CategoriaProdotti.BEVANDE, "BRR",
				0.60, 12, "Birra Moretti");
	}

}

