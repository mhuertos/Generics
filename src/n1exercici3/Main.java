package n1exercici3;

public class Main {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		// Dona error ---> gm.f("Hola", 234, 'a');
		gm.f(78, "Marving", true);

	}

}
