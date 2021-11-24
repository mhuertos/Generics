package n1exercici4;

public class Empleado {
	
	private String nombre;
	
	public Empleado(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}

}
