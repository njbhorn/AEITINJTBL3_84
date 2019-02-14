
public class Ancestor {

	private String info ;

	public Ancestor(String info) {
		super();
		this.info = info;
	}

	public Ancestor() {
//		this.info = "Default..." ;
		this("Default") ;
	}

	protected String demoMethod() {
		return "Ancestor" ;
	}

	public final String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}



}
