package refactored;

public class Car {
	
	private String registration ;
	private String make ;
	private String colour ;
	private String engine ;
	private String doors ;
	
	
	
public Car() {
		
	}


	public Car(String registration, String make, String colour, String engine, String doors) {

	this.registration = registration;
	this.make = make;
	this.colour = colour;
	this.engine = engine;
	this.doors = doors;
}


		public Car(String... carInfo ) {
		this.registration = carInfo[0];
		this.make = carInfo[1];
		this.engine = carInfo[2];
		this.colour = carInfo[3];
		this.doors = carInfo[4];
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}


	@Override
	public String toString() {
		return "Car [registration=" + registration + ", make=" + make + ", colour=" + colour + ", engine=" + engine
				+ ", doors=" + doors + "]";
	}
	
	

	
}
