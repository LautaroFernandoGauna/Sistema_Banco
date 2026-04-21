package ar.com.unpaz.model;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	
	public CuentaCorriente() {
	
	}
	public CuentaCorriente(String titular, String nroCuenta, double saldo, double descubierto) {
		super(titular,nroCuenta,saldo);
		this.descubierto=descubierto;
	}
	
	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	@Override
	public String toString() {
		
		return "Titular: "+ getTitular() + " NroCuenta: " + getNroCuenta() + " Saldo: "  + getSaldo() + " Descubierto: "+ descubierto;
	}

}
