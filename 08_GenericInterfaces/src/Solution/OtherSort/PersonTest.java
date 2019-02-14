package Solution.OtherSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class PersonTest {


	private static int[] ages = { 36, 53, 51, 21, 41, 19 };
	private static String[] names =
		  { "Holland", "Turner", "Powell",
		    "Vicious", "Lyndon", "Spears" };

	private static ArrayList<Integer> ageList
	                                  = new ArrayList<>();
	private static ArrayList<String> nameList
	                                  = new ArrayList<>();
	private static ArrayList<Person> people;

	public static void main(String[] args) {

		for (String n : names) { nameList.add(n);}
		for (int a : ages) { ageList.add(a);}

		people = new ArrayList<>(nameList.size());

		for (int i = 0; i < nameList.size(); i++) {
			people.add(new Person(nameList.get(i), ageList.get(i)));
		}

		System.out.println("\nThe original list of people is:\n");
		printPeople();

		//Collections.sort(people,new PersonNameComparer());
		Collections.sort(people, Person.ByName);
		// by age based on implementation of Comparable<E>
		System.out.println("\nThe sorted list of people by NAME is:\n");
		printPeople();

		// creating a comparator using other techniques
		// 1. local variable
		Comparator<Person> c = new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				Random r = new Random () ;
				return r.nextInt(100) - 50  ;
			}

		} ;
		System.out.println(people);
		Collections.sort(people, c );
		System.out.println(people);

		// 2. Java 8 Lambda Expression
		Collections.sort( people, (p1, p2) ->  p2.getAge() - p1.getAge() );
		System.out.println(people);
		Collections.sort( people, (p1, p2) ->  p1.getAge() - p2.getAge() );
		System.out.println(people);
	}

	private static void printPeople() {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}
