package n1exercici1;

public class Main {
	
	public static void main(String[] args) {
		Coche coche_1 = new Coche("Audi");
		Coche coche_2 = new Coche("Saab");
		Coche coche_3 = new Coche("Citroen");
		
		Contenidora<Coche> garaje = new Contenidora<Coche>();
		garaje.añadeObjeto(coche_1);
		garaje.añadeObjeto(coche_2);
		garaje.añadeObjeto(coche_3);
		garaje.muestraLista();
		
		garaje.quitaObjeto(coche_2);
		garaje.muestraLista();
		
		////////////////////////////////////////////
		
		Contenidora<Integer> numeros = new Contenidora<Integer>();
		numeros.añadeObjeto(23);
		numeros.añadeObjeto(34);
		numeros.añadeObjeto(21);
		
		numeros.muestraLista();

		
		
		
		
		//////////////////////////////////////////////
		
		
	}

}
