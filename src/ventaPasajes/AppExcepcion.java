package ventaPasajes;

public class AppExcepcion {

	public static void main(String[] args) {

//		int valor = 5;
//		int divisor = 0;
//		System.out.println(valor/divisor);

		try {

			Object prueba = new Object();
//			String numeros =  "abc";
//
//			Integer.parseInt(numeros);
			
			prueba.toString();
			int cant = 0;
			// venta
			if (cant == 0) {
				throw new AgotadoException("Pasaje agotado");
			}
			else {
				System.out.println("bienvenido al sistema de cobros");
				
			}

		} catch (Exception e) {
			System.out.println("se lanzo una excepcion " + e.getMessage());

		}
	}
}

