package objectoriented;
	import java.util.LinkedList;

	public class LinekdList {
	public static void main(String args[])
	    {
	        // Creating object of the
	        // class linked list
	        LinkedList<String> ll = new LinkedList<String>();
	 
	        // Adding elements to the linked list
	        ll.add("Daisy");
	        ll.add("Tracy");
	        ll.addLast("Dhanusha");
	        ll.addFirst("Kia");
	        ll.add(2, "Jhon");
	         
	        System.out.println(ll);
	 
	        ll.remove("Dhanusha");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	 
	        System.out.println(ll);
	    }
	}
