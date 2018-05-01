/**
 * This program is intended to create the link object for the LinkedList class.
 * @author Mysti's PC
 *
 */
public class Link {
//Mysti Freed
	
	public Project projectLink;
	public Link next;
	
	/**
	 * This creates the Link to be used in the Queue based on a LinkedList
	 * @param dD
	 */
	public Link(Project dD) {
		projectLink = dD;
	}
	
	/**
	 * This method displays the link data.
	 */
	public void displayLink() {
		System.out.println("{" + projectLink + "}");
	}
}