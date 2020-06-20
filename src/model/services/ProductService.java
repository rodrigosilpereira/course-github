package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product_UpperDatePrice;

public class ProductService {
	
	public double filteredSum(List<Product_UpperDatePrice> list, Predicate<Product_UpperDatePrice> criteria) {
		double sum = 0.0;
		for (Product_UpperDatePrice p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
