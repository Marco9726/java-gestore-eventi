package org.java.obj;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramEvents {
	
	private String title;
	private List<Event> events;
	
	public ProgramEvents(String title) {
		
		setTitle(title);
		setEvents();
	}
	
//	GETTERS AND SETTERS
	public String getTitle() {
		
		return title;
	}
	public void setTitle(String title) {
		
		this.title = title;
	}
	public List<Event> getEvents() {
		
		return events;
	}
	public void setEvents() {
		
		this.events = new ArrayList<>();
	}
	
//	METHODS
	public void addEvent(Event event) {
		
		this.events.add(event);
	}
	
	public List<Event> Eventsdate(LocalDate date) {
		
		List<Event> newList = new ArrayList<>();
		
		for ( Event event : events) {
			
			if ( event.getDate().equals(date)) {
				
				newList.add(event);
			}
		}
		
		return newList;	
		
	}
	
	public int getProgramEventsSize() {
		
		return events.size();
		
	}
	
	public void clearList() {
		
		events.clear();
	}
	
	
	
	
	
	@Override
	public String toString() {
		
		events.sort(Comparator.comparing(a -> a.getDate()));
		
	
		return "Titolo: " + getTitle() + "\n" 
				+ "----" + "\n" + getEvents();
	}
}
