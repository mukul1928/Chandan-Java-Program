package class_36_CollectionPrograms;

import java.util.Collections;
import java.util.Vector;

public class Vector_in_Collection {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(12);
		v.add('M');
		v.add("Chandan");
		v.add(34.22);
		v.add(false);
		v.add(null);
		v.add(3433434.43f);
		v.add('M');
		v.add("Chandan");
		v.add(34.22);
		v.add(null);
		System.out.println(v);

		Vector v1 = new Vector();
		v1.add(12);
		v1.add(43);
		v1.add(344);
		v1.add(53);
		v1.add(6454);
		Collections.sort(v1);
		System.out.println(v1);

	}

}
