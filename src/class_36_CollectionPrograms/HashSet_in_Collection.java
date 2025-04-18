package class_36_CollectionPrograms;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_in_Collection {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(232);
		h.add(33);
		h.add("Cand");
		h.add('M');
		h.add(false);
		h.add(null);
		h.add(343.43);
		h.add(34.3f);
		h.add(true);
		h.add(343434343);
		h.add(null);
		h.add(232);
		h.add(33);
		h.add("Cand");
		System.out.println(h);

		HashSet h1 = new HashSet();
		h1.add(32);
		h1.add(23);
		h1.add(53);
		h1.add(34);
		h1.add(423);
		h1.add(43);
		//Collections.sort(h1);
		System.out.println(h1);

	}

}
