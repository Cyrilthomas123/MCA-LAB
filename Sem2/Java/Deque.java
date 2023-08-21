import java.util.*;
public class Deque1{
	public static void main(String args[]){
		Deque<String> deque=new LinkedList<String>();
		deque.add("and vegetable");
		deque.addFirst("fruit");
		deque.addLast("are");
		System.out.println("initial deque:");
		System.out.println(deque+"");
		deque.push("A");
		deque.offer("good");
		deque.offerFirst("daily");
		deque.offerLast("for health");
		System.out.println("\ndeque");
		System.out.println(deque+"");
		System.out.println("deque contents using iterators");
		Iterator iterator=deque.iterator();
		while(iterator.hasNext())
		System.out.println(" "+iterator.next());
		Iterator reverse=deque.descendingIterator();
		System.out.println("\n\n deque contents using reverser iterator:");
		while(reverse.hasNext())
		System.out.println(""+reverse.next());
		System.out.println("\n\n peek "+deque.peek());
		System.out.println("after peek"+deque);
		System.out.println("\n\n pop"+deque.pop());
		System.out.println("\n\n after pop"+deque);
		System.out.println("\n contains three"+deque.contains("Three"));
		deque.removeFirst();
		deque.removeLast();
		System.out.println("\n\n after removing"+"first and last elements:"+deque);
		}
	}
