/**
 * This program is intended to create the link object for the LinkedList class.
 * @author Mysti's PC
 *
 */
public class Link {
//Mysti Freed
	
	//public int iData;
	public Project projectLink;
	public Link next;
	
	public Link(Project dD) {
		//iData = iD;
		projectLink = dD;
	}
	
	/**
	 * This method displays the link data.
	 */
	public void displayLink() {
		System.out.println("{" + projectLink + "}");
	}
}