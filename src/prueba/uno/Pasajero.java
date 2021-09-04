package prueba.uno;

public abstract class Pasajero {

	protected  String nombre;
	protected String apellido;
	protected int edad;
	// Metodos SET Y GET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "\nPasajero [nombre= " + nombre + "]";
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
