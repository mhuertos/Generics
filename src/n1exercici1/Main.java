package n1exercici1;

public class Main {
	
	public static void main(String[] args) {
		Coche coche_1 = new Coche("Audi");
		Coche coche_2 = new Coche("Saab");
		Coche coche_3 = new Coche("Citroen");
		
		Contenidora<Coche> garaje = new Contenidora<Coche>();
		garaje.a�adeObjeto(coche_1);
		garaje.a�adeObjeto(coche_2);
		garaje.a�adeObjeto(coche_3);
		garaje.muestraLista();
		
		garaje.quitaObjeto(coche_2);
		garaje.muestraLista();
		
		////////////////////////////////////////////
		
		Contenidora<Integer> numeros = new Contenidora<Integer>();
		numeros.a�adeObjeto(23);
		numeros.a�adeObjeto(34);
		numeros.a�adeObjeto(21);
		
		numeros.muestraLista();

		
		
		
		
		//////////////////////////////////////////////
		
		
	}

}
