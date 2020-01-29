package productoTienda;

import java.util.Scanner;

import productoTienda.exceptions.SinStockException;
import productoTienda.model.Constantes;
import productoTienda.model.Heladera;
import productoTienda.model.Lavarropas;
import productoTienda.model.Pedido;

/**
 * En la tienda se venden heladeras y lavarropas. Esos productos tienen stock,
 * descipcion y precio. En el caso que no haya stock disponible, lanzar
 * SinStockException. Generar las clases necesarias y tomar el pedido del
 * cliente para calcular el total de la venta
 *
 */
public class AppTienda {

	public static void main(String[] args) {

		// Crear productos en strock
		Heladera heladera = new Heladera(3, "Modeloxxxx", 30000);
		Lavarropas lavarropas = new Lavarropas(0, "Modeloyyyy", 25000);

		// Datos del pedido
		System.out.println("TIENDA DE ELECTRODOMESTICOS");
		System.out.println("===========================");

		System.out.println("Ingrese el pedido: ");
		System.out.println("Producto (1.Heladera| 2.Lavarropas): ");

		Scanner scan = new Scanner(System.in);
		int tipo = scan.nextInt();

		System.out.println("Cantidad de articulos: ");
		int cant = scan.nextInt();

		float precioFinal = 0;
		Pedido pedido1 = new Pedido(heladera, 0, 0);

		switch (tipo) {
		case 1:

			try {
				precioFinal = heladera.getPrecio() + heladera.CargoVenta();
				pedido1 = new Pedido(heladera, cant, precioFinal);
				pedido1.ConsultaStock(heladera, cant);

				System.out.println("Metodo de pago (1.Efectivo| 2.Tarjeta): ");
				int metodo = scan.nextInt();

				if (metodo == 2) {
					precioFinal = precioFinal + heladera.CargoTarjeta();
				}

				System.out.println("Posee cupon de descuento? (1. Si| 2. No)");
				int cupon = scan.nextInt();

				if (cupon == 1) {
					precioFinal = precioFinal + Constantes.DESCUENTO_CUPON;
				}

				System.out.println(
						"El costo total del pedido es de $" + precioFinal + ", desea realizarlo? (1. Si| 2. No)");

				int realizarPedido = scan.nextInt();

				if (realizarPedido == 1) {
					heladera.setStock(heladera.getStock() - cant);
					System.out.println("Su pedido fue realizado exitosamente.");
					System.out.println("Stock restante de " + heladera.getDescripcion() + ": " + heladera.getStock());
				}

			} catch (SinStockException e) {
				System.out.println("Stock insuficiente, el stock actual es de " + heladera.getStock() + " unidades.");
			}

			break;

		case 2:
			try {
				precioFinal = lavarropas.getPrecio() + lavarropas.CargoVenta();
				pedido1 = new Pedido(lavarropas, cant, precioFinal);
				pedido1.ConsultaStock(lavarropas, cant);

				System.out.println("Metodo de pago (1.Efectivo| 2.Tarjeta): ");
				int metodo = scan.nextInt();

				if (metodo == 2) {
					precioFinal = precioFinal + lavarropas.CargoTarjeta();
				}

				System.out.println("Posee cupon de descuento? (1. Si| 2. No)");
				int cupon = scan.nextInt();

				if (cupon == 1) {
					precioFinal = precioFinal + Constantes.DESCUENTO_CUPON;
				}

				System.out.println(
						"El costo total del pedido es de $" + precioFinal + ", desea realizarlo? (1. Si| 2. No)");

				int realizarPedido = scan.nextInt();

				if (realizarPedido == 1) {
					lavarropas.setStock(lavarropas.getStock() - cant);
					System.out
							.println("Stock restante de " + lavarropas.getDescripcion() + ": " + lavarropas.getStock());
				}

			} catch (Exception e) {
				System.out.println("Stock insuficiente, el stock actual es de " + lavarropas.getStock() + " unidades.");
			}

			break;

		default:
			break;
		}

	}
}