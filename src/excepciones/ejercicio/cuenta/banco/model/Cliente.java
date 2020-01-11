package excepciones.ejercicio.cuenta.banco.model;

public class Cliente {

	private String usuario;
	private String dni;
	private CajaDeAhorro cajaDeAhorro;
	private CuentaCorriente cuentaCorriente;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public CajaDeAhorro getCajaDeAhorro() {
		return cajaDeAhorro;
	}
	public void setCajaDeAhorro(CajaDeAhorro cajaDeAhorro) {
		this.cajaDeAhorro = cajaDeAhorro;
	}
	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}
	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	
	
}