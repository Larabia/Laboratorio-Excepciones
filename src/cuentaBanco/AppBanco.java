package cuentaBanco;

import java.util.Scanner;

import cuentaBanco.model.CajaDeAhorro;
import cuentaBanco.model.Cliente;
import cuentaBanco.model.CuentaCorriente;

/**
 * Generar una aplicacion que permita extraer dinero de una cuenta de banco El
 * cliente tiene dos tipos de cuenta: corriente y caja de ahorro La caja de
 * ahorro no puede retirar mas dinero del que tiene en la cuenta La cuenta
 * corriente permite un descubierto pedir el importe a retirar al usuario y en
 * caso de no ser posible ejecutar la operacion lanzar la escepcion
 * SinSaldoException Caso contrario, mostrar un mensaje con el nuevo saldo
 * 
 * @author Lola
 *
 */

public class AppBanco {
	public static void main(String[] args) {

		System.out.println("BIENVENIDO A SU CUENTA");
		System.out.println("----------------------");

		System.out.println("Ingrese su nombre:");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();

		System.out.println("Ingrese su DNI:");
		String dni = scan.nextLine();

		Cliente cli = new Cliente();
		cli.setDni(dni);
		cli.setUsuario(nombre);

		CajaDeAhorro ca = new CajaDeAhorro();
		ca.setNumCuenta(001);
		ca.setSaldo(10000);

		CuentaCorriente cc = new CuentaCorriente();
		cc.setNumCuenta(002);
		cc.setSaldo(10000);
		cc.setDescubierto(500);

		cli.setCuentaCorriente(cc);
		cli.setCajaDeAhorro(ca);

		System.out.println("Que operacion desea realizar? 1.Extraccion || 2.Deposito || 3. Consulta saldo");
		int opcion = scan.nextInt();

		if (opcion == 1) {

			System.out.println("Ingrese el tipo de cuenta: 1.Caja de Ahorro || 2.Cuenta Corriente");
			int tipoCuentaEx = scan.nextInt();
			System.out.println("Ingrese monto a extraer:");
			float montoEx = scan.nextFloat();

			try {

				switch (tipoCuentaEx) {

				case 1: {
					// extraer de caja de ahorro
					cli.getCajaDeAhorro().extraer(montoEx);
					System.out.println("Su saldo actual es de: " + ca.getSaldo());
					break;
				}

				case 2: {
					// extraer de cuenta corriente
					cli.getCuentaCorriente().extraer(montoEx);
					System.out.println("Su saldo actual es de: " + cc.getSaldo());
					break;
				}

				default:
					System.out.println("muchas gracias por operar con nosotros");
					break;
				}

			} catch (Exception e) {
				System.out.println("No tiene saldo suficiente " + e.getMessage());
			}

		} else if (opcion == 2) {

			System.out.println("Ingrese el tipo de cuenta: 1.Caja de Ahorro || 2.Cuenta Corriente");
			int tipoCuentaDep = scan.nextInt();
			System.out.println("Ingrese monto a despositar:");
			float montoDep = scan.nextFloat();

			switch (tipoCuentaDep) {

			case 1: {
				// extraer de caja de ahorro
				cli.getCajaDeAhorro().depositar(montoDep);
				System.out.println("Su saldo actual es de: " + ca.getSaldo());
				break;
			}

			case 2: {
				// extraer de cuenta corriente
				cli.getCuentaCorriente().depositar(montoDep);
				System.out.println("Su saldo actual es de: " + cc.getSaldo());
				break;
			}
			}

		} else if (opcion == 3) {

			System.out.println("Ingrese el tipo de cuenta: 1.Caja de Ahorro || 2.Cuenta Corriente");
			int tipoCuenta = scan.nextInt();

			switch (tipoCuenta) {

			case 1: {

				System.out.println("Su saldo actual es de: " + ca.getSaldo());
				break;
			}

			case 2: {
				System.out.println("Su saldo actual es de: " + cc.getSaldo());
				break;
			}

			default:
				System.out.println("muchas gracias por operar con nosotros");
				break;

			}

		} else {
			System.out.println("muchas gracias por operar con nosotros");
		}
	}

}
