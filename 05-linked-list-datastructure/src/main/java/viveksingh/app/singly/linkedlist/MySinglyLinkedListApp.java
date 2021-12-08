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

		final MySinglyLinkedList<Integer> l = new MySinglyLinkedList<>();
		l.add(10);
		l.add(20);
		System.out.println("Size : " + l.size());
		System.out.println("Data : " + l.toString());
		
		l.add(43);
		System.out.println("Size : " + l.size());
		System.out.println("Data : " + l.toString());
		
		l.add(2, 55);
		System.out.println("Size : " + l.size());
		System.out.println("Data : " + l.toString());
		
		l.addFirst(9);
		System.out.println("Size : " + l.size());
		System.out.println("Data : " + l.toString());
		
		l.addLast(58);
		System.out.println("Size : " + l.size());
		System.out.println("Data : " + l.toString());

	}

}

/**
 * Result
 * -------------
 *
		Size : 2
		Data : 10, 20, 
		Size : 3
		Data : 10, 20, 43, 
		Size : 4
		Data : 10, 20, 55, 43, 
		Size : 5
		Data : 9, 10, 20, 55, 43, 
		Size : 6
		Data : 9, 10, 20, 55, 43, 58, 
*
*/