package at.fhj.itm;

import java.util.NoSuchElementException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TestQueue {

	/**
	 * 
	 * @param args
	 * queue = a new Object fron the class "Stringqueue"
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * new obj from StringQueue class
		 */
		StringQueue queue = new StringQueue();
	
		/**
		 * poll method will be called there 
		 */
	String q1=	queue.poll();
	System.out.println("Sollte Null sein --->" +q1);
		//remove methode aufruf
	try{
		queue.remove();
	}catch(NoSuchElementException e){
		System.out.println("Im catch gefangen sonst NoSuchElementException-Meldung");
		
	}
	/**
	 * new values 
	 */
	//werte einspeichern in methode offer
	queue.offer("akram");
	queue.offer("yasin");
	queue.offer("aman");
	
	
	String q2 = queue.remove();
	System.out.println("Sollte Akram sein: " + q2);
	
	//aufruf mehtode peek()
	String q3 = queue.peek();
	System.out.println("Sollte yasin sein: " + q3);
	
	String q4 = queue.remove();
	System.out.println("Sollte yasin bleiben weil peek nicht löscht: " + q4);
	
	queue.remove();
	
	try{
		//aufruf methode element()
		queue.element();
	}catch(NoSuchElementException e){
		System.out.println("Im catch gefangen sonst NoSuchElementException-Meldung");
		
	}
	

	}

}
