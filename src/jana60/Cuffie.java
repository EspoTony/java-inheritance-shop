package jana60;

public class Cuffie extends Prodotto {
	
	private int colore;
	private boolean wireless;
	private boolean cablate;
	
	
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva) {
		super(codice, nome, marca, prezzo);
		this.colore = colore;
		this.wireless = wireless;
		this.cablate = cablate;
	}

}
