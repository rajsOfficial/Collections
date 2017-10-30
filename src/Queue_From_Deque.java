import java.util.*;

	public class Queue_From_Deque {
	   public static void main(String args[]) {
		   																	// create Deque object       
	   Deque<Integer> deque = new ArrayDeque<Integer>(7);
	      
	   																		// populate the object
	   deque.add(98);
	   deque.add(2);
	   deque.add(3);
	   deque.add(4);
	   deque.add(5);        
	   deque.add(6); 
	   Queue nq=Collections.asLifoQueue(deque);
		  
	   int x =nq.hashCode();
	   deque.add(7);
	      
	   																// get queue from the deque
	  
	    System.out.println(x);  
	   System.out.println("View of the queue is: "+nq);
	   }    
	}