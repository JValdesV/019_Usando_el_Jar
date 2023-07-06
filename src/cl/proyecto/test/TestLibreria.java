package cl.proyecto.test;

import Clases.Cuenta;
import Clases.CuentaAhorro;

public class TestLibreria {

	public static void main(String[] args) {
		
		Cuenta cuenta = new CuentaAhorro(111, 4545);
		cuenta.deposita(100);
		System.out.println(cuenta.getSaldo()); 
		
		
	}

}
