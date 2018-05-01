//import java.awt.event.ActionEvent;

//import java.awt.event.ActionListener;

import javax.swing.JFrame;
//import javax.swing.JTextField;

public class ProjectDatabaseViewer extends JFrame {
//Mysti Freed
	
	public static void main(String[] args) {

		Project openProject = new Project();
		
		JFrame newFrame = new ProjectDatabaseJFrame(openProject); 
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		newFrame.setVisible(true); 
		
		
		
		
		

	}

}
