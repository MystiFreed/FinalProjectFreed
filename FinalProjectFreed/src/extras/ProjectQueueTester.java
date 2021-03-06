package extras;
import Project;
import ProjectQueue;

public class ProjectQueueTester {

	public static void main(String[] args) {
		
		ProjectQueue projectList = new ProjectQueue();
		
		Project defaultProject = new Project();
		Project testAllFields = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "All Fields Project", "This will test my all fields project constructor", false, "These are some notes");
		Project noPRNumber = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "No PR Project", "This will test my all fields project constructor", true, "These are some notes");
		Project noScopeStmnt = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "No Scope Project", false, "These are some notes");
		Project noPRnoScope = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "No Scope No PR Project", false, "These are some notes");
		Project noNotes = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "No Notes Project", "This will test my all fields project constructor", false);
		Project noPRnoNotes = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "No PR No Notes Project", "This will test my all fields project constructor", false);
		Project noScopenoNotes = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "No Scope No Notes Project", false);
		Project noPRnoScopeNoNotes = new Project("Mysti Freed", "515-499-2150", "mysti.allely@gmail.com", "Heather Smith", "No Scope No PR No Notes Project", false);

		projectList.enqueue(testAllFields);
		projectList.enqueue(noScopenoNotes);
		projectList.enqueue(noScopenoNotes);
		//projectList.dequeue();
		
		System.out.println(projectList.size());
		projectList.print();
	}

}
