/**
 * 
 */
package viveksingh.app.singly.linkedlist;

/**
 * Custom implementation of singly linked list.
 * 
 * @author vivek
 *
 */
public class MySinglyLinkedList<E> {

	/*
	 * Node counter.
	 */
	transient int size;

	/*
	 * Pointer to first node in linked list.
	 */
	transient Node<E> head;

	/*
	 * Pointer to last node in linked list.
	 */
	transient Node<E> tail;

	// Creates empty list.
	public MySinglyLinkedList() {
	}

	/**
	 * Get first node.
	 * 
	 * @return
	 */
	public Node<E> getHead() {
		return head;
	}

	/**
	 * Get last node.
	 * 
	 * @return
	 */
	public Node<E> getTail() {
		return tail;
	}

	/**
	 * Add data to list.
	 * 
	 * @param e
	 */
	public void add(E e) {
		linkLast(e);
	}

	/**
	 * Add data as last node.
	 * 
	 * @param e
	 */
	public void addLast(E e) {
		linkLast(e);
	}

	/**
	 * Add data in last.
	 * 
	 * @param e
	 */
	void linkLast(E e) {
		final Node<E> l = tail;
		Node<E> newNode = new Node<E>(e, null);

		// add this node as last node
		tail = newNode;

		if (l == null) {
			head = newNode;
		} else {
			l.next = newNode;
		}

		size++;
	}

	/**
	 * Add data as first node.
	 * 
	 * @param e
	 */
	public void addFirst(E e) {
		linkFirst(e);
	}

	/**
	 * Add node in beginning.
	 * 
	 * @param e
	 */
	void linkFirst(E e) {
		final Node<E> f = head;
		Node<E> newNode = new Node<E>(e, f);

		// add this as first node
		this.head = newNode;

		if (f == null) {
			tail = newNode;
		}

		size++;
	}

	/**
	 * Add given data on specified index.
	 * 
	 * @param index index
	 * @param e     element to be inserted.
	 */
	public void add(int index, E e) {

		// check for valid index
		checkifPositionIndex(index);

		// check if last index number then link in last
		if (index == size) {
			linkLast(e);
		} else {
			linkBefore(e, node(index));
		}

		size++;
	}

	/**
	 * Add element before succ node.
	 * 
	 * @param e
	 * @param node
	 */
	private void linkBefore(E e, Node<E> succ) {
		Node<E> newNode = new Node<E>(e, succ.next);
		succ.next = newNode;
	}

	/**
	 * Return non-null node on provided index.
	 * 
	 * @param index
	 * @return
	 */
	private Node<E> node(int index) {

		Node<E> x = head;
		// iterate 1 node behind the given index
		for (int i = 0; i < index - 1; i++) {
			x = x.next;
		}
		return x;
	}

	/**
	 * Check if index is valid.
	 * 
	 * @param i
	 */
	private void checkifPositionIndex(int i) {
		if (!(i >= 0 && i <= size)) {
			throw new ArrayIndexOutOfBoundsException("Invalid index number : " + i);
		}
	}

	/**
	 * Get size of linked list.
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	@Override
	public String toString() {

		Node<E> x = head;

		if (x == null) {
			return "";
		}

		final StringBuilder elements = new StringBuilder();
		do {

			elements.append(x.element + ", ");
			x = x.next;
		} while (x != null);

		return elements.toString();
	}
}
