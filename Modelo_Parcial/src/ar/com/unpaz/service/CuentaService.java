package ar.com.unpaz.service;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.CuentaCorriente;

public interface CuentaService {
	List<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();
	
	public void agregarCuenta(List<CuentaCorriente> cuentas, CuentaCorriente cuenta);
	
	public void buscarCuenta(List<CuentaCorriente> cuentas, String nroCuenta );
	
	public void eliminarCuenta(List<CuentaCorriente> cuentas, String nroCuenta);
	
	public void listar(List<CuentaCorriente>cuentas);
	
	public void depositar(List<CuentaCorriente> cuentas, String nroCuenta, double monto);
	
}
