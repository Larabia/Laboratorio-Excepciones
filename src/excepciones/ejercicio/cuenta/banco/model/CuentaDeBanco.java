package excepciones.ejercicio.cuenta.banco.model;

import excepciones.ejercicio.cuenta.banco.exceptions.SinSaldoException;

public abstract class CuentaDeBanco {
	
	protected float numCuenta;
	protected float saldo;
	

	public void extraer(float monto) throws SinSaldoException {
		if (saldo >= monto) {
			saldo = saldo - monto;
			System.out.println("Extraccion realizada");
			System.out.println("Su saldo actual es: " + saldo);
		}
		else {
			throw new SinSaldoException("Saldo insuficiente: " + saldo);
		}
	}

	public void depositar(float monto) {
		saldo = saldo + monto;
		System.out.println("Deposito realizado");
		System.out.println("Su saldo actual es: " + saldo);
	}

	public float getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(float numCuenta) {
		this.numCuenta = numCuenta;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
}

	