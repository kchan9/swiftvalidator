package net.uglobal.collections.tree.traverse;

import java.util.LinkedList;

/**
 * Queue class represents a queue of objects in which elements are 
 * removed in the same order they were entered.This is often referred 
 * to as first-in-first-out (FIFO).
 *  
 */
public class Queue<E> {

	private final LinkedList<E> items;

	/**
	 * Creats an empty queue.
	 */
	public Queue() {
		items = new LinkedList<E>();
	}

	/**
	 * Inserts a new element at the rear of the queue.
	 * @param element element to be inserted.
	 */
	public E enqueue(E element) {
		items.add(element);
		return element;
	}

	/**
	 * Removes the element at the top of the queue.
	 * @return the removed element. Return null if queue empty.
	 */
	public E dequeue() {
		if (items.size() == 0)
			return null;
		return items.removeFirst();
	}

	/**
	 * Inspects the element at the top of the queue without removing it.
	 * @return the element at the top of the queue. Return null if queue empty.
	 */
	public E front() {
		if (items.size() == 0)
			return null;
		return items.getFirst();
	}

	/**
	 * @return the number of elements at the queue.
	 */
	public int size() {
		return items.size();
	}

	/**
	 * @return true of the queue is empty.
	 */
	public boolean empty() {
		return (size() == 0);
	}

	/**
	 * Removes all elements at the queue.
	 */
	public void clear() {
		items.clear();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer out = new StringBuffer(this.getClass().getName());
		for (Object item : items) {
			out.append("\n\t").append(item);
		}
		return out.toString();
	}
}
