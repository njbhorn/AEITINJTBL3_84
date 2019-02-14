
public class Demo {

	private String info ;

	public Demo(String info) {
		super();
		this.info = info;
	}



	@Override
	public String toString() {
		return "Demo [info=" + info + "]";
	}



	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}



}
