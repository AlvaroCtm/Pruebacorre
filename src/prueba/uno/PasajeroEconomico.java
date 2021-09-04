package prueba.uno;

public class PasajeroEconomico extends Pasajero {
	private String codigoDescuento;
	
	public PasajeroEconomico(String nombre ,String apellido, String codigoDescuento , int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoDescuento =codigoDescuento;
	}
	// Metodos set y get//Metodos SET y GET

	@Override
	public String toString() {
		return "\nPasajeroEconomico [codigoDescuento= " + codigoDescuento + "]";
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

}
