package ar.com.unpaz.model;

public class Cuenta {
	private String titular;
	private String nroCuenta;
	private double saldo;
	
	public Cuenta() {
		
		}
	public Cuenta(String titular, String nroCuenta, double saldo) {
		this.titular=titular;
		this.nroCuenta=nroCuenta;
		this.saldo=saldo;
		
	}
	
	public void depositar(double monto) {
		if(monto>0 ) {
			saldo= saldo +monto;
			System.out.println("El saldo actual es: "+ saldo);
		}
	}
	public boolean extraer(double monto) {
		if(saldo >= monto && monto>0 ) {
			saldo=saldo-monto;
			System.out.println("El saldo actual es de: "+ saldo );
			return true;
		}
		return false;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
