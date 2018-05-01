/**
 * 
 * @author Mysti's PC
 * This ProjectQueue program will be used to gather the relevant data for the BSC Project.
 * 
 */
public class ProjectQueue {
//Mysti Freed
	
	private LinkList listOfProjects;
	private int numInQueue;
	
	/**
	 * Default constructor for the ProjectQueue class
	 */
	public ProjectQueue() {
		listOfProjects = new LinkList();
		numInQueue = 0;
	}
	
	public ProjectQueue(int num) {        
		listOfProjects = new LinkList();
		numInQueue = 0; 
	}
	
	/**
	 * This method is intended to enter strings into the queue array.
	 * @param n = pointer for the array entry
	 */
	public void enqueue(Project pr) {
		listOfProjects.insertLast(pr);
		numInQueue++;
		}
	
	/**
	 * This method is intended to remove strings from the queue array.
	 * @return removed String
	 */
	public Project dequeue() {
		Project temppr = null;
		if(isEmpty()) {
			return temppr;
		} else {
			numInQueue--;
		}
		return listOfProjects.delete();
		} 
	
	/**
	 * This method is intended to identify whether the queue is empty or not.
	 * @return boolean empty true or false
	 */
	public boolean isEmpty() {
		return listOfProjects.isEmpty();
	}
	
	/**
	 * This method is intended to identify the size of the queue array (number of filled elements).
	 * @return int size
	 */
	public int size() {
		return numInQueue;
	}
	
	/**
	 * This method is intended to print the queue elements.
	 */
	public void print() {
		System.out.println("Printing queue from beginning to end: ");
		listOfProjects.displayList();
		}
	
	/**
	 * 
	 * @return
	 */
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			System.out.println(listOfProjects.getFirst().projectLink);
		}
	}

	@Override
	public String toString() {
		return "ProjectQueue [listOfProjects=" + listOfProjects + ", numInQueue=" + numInQueue + "]";
	}

	
}