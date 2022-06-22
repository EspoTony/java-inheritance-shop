package jana60;

public class Smartphone extends Prodotto {
	
	private int imei;
	private int memoria;
	
	
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;
	}

}
