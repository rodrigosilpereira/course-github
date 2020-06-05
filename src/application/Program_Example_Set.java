package application;

import java.util.HashSet;
import java.util.Set;

public class Program_Example_Set {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}

	}

}
