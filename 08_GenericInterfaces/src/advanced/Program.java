package advanced;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {

	public static void main(String[] args) {

//		genericIteratorRequired() ;
//		workingWithGenericCollections();
//		genericMethods() ;
		genericTypeInference() ;
//		mixingGenericsWithWildcards() ;


	}

	private static void workingWithGenericCollections() {
		List<Animal> al = new ArrayList<Animal>() ;
//		List<Animal> al2 = new ArrayList<Cat>() ;
		List<?> al2 = new ArrayList<Cat>() ;
		al.add(new Animal());
		al.add(new Cat()) ;
//		al2.add(new Animal());
//		al2.add(new Cat()) ;

//		List<Cat> al3 = new ArrayList<Cat>() ;

		processList(al) ;
//		processList(al2);	// will not compile as List<?> is not an Animal list
		processListUpperBound(al);	// al2 passed will not compile
		processListAdd(al) ;
	}

	private static void processList ( List<Animal> l ) {
		for (Animal a : l ) {
			a.printMyType() ;
		}
	}

	private static void processListUpperBound ( List<? extends Animal> l ) {
		for (Animal a : l ) {
			a.printMyType() ;
		}
	}

	private static void processListAdd(List<? extends Animal> l) {
//		l.add(new Animal()); // l is unknown could be any type of Animal
//		l.add(new Bear());	// List<Cat> <> List<Bear>
		l.add(null) ;

	}

	private static void genericIteratorRequired() {
		List<Book> al = new ArrayList<Book>();
		al.add(new Book ( "Treasure Island"));
		al.add(new Book ( "The JFC Swing Tutorial"));
		al.add(new Book ( "Core java"));

		for ( Iterator<Book> it = al.iterator() ; it.hasNext(); ) {
			System.out.printf("%s%n", it.next().getTitle());
		}
	}

	private static void genericMethods() {
		List<Bear> lb = new ArrayList<>() ;
		List<Cat> lc = new ArrayList<>() ;
		List<String> ls = new ArrayList<>() ;
		addToListGeneric(lb, new Bear() );
		addToListGeneric(lc, new Cat() );
		addToListGeneric(ls, "Fred" );

	}

	private static <T> void addToListGeneric( List<T> myList, T someAnimal ) {
		myList.add ( someAnimal ) ;
	}

	private static void genericTypeInference() {
		Object o = getFirst ( new String[] { "Tom", "Dick", "Harry" } ) ;
		List<String> collect = new ArrayList<String>();
		collect.add("Donatello");
		collect.add("Raphael");
		collect.add("Leonardo");
		collect.add("Michaelangelo");

		System.out.println(o);
		System.out.println(getLast(collect));

	}

	private static <T> T getFirst( T [ ] tArray ) {
		T t = tArray[0];
		return t ;
	}

	private static <T> T getLast( List<T> tCollect ) {
		return tCollect.get( tCollect.size() - 1 ) ;
	}

	private static void mixingGenericsWithWildcards() {

		List < Animal > al = new ArrayList<>();
		System.out.printf("Size of ArrayList %d%n", al.size());
		addToList ( al, new Bear() ) ;
		System.out.printf("Size of ArrayList %d%n", al.size());

		List < String > lx = new ArrayList<>() ;
		System.out.printf("Size of 2nd ArrayList %d%n", lx.size());
		addToList ( lx, "Ice" ) ;
		System.out.printf("Size of 2nd ArrayList %d%n", lx.size());

	}

	// lower bound
	static <T> void addToList ( List < ? super T > aniList, T animal ) {
		aniList.add ( animal ) ;
	}

	// upper bound gives error as List sub class of T is not same as another List sub class
	static <T> void addToList2 ( List < ? extends T > aniList, T animal ) {
//		aniList.add ( animal ) ;
	}

}
