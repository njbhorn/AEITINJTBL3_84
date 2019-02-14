package Starter.Cars;

public class Car {

    private int speed; 

    public int getSpeed() {
		return speed;
	}
	protected void setSpeed(int speed) {
		this.speed = speed;
	}

	private  String model;
    public String getModel() {
		return model;
	}
	private void setModel(String model) {
		this.model = model;
	}

	//public Car(String m) { setModel(m); }

    public void getToSixty() {
        setSpeed(60);
    }
    public void accelerate(int seconds) {
        setSpeed(getSpeed() + (5 * seconds));
    }

}
