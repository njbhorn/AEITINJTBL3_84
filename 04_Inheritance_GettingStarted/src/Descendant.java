
public class Descendant extends Ancestor {

	private String moreInfo;

	@Override
	protected String demoMethod() {
		return "Descendant";
	}

	public String getMoreInfo() {
		return moreInfo;
	}

	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	public Descendant(String info) {
		super(info);
		this.moreInfo = info.toUpperCase();
	}

}
