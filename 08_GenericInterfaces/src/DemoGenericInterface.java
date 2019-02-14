import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoGenericInterface {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>() ;

		al.add("Zach");
		al.add("Fred");
		al.add("Chuck");
		al.add("Anne") ;

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);

		ArrayList<Animal> animals = new ArrayList<>() ;
		animals.add(new Animal ("Pengu", 4) ) ;
		animals.add(new Animal ("Yul", 2) ) ;
		animals.add(new Animal ("Alan", 3) ) ;

		System.out.println(animals);

		Collections.sort(animals);

		System.out.println(animals);

		Collections.sort(animals, Animal.byLegs);

		System.out.println(animals);

	}

}
