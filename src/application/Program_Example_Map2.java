package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;
import entities.Product_Map;

public class Program_Example_Map2 {

	public static void main(String[] args) {
		
		Map<Product_Map, Double> stock = new HashMap<>();
		
		Product_Map p1 = new Product_Map("Tv", 900.0);
		Product_Map p2 = new Product_Map("Notebook", 1200.0);
		Product_Map p3 = new Product_Map("Tablet", 400.0);
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product_Map ps = new Product_Map("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
