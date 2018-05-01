package extras;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener {

	//Mysti Freed
	
		int count = 0;
		
		public void actionPerformed(ActionEvent event) {
			System.out.println("I was clicked");
			count = count + 1;
			System.out.println("I was clicked " + count + " times!");
		}
		
		
	}
}
