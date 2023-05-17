package org.java.obj;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Event {
	

	private String title;
	private LocalDate date;
	protected int totalSeats;
	private int bookedSeats = 0;
	
	public Event( String title, LocalDate date, int totalSeats) throws Exception {
		
		setTitle(title);
		setDate(date);
		
		if ( totalSeats > 0) {
			this.totalSeats = totalSeats;
		} else {
			
			throw new Exception("I posti totali devono essere più di 0");
		}
		
	}
	
//	GETTERS AND SETTERS
	public String getTitle() {
		
		return title;
	}
	
	public void setTitle(String title) {
		
		this.title = title;
	}
	
	public LocalDate getDate() {
		
		return date;
	}
	
	public void setDate(LocalDate date) throws Exception {
		
		if (isBefore(date)) {
			
			throw new Exception("Non si può inserire una data già passata!");
		} else {
			
			this.date = date;
		}
		
	}
	
	public int getTotalSeats() {
		
		return totalSeats;
	}
	
	public int getBookedSeats() {
		
		return bookedSeats;
	}
	
	
	//METHODS
	private boolean isBefore(LocalDate date) {
		
		if (date.isBefore(LocalDate.now())) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public int remainsSeats( ) {
		
		return getTotalSeats() - getBookedSeats();
	}
	
	//prenota
	public void bookSeat() throws Exception {
		
		if (!isBefore(this.date) && this.remainsSeats() > 0) {
			
			this.bookedSeats++;			
		} else {
			
			throw new Exception("Non ci sono più posti per l'evento");
		}
	}
	
	//disdici
	public void cancelSeat() throws Exception {
		
		if (!isBefore(this.date) && getBookedSeats() > 0) {
			
			this.bookedSeats--;		
		} else {
			
			throw new Exception("Non ci sono prenotazioni da cancellare");
		}
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titolo evento: " + getTitle() + "\n" +
				"Data: " + getDate() + "\n" +
				"Posti totali: " + getTotalSeats() + "\n" +
				"Posti rimanenti: " + remainsSeats();
				
	}
	
}
