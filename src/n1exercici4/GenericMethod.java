package n1exercici4;

public class GenericMethod<T> {
	
	public GenericMethod() {
		
	}
	
	public <T> void f(T[] array) {
		System.out.println("La funció f() consta d'un argument en forma d'array, amb objectes de tipus: "+array.getClass());
		
	}
	
	

}
