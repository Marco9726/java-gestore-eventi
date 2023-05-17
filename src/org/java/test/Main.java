package org.java.test;

import java.time.LocalDate;
import java.util.Scanner;

import org.java.obj.Event;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Inserire una data: ");
//		LocalDate dataProva = LocalDate.parse(sc.nextLine());
//		
//		try {
//			Event eventoProva = new Event("Concertone", dataProva , 2);
//			System.out.println(eventoProva);
//			
//			System.out.println("--------");
//			eventoProva.bookSeat(dataProva);
//			System.out.println(eventoProva);
//			System.out.println("--------");
//			eventoProva.bookSeat(dataProva);
//			System.out.println(eventoProva);
//			System.out.println("--------");
//			eventoProva.cancelSeat(dataProva);
//			System.out.println(eventoProva);
//			System.out.println("--------");
//			eventoProva.bookSeat(dataProva);
//			System.out.println(eventoProva);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
		System.out.println("----- MILESTONE 2 -----");
		
		System.out.println("Inserire titolo dell'evento");
		String title = sc.nextLine();
		
		System.out.println("Inserire una data");
		LocalDate date = LocalDate.parse(sc.nextLine());
		
		System.out.println("Quanti posti avrà l'evento?");
		int totalSeats = sc.nextInt();
		
			
		try {
			
			Event evento = new Event(title, date, totalSeats);	
			System.out.println(evento);
			
			String toBookChoice;
					
			while (true) {
				System.out.println("Vuoi effettuare una prenotazione?");
				toBookChoice = sc.next();
				
				
				if ( !toBookChoice.equals("si") && !toBookChoice.equals("no") ) {
					
					System.out.println("Scelta non compresa, ritentare");
					continue;
				} 
				break;
				
			}
			
			if ( toBookChoice.equals("si")) {
				
				while (true) {
					
					System.out.println("Quante prenotazioni vuoi effettuare?");
					int reservNumber = sc.nextInt();			
					
					if ( reservNumber > evento.remainsSeats() ) {
						
						System.out.println("I posti scelti non sono disponibili, i posti rimanenti sono: " + evento.remainsSeats());
						continue;
					} 
					
					for ( int i = 0; i < reservNumber; i++) {
						
						evento.bookSeat();
					}
					
					System.out.println("----prenotazione effettuata con succeso----");
					System.out.println(evento);	
					break;	
				}			
				
			}
			
			System.out.println("---------");
			

			String cancelChoice;
					
			while (true) {
				System.out.println("Vuoi disdire una prenotazione?");
				cancelChoice = sc.next();
				
				
				if ( !cancelChoice.equals("si") && !cancelChoice.equals("no") ) {
					
					System.out.println("Scelta non compresa, ritentare");
					continue;
				} 
				break;
				
			}
			
			if ( cancelChoice.equals("si")) {
				
				while ( true ) {
					
					System.out.println("Quante prenotazioni vuoi disdire?");
					int cancelNumber = sc.nextInt();
					
					if ( cancelNumber > evento.getBookedSeats() ) {
						
						System.out.println("Stai cancellando più posti di quelli prenotati, i posti prenotati sono: " + evento.getBookedSeats());
						continue;
					} 
					
					for ( int i = 0; i < cancelNumber; i++) {
						
						evento.cancelSeat();
					}
					
					System.out.println("----prenotazione annullata con succeso----");
					System.out.println(evento);	
					break;
				}
			}
					
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		sc.close();
			 
	}
}
