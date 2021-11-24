package n1exercici2;

public class GenericMethod<T> {
	
	public GenericMethod() {
		
	}
	
	public void f(T arg_1, T arg_2, T arg_3) {
		System.out.println(arg_1.getClass().descriptorString());
		System.out.println(arg_2.getClass().descriptorString());
		System.out.println(arg_3.getClass().descriptorString());
	}

}
