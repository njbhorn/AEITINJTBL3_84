package Solution.Cars;

public class RacingCar extends Car {

	private String driver;
	private int turboFactor;

	public RacingCar(String model, String driver, int turboFactor) {
		super(model);
		setDriver(driver);
		setTurboFactor(turboFactor);
	}

	public String getDriver() {
		return driver;
	}

	private void setDriver(String driver) {
		this.driver = driver;
	}

	public int getTurboFactor() {
		return turboFactor;
	}

	private void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}

	public String getModel() {
		return "Formula 1 " + super.getModel();
	}

	public void accelerate(int seconds) {
		int increase = 5 * seconds * getTurboFactor();
		setSpeed(increase + getSpeed());
	}
}
