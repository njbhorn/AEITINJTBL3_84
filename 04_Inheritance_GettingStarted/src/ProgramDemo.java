
public class ProgramDemo {

	public static void main(String[] args) {

		Ancestor a = new Ancestor("xyz") ;
		Descendant d = new Descendant("abc") ;

		System.out.println(d.demoMethod()) ;

		a = d ;
		System.out.println(a.getInfo());

		d = (Descendant) a ;

		System.out.println(d.getMoreInfo()) ;



	}

}
