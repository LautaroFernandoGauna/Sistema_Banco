package ar.com.unpaz.serviceImp;

import java.util.List;

import ar.com.unpaz.model.CuentaCorriente;
import ar.com.unpaz.service.CuentaService;

public class CuentaServiceImp implements CuentaService {

	@Override
	public void agregarCuenta(List<CuentaCorriente> cuentas, CuentaCorriente cuenta) {
		cuentas.add(cuenta);
		
	}

	@Override
	public void buscarCuenta(List<CuentaCorriente> cuentas, String nroCuenta) {
		boolean encontrada = false;
		for(CuentaCorriente c : cuentas ) {
			if(nroCuenta.equals(c.getNroCuenta()) && encontrada == false) {
				System.out.println("La cuenta ha sido encontrada es: "+ c);
				encontrada= true;
				break;
			}
		}
		if(encontrada==false) {
			System.out.println("La cuenta no ha sido encontrada");
		}
		
	}

	@Override
	public void eliminarCuenta(List<CuentaCorriente> cuentas, String nroCuenta) {
		boolean encontrada = false;
		for(CuentaCorriente c : cuentas ) {
			if(nroCuenta.equals(c.getNroCuenta()) && encontrada == false) {
				System.out.println("La cuenta ha sido encontrada es: "+ c);
				encontrada= true;
				System.out.println("La cuenta ha sido eliminada ");
				cuentas.remove(c);
				break;
			}
		}
		if(encontrada == false) {
			System.out.println("La cuenta no ha sido encontrada, vuelva a intentarlo");
		}
	}

	@Override
	public void listar(List<CuentaCorriente> cuentas) {
		if(cuentas.isEmpty()) {
			System.out.println("No se encontró ninguna lista");
		}else {
			for(CuentaCorriente cc : cuentas) {
				System.out.println(cc);
		}
		}
		
		
	}
	
	@Override
	public void depositar(List<CuentaCorriente> cuentas, String nroCuenta, double monto) {
		boolean encontrada= false;
		for(CuentaCorriente cc1 : cuentas) {
			if(nroCuenta.equals(cc1.getNroCuenta()) && encontrada == false && monto>0 ) {
				cc1.depositar(monto);
				System.out.println("Procesando.....");
				System.out.println("El deposito ha sido exitoso, saldo actual: "+ cc1.getSaldo());
				encontrada=true;
				break;
			}
		}
		if(encontrada == false) {
			System.out.println("No se ha encontró ninguna cuenta");
		}
	}

}
