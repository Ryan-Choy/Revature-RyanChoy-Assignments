import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueCompare {
	public static void main(String[] args) {
		

	Queue<Integer> pq = new PriorityQueue<>();
	//filling queue
	
	int[] Arr = {1,5,6,88,99,15,63,54};
	
	for (int num:Arr) {
		pq.add(num);
	}
	
	System.out.println("The PriorityQueue is: ");
	System.out.println(pq);
	
	System.out.println("\nAdding element...");
	pq.add(123);
	System.out.println(pq);
	
	
	System.out.println("\nAdding element in 2nd index...");
	//pq.add(2,11);
	System.out.println("Error, cannot add element in a specific element.");
	
	System.out.println("\nRemoving element with no input...");
	pq.remove();
	System.out.println(pq);
	System.out.println(".remove() only removes the head of the queue, aka the first element in is the first element out.");
	
	System.out.println("\nAdding the removed element...");
	pq.add(1);
	System.out.println(pq);
	
	System.out.println("\nRemoving specific element 99...");
	pq.remove(99);
	System.out.println(pq);
	
	System.out.println("\nAdding value 99...");
	pq.add(99);
	System.out.println(pq);
	
	System.out.println("\nAdding null...");
	//pq.add(null);
	System.out.println("Error, priority queue does not accept null");
	
	System.out.println("\nPriorityQueue does not accept Collections. methods...");
	
	System.out.println("\nThe size of the PriorityQueue size is: "+pq.size());
	
	System.out.println("\nAdding 3 more elements...");
	pq.add(11);
	pq.add(11);
	pq.add(11);
	System.out.println(pq.size());
	
	//making queue linked list
	Queue<Integer> ll = new LinkedList<>(pq);
	
	System.out.println("\nLinked list is...");
	System.out.println(ll);
	
	System.out.println("\nAdding element...");
	ll.add(55);
	System.out.println(ll);
	System.out.println("Can only add element at the end.");
	
	System.out.println("\nRemoving element...");
	ll.remove();
	System.out.println(ll);
	System.out.println("Removes element at the head of the queue.");
	
	System.out.println("\nRemoving specific element...");
	ll.remove(88);
	System.out.println(ll);
	
	System.out.println("\nAdding Null...");
	ll.add(null);
	System.out.println(ll);
	
	System.out.println("\n\nThe differences between PriorityQueue and LinkedList are: LinkedList can accept null values and LinkedList is double linked.");
	
	}
}
//Assignment Queue - > Understand Queue. Find difference between Linkedlist Vs PriorityQueue, Perform CRUD operations on Queue
//refer to list_demo
//queue orders elements in first in first out