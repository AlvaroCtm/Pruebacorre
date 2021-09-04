package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelo {

	public static void main(String[] args) {
		Scanner TecladoInt = new Scanner(System.in);
		Scanner TecladoString = new Scanner(System.in);
		System.out.println("ingrese informacion del pasajero");
		System.out.println("ingrese nombre");
		String nombre = TecladoString.nextLine();
		System.out.println("ingrese apellido");
		String apellido = TecladoString.nextLine();
		System.out.println("edad");
		int edad = TecladoInt.nextInt();
		System.out.println("que tipo de pasajero es 1 vip , 2 eco ");
		int opcion = TecladoInt.nextInt();
		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("ingrese codigo de membrecia");
			membresia = TecladoString.nextLine();
		} else {
			System.out.println("ingrese codido de descuento");
			descuento = TecladoString.nextLine();
		}

		// TODO Auto-generated method stub
		PasajeroVip pasajero1 = new PasajeroVip("Daniel", "Teran", "dsad", 25);
		PasajeroVip pasajero2 = new PasajeroVip("javier", "cruz", "fdsfsd", 30);
		PasajeroVip pasajero3 = new PasajeroVip();
		pasajero3.setNombre(nombre);
		pasajero3.setApellido(apellido);
		pasajero3.setEdad(edad);
		pasajero3.setCodigoMembrecia(membresia);
		
		

		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico("ale", "cole", "dsad", 20);
		PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico("al", "cena", "ggg", 30);
		Pasajero[][] asientos = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroEconomico1;
		asientos[3][2] = pasajeroEconomico2;

		int opcionsalir = 0;

		do {
			System.out.println("ingrese datos de asiento, 0 continuar ,-1 salir");
			opcionsalir = TecladoInt.nextInt();
			if (opcionsalir == 0) {
				System.out.println("ingrese fila de asiento");
				int fila = TecladoInt.nextInt();
				System.out.println("ingrese columna de asiento");
				int columna = TecladoInt.nextInt();
				System.out.println("los datos del pasajero son: ");
				System.out.println(asientos[fila][columna]);
			} else if (opcionsalir == 1) {
				System.out.println("Saliendo del sistema Gracias");
			}
		} while (opcionsalir != -1);

	}

}
