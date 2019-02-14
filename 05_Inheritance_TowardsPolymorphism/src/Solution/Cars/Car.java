package Solution.Cars;

public class Car {

	private int speed;
	private String model;

	public Car(String m) {
		setModel(m);
	}

	public int getSpeed() {
		return speed;
	}

	protected void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	public void getToSixty() {
		setSpeed(60);
	}

	public void accelerate(int seconds) {
		speed += (5 * seconds);
	}

}
