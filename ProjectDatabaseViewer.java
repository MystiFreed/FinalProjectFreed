import javax.swing.JFrame;

public class ProjectDatabaseViewer extends JFrame {
//Mysti Freed
	
	public static void main(String[] args) {

		Project openProject = new Project();
		
		JFrame newFrame = new ProjectDatabaseJFrame(openProject); 
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		newFrame.setVisible(true); 
		
		
		
		
		

	}

}
