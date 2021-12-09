/**
 * 
 */
package viveksingh.app.singly.linkedlist;

/**
 * @author vivek
 *
 */
public class MySinglyLinkedListApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Using list with Integer type data
		integerTypeTest();

	}

	private static void integerTypeTest() {

		final MySinglyLinkedList<Integer> l = new MySinglyLinkedList<>();
		l.add(10);
		System.out.println("l.add(10);");

		l.add(20);
		System.out.println("l.add(20);");

		l.status();

		l.add(43);
		System.out.println("l.add(43);");
		l.status();

		l.add(2, 55);
		System.out.println("l.add(2, 55);");
		l.status();

		l.addFirst(9);
		System.out.println("l.addFirst(9);");
		l.status();

		l.addLast(58);
		System.out.println("l.addLast(58);");
		l.status();

		l.remove(Integer.valueOf(43));
		System.out.println("l.remove(Integer.valueOf(43));");
		l.status();

		l.remove(Integer.valueOf(58));
		System.out.println("l.remove(Integer.valueOf(58));");
		l.status();

		l.remove(Integer.valueOf(9));
		System.out.println("l.remove(Integer.valueOf(9));");
		l.status();
		
		l.remove(2);
		System.out.println("l.remove(2);");
		l.status();
		
		l.remove(0);
		System.out.println("l.remove(0);");
		l.status();
		
		l.remove(1);
		System.out.println("l.remove(0);");
		l.status();
	}

}

/**
 * Result -------------
 *
 l.add(10);
l.add(20);
Linked List [
	Size : 2,
	Data : 10, 20, 
	Head : 10,
	Tail : 20
] 

l.add(43);
Linked List [
	Size : 3,
	Data : 10, 20, 43, 
	Head : 10,
	Tail : 43
] 

l.add(2, 55);
Linked List [
	Size : 4,
	Data : 10, 20, 55, 43, 
	Head : 10,
	Tail : 43
] 

l.addFirst(9);
Linked List [
	Size : 5,
	Data : 9, 10, 20, 55, 43, 
	Head : 9,
	Tail : 43
] 

l.addLast(58);
Linked List [
	Size : 6,
	Data : 9, 10, 20, 55, 43, 58, 
	Head : 9,
	Tail : 58
] 

l.remove(Integer.valueOf(43));
Linked List [
	Size : 5,
	Data : 9, 10, 20, 55, 58, 
	Head : 9,
	Tail : 58
] 

l.remove(Integer.valueOf(58));
Linked List [
	Size : 4,
	Data : 9, 10, 20, 55, 
	Head : 9,
	Tail : 55
] 

l.remove(Integer.valueOf(9));
Linked List [
	Size : 3,
	Data : 10, 20, 55, 
	Head : 10,
	Tail : 55
] 

l.remove(2);
Linked List [
	Size : 1,
	Data : 10, 20, 
	Head : 10,
	Tail : 20
] 

l.remove(0);
Linked List [
	Size : 0,
	Data : 20, 
	Head : 20,
	Tail : 20
] 

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Invalid index number : 1
	at viveksingh.app.singly.linkedlist.MySinglyLinkedList.checkifElemetIndex(MySinglyLinkedList.java:277)
	at viveksingh.app.singly.linkedlist.MySinglyLinkedList.remove(MySinglyLinkedList.java:249)
	at viveksingh.app.singly.linkedlist.MySinglyLinkedListApp.integerTypeTest(MySinglyLinkedListApp.java:69)
	at viveksingh.app.singly.linkedlist.MySinglyLinkedListApp.main(MySinglyLinkedListApp.java:18)

 *
 */