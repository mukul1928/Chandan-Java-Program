package class_36_CollectionPrograms;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet_in_Collection {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();
		h.add("Chandan");
		h.add('M');
		h.add(232);
		h.add(5453);
		h.add(343);
		h.add(false);
		h.add(43.343);
		h.add(34.33f);
		h.add(79787976);
		h.add(null);
		h.add("Chandan");
		h.add('M');
		h.add(232);
		h.add(5453);
		h.add(343);
		h.add(79787976);
		h.add(null);
		System.out.println(h);

		LinkedHashSet h1 = new LinkedHashSet();
		h1.add(43);
		h1.add(34);
		h1.add(776);
		h1.add(2343243);
		h1.add(5333);
		h1.add(553);
		h1.add(97877767);
		// Collections.sort(h1);
		System.out.println(h1);

	}

}
