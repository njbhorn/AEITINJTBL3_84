
public class CarFactory {



	private CarFactory() {

	}

	public static Car makeCar ( String make ) {
		return new Car ( make ) ;
	}

}
