package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;

/*
 * add(): -If I try to add element more then queue capacity add() function throw the Error.
 * E remove() : If I try to remove element when queue is empty it will throw the error.
 *              It will remove the element from the head and return it.
 * E element() :If I try to get head element when queue is empty it will throw the error.
 *              It return the head element is queue is not empty**/
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q1 = new ArrayBlockingQueue<String>(10);
		// q1.remove();
		q1.add("Vinay");
		q1.add("Bhavesh");
		q1.add("Shray");
		q1.add("Loki");
		q1.add("Ujjwal");
		q1.add("Perteek");
		q1.add("Ravi");

		for (String name : q1) {
			System.out.println("name: " + name);
		}

		String value = q1.remove();// remove function removes the element from head of queue and return it.
		System.out.println(value);

		System.out.println();
		for (String name : q1) {
			System.out.println("name: " + name);
		}

		String name = q1.element();
		System.out.println(name);

		/*
		 * E poll() Retrieves and removes the head of this queue, or returns null if
		 * this queue is empty. Returns: the head of this queue, or null if this queue
		 * is empty
		 */
		String name2 = q1.poll();
		System.out.println(name2);

		/*
		 * E peek() Retrieves, but does not remove, the head of this queue, or returns
		 * null if this queue is empty. Returns: the head of this queue, or null if this
		 * queue is empty
		 */

		String name3 = q1.peek();
		System.out.println(name3);
		/*
		 * boolean offer(E e) Inserts the specified element into this queue if it is
		 * possible to do so immediately without violating capacity restrictions. When
		 * using a capacity-restricted queue, this method is generally preferable to
		 * add(E), which can fail to insert an element only by throwing an exception.
		 * Parameters: e - the element to add Returns: true if the element was added to
		 * this queue, else false
		 */
		q1.offer("Ram");
		
		for(String namu : q1) {
			System.out.println("name: " + namu);
		}
	}

}
