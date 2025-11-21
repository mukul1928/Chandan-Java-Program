package class_36_CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_in_Collection {
	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(987);
		ar.add(876);
		ar.add("Chandan");
		ar.add(false);
		ar.add('M');
		ar.add(3.33);
		ar.add(null);
		ar.add("Chandan");

		System.out.println(ar);

		ArrayList a1 = new ArrayList();
		a1.add(76);
		a1.add(32);
		a1.add(90);
		a1.add(75);
		a1.add(0);
		a1.add(890);
		a1.add(7);
		a1.add(3);
		Collections.sort(a1);// Collections is a class in Java
		System.out.println(a1);

	}

}
