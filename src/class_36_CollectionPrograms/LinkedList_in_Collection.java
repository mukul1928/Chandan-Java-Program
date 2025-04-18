package class_36_CollectionPrograms;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_in_Collection {
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.add(4343);
		l1.add(43);
		l1.add("Chandan");
		l1.add(false);
		l1.add('M');
		l1.add(43.64);
		l1.add(343.334f);
		l1.add(null);
		l1.add("Chandan");
		l1.add(false);
		l1.add('M');
		l1.add(null);
		System.out.println(l1);

		LinkedList l = new LinkedList();
		l.add(434);
		l.add(54);
		l.add(7565);
		l.add(24354);
		l.add(75543);
		l.add(343);
		l.add(1);
		l.add(2);
		Collections.sort(l);
		System.out.println(l);

	}

}
