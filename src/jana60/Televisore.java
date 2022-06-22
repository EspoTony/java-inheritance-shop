package jana60;

public class Televisore extends Prodotto {
	
	private int dimensioni;
	private boolean smart;
	
	
	public Televisore(int codice, String nome, String marca, double prezzo, int iva) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

}
