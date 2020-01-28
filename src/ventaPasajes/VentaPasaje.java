package ventaPasajes;

public class VentaPasaje {
	
	public void vender(Pasaje[] micro, Pasaje nuevoPasaje) throws AgotadoException {
		int cant = 0;
		// venta
		if (cant > micro.length - 1) {
			throw new AgotadoException("Pasaje agotado");
		} else {
			// COBRAR PASAJE
			System.out.println("Cobro de pasaje");
		}
		
	}

}
