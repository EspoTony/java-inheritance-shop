package jana60;

import java.text.DecimalFormat;

public class Smartphone extends Prodotto {
	
	private int imei;
	private int memoria;
	private DecimalFormat df = new DecimalFormat("0 GB");
	
	
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;
	}


	public int getImei() {
		return imei;
	}


	public void setImei(int imei) {
		this.imei = imei;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public String memoriaDF() {
		return df.format(memoria);
	}

}
