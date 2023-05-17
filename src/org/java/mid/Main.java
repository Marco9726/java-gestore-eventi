package org.java.mid;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire una data: ");
		LocalDate date = LocalDate.parse(sc.nextLine());
		
		try {
			Event evento = new Event("Concertone", date , 2);
			System.out.println(evento);
			
			System.out.println("--------");
			evento.bookSeat(date);
			System.out.println(evento);
			System.out.println("--------");
			evento.bookSeat(date);
			System.out.println(evento);
			System.out.println("--------");
			evento.cancelSeat(date);
			System.out.println(evento);
			System.out.println("--------");
			evento.bookSeat(date);
			System.out.println(evento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		 
	}
}
