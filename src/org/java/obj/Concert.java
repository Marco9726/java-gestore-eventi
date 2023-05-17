package org.java.obj;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event{

	private LocalTime time;
	private BigDecimal price;
	

	public Concert( String title, LocalDate date, int totalSeats, LocalTime time, BigDecimal price) throws Exception {
		
		super(title, date, totalSeats);
		
		setTime(time);
		setPrice(price);
		
		if ( totalSeats > 0) {
			this.totalSeats = totalSeats;
		} else {
			
			throw new Exception("I posti totali devono essere più di 0");
		}
		
	}
	
//	GETTERS AND SETTERS
	public LocalTime getTime() {
		return time;
	}
	
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public String formatDecimalPrice() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String formatDec = "" + df.format(getPrice());
        return formatDec;
    }
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + getDate() + getTime() + "-" + "getTtile()" + "-" + formatDecimalPrice();
	}
	
}
