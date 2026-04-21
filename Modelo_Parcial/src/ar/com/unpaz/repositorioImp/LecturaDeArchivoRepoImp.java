package ar.com.unpaz.repositorioImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.CuentaCorriente;
import ar.com.unpaz.repositorio.LecturaDeArchivoRepo;

public class LecturaDeArchivoRepoImp implements LecturaDeArchivoRepo{
	
	List<CuentaCorriente>cuentas = new ArrayList <CuentaCorriente>();
	
	public void lectura() {
		lectura();
		

		File sFile= new File("Cuentas.txt");
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBuffer= new BufferedReader(sFileReader);
			
			String linea = " ";
			while((linea = sBuffer.readLine()) != null) {
				String [] Array= linea.split(",");
				CuentaCorriente cc = new CuentaCorriente();
				cc.setTitular(Array[0]);
				cc.setNroCuenta(Array[1]);
				cc.setSaldo(Double.parseDouble(Array[2]));
				cc.setDescubierto(Double.parseDouble(Array[3]));
				cuentas.add(cc);
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	@Override
	public List<CuentaCorriente> lista() {
		return cuentas;
	}
	
	

}
