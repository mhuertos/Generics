package n1exercici4;

public class Main {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		Empleado[] personal = new Empleado[3];
		personal[0] = new Empleado("Antonio");
		personal[1] = new Empleado("Sonia");
		personal[2] = new Empleado("Tania");
		
		gm.f(personal);
		
		//Tengo dudas sobre si esta es la solución.
		

	}

}
