package excepciones.ejercicio.cuenta.banco;


public abstract class CuentaDeBanco {
	
	protected int numCuenta;
	protected float saldo;
	
	public CuentaDeBanco(int numCuenta , float saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	

	

}
