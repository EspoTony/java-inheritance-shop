package jana60;

import java.text.DecimalFormat;

public class Televisore extends Prodotto {
	
	private int dimensioni;
	private boolean smart;
	private DecimalFormat df = new DecimalFormat("0 pollici");
	
	
	public Televisore(int codice, String nome, String marca, double prezzo, int iva) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}


	public int getDimensioni() {
		return dimensioni;
	}


	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}


	public boolean isSmart() {
		return smart;
	}


	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	public String dimensioniDF() {
		return df.format(dimensioni);
	}

}
