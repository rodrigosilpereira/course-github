package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product_UpperDatePrice;
import model.services.ProductService;

public class Program_UpperDatePriceProducts {

	public static void main(String[] args) {
		
		//Fazer um programa que, a partir de uma lista de produtos, calcule a
		//soma dos preços somente dos produtos cujo nome começa com "T".
		
		Locale.setDefault(Locale.US);
		List<Product_UpperDatePrice> list = new ArrayList<>();

		list.add(new Product_UpperDatePrice("Tv", 900.00));
		list.add(new Product_UpperDatePrice("Mouse", 50.00));
		list.add(new Product_UpperDatePrice("Tablet", 350.50));
		list.add(new Product_UpperDatePrice("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
 
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
		

	}


