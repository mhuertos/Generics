package n1exercici1;

import java.util.ArrayList;

public class Contenidora <T>  {
	
	private ArrayList<T> lista = new ArrayList<T>();
	
	public Contenidora() {
	}
	
	public void a�adeObjeto(T elemento) {
		lista.add(elemento);
	}
	
	public void quitaObjeto(T elemento) {
		lista.remove(elemento);
	}
	
	public void muestraLista() {
		System.out.println(lista);
	}
	
	

}
