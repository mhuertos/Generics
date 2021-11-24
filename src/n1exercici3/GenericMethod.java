package n1exercici3;

public class GenericMethod<T> {
	
	public GenericMethod() {
		
	}
	
	public void f(int nouInt, T arg_2, T arg_3) {
		System.out.println(nouInt);
		System.out.println(arg_2.getClass().descriptorString());
		System.out.println(arg_3.getClass().descriptorString());
	}

}
