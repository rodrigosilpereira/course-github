package application;

import java.util.Comparator;

import entities.Product_Standard_Comparator;

public class MyComparator implements Comparator<Product_Standard_Comparator> {

	@Override
	public int compare(Product_Standard_Comparator p1, Product_Standard_Comparator p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}