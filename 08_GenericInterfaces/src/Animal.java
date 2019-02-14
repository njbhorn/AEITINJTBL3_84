import java.util.Comparator;

public class Animal implements Comparable<Animal> {

	String name ;
	int legs ;
	public static final Comparator<Animal> byLegs = new AnimalLegsComparer() ;

	public Animal ( String name, int legs ) {
		this.name = name ;
		this.legs = legs ;
	}

	private static class AnimalLegsComparer implements Comparator<Animal> {

		@Override
		public int compare(Animal o1, Animal o2) {
			return o1.legs - o2.legs ;
		}

	}

	@Override
	public String toString() {
		return name + " : " + legs ;
	}

	@Override
	public int compareTo(Animal o) {
		return this.name.compareTo(o.name);
	}





}
