package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import entities.Product_WorkingWithGenerics;
import services.CalculationService;

public class Program_Example_Generics_MostrarProdMaisCaro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product_WorkingWithGenerics> list = new ArrayList<>();

		String path = "D:\\Java Udemy\\in\\inProduct.txt";  

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product_WorkingWithGenerics(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product_WorkingWithGenerics x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}

}


