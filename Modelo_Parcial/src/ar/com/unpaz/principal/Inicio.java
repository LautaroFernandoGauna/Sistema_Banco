package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.CuentaCorriente;
import ar.com.unpaz.repositorio.LecturaDeArchivoRepo;
import ar.com.unpaz.repositorioImp.LecturaDeArchivoRepoImp;
import ar.com.unpaz.service.CuentaService;
import ar.com.unpaz.serviceImp.CuentaServiceImp;

public class Inicio {

	public static void main(String[] args) {
		List<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();
		Scanner scanner= new Scanner(System.in);
		LecturaDeArchivoRepo lectura = new LecturaDeArchivoRepoImp();
		CuentaService gestion = new CuentaServiceImp();
		cuentas=lectura.lista();
		int opcion ;
		do {
			System.out.println("1. AGREGAR CUENTA");
			System.out.println("2. BUSCAR CUENTA");
			System.out.println("3. ELIMINAR CUENTA");
			System.out.println("4. MOSTRAR CUENTAS");
			System.out.println("5. DEPOSITAR");
			System.out.println("6. SALIR");
			System.out.println("SELECCIONE UNA OPCION: ");
			opcion=scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			case 1:
				System.out.print("Titular: ");
				String titular= scanner.nextLine();
				
				System.out.print("Número De Cuenta: ");
				String nroCuenta= scanner.nextLine();
				
				System.out.print("Saldo: ");
				double saldo= scanner.nextDouble();
				
				System.out.print("Descubierto: ");
				double descubierto= scanner.nextDouble();
				CuentaCorriente cc1 = new CuentaCorriente(titular,nroCuenta,saldo,descubierto);
				gestion.agregarCuenta(cuentas, cc1);
				break;
			case 2:
				System.out.println("Ingrese numero de cuenta: ");
				String numero= scanner.nextLine();
				gestion.buscarCuenta(cuentas, numero);
				break;
			case 3:
				
				String numCuenta = scanner.nextLine();
				gestion.eliminarCuenta(cuentas, numCuenta);
				break;
			case 4:
				gestion.listar(cuentas);
				break;
				
			case 5:
				double monto = scanner.nextDouble();
				String numerCuenta = scanner.nextLine();
				gestion.depositar(cuentas, numerCuenta, monto);
				break;
			case 6:
				System.out.println("Saliendo Del Sistema...");
			
			default:
				System.out.println("Opcion invalida");
			
			}
			
			
		}
		
		while(opcion!=6);
		scanner.close();
		

	}

}
