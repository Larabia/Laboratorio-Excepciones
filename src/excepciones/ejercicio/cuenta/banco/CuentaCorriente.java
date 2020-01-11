package excepciones.ejercicio.cuenta.banco;

public class CuentaCorriente extends CuentaDeBanco{
	

	private float descubierto;
	
public CuentaCorriente(float descubierto, int numCuenta, float saldo) {
	super(numCuenta, saldo);
		this.descubierto = descubierto;
	// TODO Auto-generated constructor stub
}

public float getDescubierto() {
	return descubierto;
}

public void setDescubierto(float descubierto) {
	this.descubierto = descubierto;
}







}