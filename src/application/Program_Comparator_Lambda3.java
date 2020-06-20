package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product_Standard_Comparator;

public class Program_Comparator_Lambda3 {

	public static void main(String[] args) {

		List<Product_Standard_Comparator> list = new ArrayList<>();

		list.add(new Product_Standard_Comparator("TV", 900.00));
		list.add(new Product_Standard_Comparator("Notebook", 1200.00));
		list.add(new Product_Standard_Comparator("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product_Standard_Comparator p : list) {
			System.out.println(p);
		}
	}

}
