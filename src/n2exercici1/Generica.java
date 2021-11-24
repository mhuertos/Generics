package n2exercici1;

public class Generica {
	
	public <T extends MiInterfaz> void metodeGeneric(T o) {
		o.metode1();
		o.metode2();
	}
	

}
