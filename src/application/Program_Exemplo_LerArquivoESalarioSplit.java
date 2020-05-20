package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee_InterfaceComparable;

public class Program_Exemplo_LerArquivoESalarioSplit {

	public static void main(String[] args) {
		List<Employee_InterfaceComparable> list = new ArrayList<>();
		String path = "D:\\Java Udemy\\in\\inNameSalary.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();

			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee_InterfaceComparable(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee_InterfaceComparable emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
