/**
 * 
 */
package viveksingh.app.singly.linkedlist;

/**
 * @author vivek
 *
 */
public final class Node<E> {
	
	E element;
	Node<E> next;
	
	/**
	 * @param element
	 * @param prev
	 * @param next
	 */
	public Node(E element, Node<E> next) {
		this.element = element;
		this.next = next;
	}
	
	

}
