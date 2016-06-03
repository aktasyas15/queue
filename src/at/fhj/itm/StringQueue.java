package at.fhj.itm;


import java.util.NoSuchElementException;
import java.util.Vector;
/**
 * 
 * @author Akram
 * @version 03.06.2016
 *
 */


public class StringQueue implements Queue {

	
	private Vector<String> queue;

	/**
	 * @param queue
	 * queue= a new Vector 
	 */
	public StringQueue() {
		this.queue = new Vector<String>();
	}

	/**
	 * @return if addition is succussfull --> true else false
	 *  Adds the element obj to the queue.
	 *  @param obj
	 *  
	 */
	public boolean offer(String obj) {
		this.queue.addElement(obj);
		return true;
	}

	/**
	 * @return the first element and also deletes it
	 * If no element exists the method returns null.
	 */
	@Override
	public String poll() {
		if (queue.size() == 0) {
			return null;
		} else {
			String q = queue.get(0);
			queue.removeElementAt(0);
			return q;
		}

	}

	/**
	 * @return returns and deletes the head element like poll(), but also 
	 * throws NoSuchElementException if the queue is empty
	 */
	@Override
	public String remove() {
		String q = poll();
		if (q != null) {
			return q;

		} else {
			throw new NoSuchElementException();
		}

	}

	/**
	 * @return Returns the head element  
	 * Returns null when the queue is empty
	 */
	@Override
	public String peek() {
		if (queue.size() == 0) {
			return null;
		} else {
			String q = queue.get(0);
			return q;
		}
	}

	/**
	 * @return like peek() but throws NoSuchElementException when the queue is empty
	 */
	@Override
	public String element() {
		if (queue.size() == 0) {
			throw new NoSuchElementException();
		} else {
			String q = queue.get(0);
			return q;
		}
	}

}
