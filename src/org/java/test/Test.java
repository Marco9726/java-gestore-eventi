package org.java.test;

import java.time.LocalDate;

import java.util.Scanner;

import org.java.obj.Event;
import org.java.obj.ProgramEvents;

public class Test {
	
	public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
		
        ProgramEvents festival = new ProgramEvents("festival");
        
        System.out.println(festival);
        
        System.out.println("Inserire una data: ");
		LocalDate data1 = LocalDate.parse(sc.nextLine());
        
        Event e1 = new Event("evento1", data1 , 35);
        
        festival.addEvent(e1);
        
        System.out.println("Inserire una data: ");
		LocalDate data2 = LocalDate.parse(sc.nextLine());
        
        Event e2 = new Event("evento2", data2 , 45);
        
        festival.addEvent(e2);
        
        System.out.println("Inserire una data: ");
		LocalDate data3 = LocalDate.parse(sc.nextLine());
        
        Event e3 = new Event("evento3", data3 , 55);
        
        festival.addEvent(e3);
        
        System.out.println(festival);
        
        

        
        
	        
	}
}
