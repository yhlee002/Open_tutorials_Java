package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

//Collections Framework1_ArrayList
public class CF1_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("five");
		System.out.println("ArrayList");
		Iterator ai = al.iterator();
		while(ai.hasNext()) {
			System.out.println(ai.next());
		}
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add("five");
		Iterator hi = hs.iterator();
		System.out.println("\nHashSet");
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}

}
