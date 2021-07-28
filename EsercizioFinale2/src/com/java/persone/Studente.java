package com.java.persone;

public class Studente extends Persona {
		private char sesso;
		private final int matricola; 
		private int anno; 
		private String facolta;
		// Public studente() non ha senso 
		
		private static int ultimaMatricola = 10432; 
		
		public Studente(String nome, String cognome, char sesso, String indirizzo,
				String facolta) {
			// Richiama il costruttore della classe padre
			// SCEGLIE QUELLO CORRETTO IN BASE ALLA FIRMA 
			super(nome, cognome, sesso, indirizzo);
			this.facolta = facolta; 
			matricola = ultimaMatricola ++;
			anno = 1; 
		}


		public String getFacolta() {
			return facolta;
		}


		public void setFacolta(String facolta) {
			this.facolta = facolta;
		}


		public int getMatricola() {
			return matricola;
		}

		public int getAnno() {
			return anno;
		}


		private void setAnno(int anno) {
			this.anno = anno;
		}
		
		public boolean isFuoriCorso() {
			return (anno > 5) ? true : false ; 
		}
		
		public void visualizza() {
			super.visualizza();
			System.out.println("MATRICOLA: " + matricola);
			System.out.println("ANNO: " + anno);
			
			if(isFuoriCorso())
				System.out.println("STUDENTE FUORICORSO");
			else
				System.out.println("STUDENTE IN CORSO");
			
		/* VARABILI DI PERSONA EREDITATE, MA NON VISIBILI PERCHE' PRIVATE
		 * 
		 * MODO 1 --> USO IL get
		 * MODO 2 --> POTREI LAVORARE CON LA CLASSE SUPERIORE, OVVERO RICHIAMO IL super
		 * Provando a fregarlo con il super noto che fallisco miseramente
		 * MODO 3 -->  MI SERVO DEL PROTECTED
		 */
		}	
}
