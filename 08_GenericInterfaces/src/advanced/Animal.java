package advanced;

public class Animal {

	public void printMyType() {
		System.out.println(this.getClass().getName().split("\\.")[1] );

	}

}
