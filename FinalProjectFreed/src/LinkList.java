/**
 * This is the LinkList class that will be used to complete methods in the stack class.
 * @author Mysti's PC
 *
 */
public class LinkList {
//Mysti Freed
	
	private Link first;
	private Link last;
	
	public LinkList() {
		first = null;
		last = null;
	}
	/**
	 * This method gets the first value in the linked list.
	 * @return the first Link
	 */
	public Link getFirst() {
		return first;
	}
	
	/**
	 * This method provides a boolean to determine if the LinkedList is empty.
	 * @return boolean empty
	 */
	public boolean isEmpty() {
		boolean empty = false;
		if(first == null) {
			empty = true;
		}
		return empty;
	}
	
	/**
	 * 
	 * This method adds the Link to the LinkedList.
	 * @param dD Link data
	 */
	public void insertLast(Project pr) {
		Link newLink = new Link(pr);
		if(isEmpty()) {
			first = newLink;
		} else //if(first.next != null) {
			last.next = newLink;
			last = newLink;
		}
	
	/**
	 * This method removes an item from the beginning of the LinkedList.
	 * @return String Link data
	 */
	public Project delete() {
		Link tempLink = first;
		tempLink = first;
		first = first.next;
		return tempLink.projectLink;
	}
	
	/**
	 * This method displays the LinkedList in reverse order of addition to the LinkedList.
	 */
	public void displayList() {
		if(isEmpty()) {
			System.out.println("There are no open projects.");
		} else {
			Link current = first;
			while(current != null) {
				current.displayLink();
				current = current.next;
			}
		System.out.print(" ");
	}
	}
}