package prueba.uno;

public class PasajeroVip extends Pasajero {
	private String codigoMembrecia;
	
	public PasajeroVip(String nombre ,String apellido, String codigoMembrecia , int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoMembrecia = codigoMembrecia;
	}
	// Metodos SET y GET

	public PasajeroVip() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigoMembrecia() {
		return codigoMembrecia;
	}

	public void setCodigoMembrecia(String codigoMembrecia) {
		this.codigoMembrecia = codigoMembrecia;
	}

	@Override
	public String toString() {
		return "\nPasajeroVip [codigoMembrecia= " + codigoMembrecia + "]";
	}

	

}
