package excepciones.ejercicio.cuenta.banco;

import java.util.Scanner;


/**
 * Generar una aplicacion que permita extraer dinero de una cuenta de banco
 * El cliente tiene dos tipos de cuenta: corriente y caja de ahorro
 * La caja de ahorro no puede retirar mas dinero del que tiene en la cuenta
 * La cuenta corriente permite un descubierto
 * pedir el importe a retirar al usuario y en caso de no ser posible ejecutar la operacion lanzar la 
 * escepcion SinSaldoException
 * Caso contrario, mostrar un mensaje con el nuevo saldo
 * @author Lola
 *
 */

public class AppBanco {
	public static void main(String[] args) {
		
		
		
		System.out.println("BIENVENIDO A SU CUENTA");
		System.out.println("======================");
		
		System.out.println("Ingrese su nombre de usuario:");
		Scanner scan = new Scanner(System.in);
		String usuario = scan.nextLine();
		
		System.out.println("Ingrese su DNI:");
		int dni = scan.nextInt();
		
		System.out.println("Ingrese su numero de cuenta:");
		int numCuenta = scan.nextInt();
		
		int saldo;
		
		System.out.println("Ingrese la cantidad de dinero que desea tranferir a su Caja de Ahorro");
		int saldoCA = scan.nextInt();
		
		CajaDeAhorro ca = new CajaDeAhorro(numCuenta,saldoCA);
		
				
		System.out.println("Ingrese la cantidad de dinero que desea tranferir a su Cuenta Corriente");
		int saldoCC = scan.nextInt();
		
		System.out.println("Ingrese el limite de descubierto de su Cuenta Corriente");
		int des = scan.nextInt();
	
		
		CuentaCorriente cc = new CuentaCorriente(des, numCuenta, saldoCC);
		
		System.out.println("Desea realizar una extraccion 1.si  2.no");
		int respuesta = scan.nextInt();
		
		int tipoCuenta;
		
		if (respuesta == 1) {
			System.out.println("ingrese el tipo de cuenta del que desea retirar 1.Caja de Ahorro 2.Cuenta Corriente");
			tipoCuenta = scan.nextInt();
			
			switch (tipoCuenta) {
			case 1: {
				System.out.println("Ingrese monto:");
				float extraccion = scan.nextFloat();
				float saldoFinal = ca.getSaldo() - extraccion;
				ca.setSaldo(saldoFinal);
				System.out.println("Su saldo es " + ca.getSaldo());
								
				break;
			}
			case 2: {
				System.out.println("Ingrese monto:");
				float extraccion = scan.nextFloat();
				float saldoFinal = cc.getSaldo() - extraccion;
				ca.setSaldo(saldoFinal);
				System.out.println("Su saldo es " + cc.getSaldo());

				break;
			}

			default:
				break;
			}
			
		} else {
			
			System.out.println("muchas gracias por operar con nosotros");


		}
		
		
		
		
		
		
	}

}
