package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.entities.Reservation_BadSolution;
import model.entities.Reservation_GoodSolution;
import model.exceptions.DomainException;

public class Program_Hotel_Reservation_Good_solution {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
	
			Reservation_GoodSolution reservation = new Reservation_GoodSolution(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
	
			reservation.updateDates(checkIn, checkOut);
	
			System.out.println("Reservation: " + reservation);
		} catch (ParseException e) {
			System.out.print("Invalid Date Format! ");			
		} catch (DomainException e) {
			System.out.print("Error in reservation: " + e.getMessage());
		}  catch (RuntimeException e) {
			System.out.print("Unexpected error: " + e.getMessage());
		} 
		
		
		
		sc.close();
	}
}
