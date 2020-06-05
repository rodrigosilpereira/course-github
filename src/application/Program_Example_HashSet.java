package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program_Example_HashSet {

	public static void main(String[] args) {
		/*Um site de internet registra um log de acessos dos usu�rios. Um
		registro de log consiste no nome de usu�rio (apenas uma palavra) e o
		instante em que o usu�rio acessou o site no padr�o ISO 8601,
		separados por espa�o, conforme exemplo. Fazer um programa que leia
		o log de acessos a partir de um arquivo, e da� informe quantos usu�rios
		distintos acessaram o site.
		 */
		Scanner sc = new Scanner(System.in);

		//D:\Java Udemy\in\Log.txt
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				set.add(new LogEntry(username, moment));

				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
