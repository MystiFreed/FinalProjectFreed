//import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 * This class creates the frame, panel and components for the Project Database application.
 * @author Mysti's PC
 *
 */

public class ProjectDatabaseJFrame extends JFrame {
//Mysti Freed

	private static final int FRAME_WIDTH = 700; 
	private static final int FRAME_HEIGHT = 500;
	private static final int X_VAR = 400;
	private static final int Y_VAR = 400;
	private static final int BORDERS = 5;
	private static final int INSETS = 5;
	private static final int TEXT_FIELD_WIDTH = 30;
	private static final int DEFAULT = 0; //default value for use in situations in which no other value overrides
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel lblBscInfo = new JLabel("BSC Information");
	private JLabel lblNewLabel_1 = new JLabel("Please hit 'enter' after each entry.");
	private JLabel lblBscName = new JLabel("BSC Name:");
	private JTextField BSCNametextField = new JTextField();
	private JLabel lblBscPhone = new JLabel("BSC Phone:");
	private JTextField BSCPhonetextField = new JTextField();
	private JLabel lblBscEmail = new JLabel("BSC Email:");
	private JTextField BSCEmailtextField = new JTextField();
	private JLabel lblManager = new JLabel("BSC Manager:");
	private JTextField BSCMgrtextField = new JTextField();
	private JLabel lblNewLabel = new JLabel("Project Information");
	private JLabel lblProjectName = new JLabel(" Project Name:");
	private JTextField ProjectNametextField = new JTextField();
	private JLabel lblProjectNumber = new JLabel("Project Number (not required):");
	private JTextField ProjectNumbertextField = new JTextField();
	private JLabel lblProjectScope = new JLabel("Project Scope (not required):");
	private JTextField ProjectScopetextField = new JTextField();
	private JLabel lblProjectOrEnhancement = new JLabel("Check Box if Project (vs Enhancement):");
	private JCheckBox projectchckbxNewCheckBox = new JCheckBox("Project");
	private JLabel lblNotes = new JLabel("Project Notes (not required):");
	private JTextField ProjectNotestextField = new JTextField();
	private JButton btnComplete = new JButton("Complete?");
	private ProjectListener openProjectListener = new ProjectListener();
	private final JButton btnPrintProjectsList = new JButton("Print Projects List");
	//private Project project;
	ProjectQueue projectList = new ProjectQueue();
	
	/**
	 * 
	 * @param pr
	 */
	public ProjectDatabaseJFrame(Project pr) {
		setBounds(X_VAR, Y_VAR, FRAME_WIDTH, FRAME_HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(BORDERS, BORDERS, BORDERS, BORDERS));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{DEFAULT, DEFAULT};
		gbl_contentPane.rowHeights = new int[]{DEFAULT, DEFAULT};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		//project = pr;
					
		panel.setBackground(new Color(143, 188, 143));
		panel.setForeground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblBscInfo.setFont(new Font("Times New Roman", Font.BOLD, 19));
		GridBagConstraints gbc_lblBscInfo = new GridBagConstraints();
		gbc_lblBscInfo.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblBscInfo.gridx = 0;
		gbc_lblBscInfo.gridy = 0;
		panel.add(lblBscInfo, gbc_lblBscInfo);
		
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblBscName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblBscName = new GridBagConstraints();
		gbc_lblBscName.anchor = GridBagConstraints.EAST;
		gbc_lblBscName.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblBscName.gridx = 0;
		gbc_lblBscName.gridy = 1;
		panel.add(lblBscName, gbc_lblBscName);

		BSCNametextField.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_nametextField = new GridBagConstraints();
		gbc_nametextField.anchor = GridBagConstraints.WEST;
		gbc_nametextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_nametextField.gridx = 1;
		gbc_nametextField.gridy = 1;
		panel.add(BSCNametextField, gbc_nametextField);
		BSCNametextField.setColumns(TEXT_FIELD_WIDTH);
		
		lblBscPhone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblBscPhone = new GridBagConstraints();
		gbc_lblBscPhone.anchor = GridBagConstraints.EAST;
		gbc_lblBscPhone.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblBscPhone.gridx = 0;
		gbc_lblBscPhone.gridy = 2;
		panel.add(lblBscPhone, gbc_lblBscPhone);
		
		BSCPhonetextField.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_phonetextField = new GridBagConstraints();
		gbc_phonetextField.anchor = GridBagConstraints.WEST;
		gbc_phonetextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_phonetextField.gridx = 1;
		gbc_phonetextField.gridy = 2;
		panel.add(BSCPhonetextField, gbc_phonetextField);
		BSCPhonetextField.setColumns(TEXT_FIELD_WIDTH);
		
		lblBscEmail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblBscEmail = new GridBagConstraints();
		gbc_lblBscEmail.anchor = GridBagConstraints.EAST;
		gbc_lblBscEmail.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblBscEmail.gridx = 0;
		gbc_lblBscEmail.gridy = 3;
		panel.add(lblBscEmail, gbc_lblBscEmail);
		
		BSCEmailtextField.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_emailtextField = new GridBagConstraints();
		gbc_emailtextField.anchor = GridBagConstraints.WEST;
		gbc_emailtextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_emailtextField.gridx = 1;
		gbc_emailtextField.gridy = 3;
		panel.add(BSCEmailtextField, gbc_emailtextField);
		BSCEmailtextField.setColumns(TEXT_FIELD_WIDTH);
		
		lblManager.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblManager = new GridBagConstraints();
		gbc_lblManager.anchor = GridBagConstraints.EAST;
		gbc_lblManager.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblManager.gridx = 0;
		gbc_lblManager.gridy = 4;
		panel.add(lblManager, gbc_lblManager);
		
		BSCMgrtextField.addActionListener(openProjectListener);
	
		GridBagConstraints gbc_mgrtextField = new GridBagConstraints();
		gbc_mgrtextField.anchor = GridBagConstraints.WEST;
		gbc_mgrtextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_mgrtextField.gridx = 1;
		gbc_mgrtextField.gridy = 4;
		panel.add(BSCMgrtextField, gbc_mgrtextField);
		BSCMgrtextField.setColumns(TEXT_FIELD_WIDTH);
		
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 7;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		lblProjectName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblProjectName = new GridBagConstraints();
		gbc_lblProjectName.anchor = GridBagConstraints.EAST;
		gbc_lblProjectName.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblProjectName.gridx = 0;
		gbc_lblProjectName.gridy = 8;
		panel.add(lblProjectName, gbc_lblProjectName);
		
		ProjectNametextField.addActionListener(openProjectListener);
	
		GridBagConstraints gbc_projecttextField = new GridBagConstraints();
		gbc_projecttextField.anchor = GridBagConstraints.WEST;
		gbc_projecttextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_projecttextField.gridx = 1;
		gbc_projecttextField.gridy = 8;
		panel.add(ProjectNametextField, gbc_projecttextField);
		ProjectNametextField.setColumns(TEXT_FIELD_WIDTH);
		
		lblProjectNumber.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblProjectNumber = new GridBagConstraints();
		gbc_lblProjectNumber.anchor = GridBagConstraints.EAST;
		gbc_lblProjectNumber.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblProjectNumber.gridx = 0;
		gbc_lblProjectNumber.gridy = 9;
		panel.add(lblProjectNumber, gbc_lblProjectNumber);
		
		ProjectNumbertextField.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_prnumtextField = new GridBagConstraints();
		gbc_prnumtextField.anchor = GridBagConstraints.WEST;
		gbc_prnumtextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_prnumtextField.gridx = 1;
		gbc_prnumtextField.gridy = 9;
		panel.add(ProjectNumbertextField, gbc_prnumtextField);
		ProjectNumbertextField.setColumns(TEXT_FIELD_WIDTH);
		
		lblProjectScope.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblProjectScope = new GridBagConstraints();
		gbc_lblProjectScope.anchor = GridBagConstraints.EAST;
		gbc_lblProjectScope.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblProjectScope.gridx = 0;
		gbc_lblProjectScope.gridy = 10;
		panel.add(lblProjectScope, gbc_lblProjectScope);
		
		ProjectScopetextField.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_scopetextField = new GridBagConstraints();
		gbc_scopetextField.anchor = GridBagConstraints.WEST;
		gbc_scopetextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_scopetextField.gridx = 1;
		gbc_scopetextField.gridy = 10;
		panel.add(ProjectScopetextField, gbc_scopetextField);
		ProjectScopetextField.setColumns(TEXT_FIELD_WIDTH);
		
		lblProjectOrEnhancement.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblProjectOrEnhancement = new GridBagConstraints();
		gbc_lblProjectOrEnhancement.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblProjectOrEnhancement.gridx = 0;
		gbc_lblProjectOrEnhancement.gridy = 11;
		panel.add(lblProjectOrEnhancement, gbc_lblProjectOrEnhancement);
		
		projectchckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		projectchckbxNewCheckBox.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_projectchckbxNewCheckBox = new GridBagConstraints();
		gbc_projectchckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_projectchckbxNewCheckBox.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_projectchckbxNewCheckBox.gridx = 1;
		gbc_projectchckbxNewCheckBox.gridy = 11;
		panel.add(projectchckbxNewCheckBox, gbc_projectchckbxNewCheckBox);
		
		lblNotes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNotes = new GridBagConstraints();
		gbc_lblNotes.anchor = GridBagConstraints.EAST;
		gbc_lblNotes.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_lblNotes.gridx = 0;
		gbc_lblNotes.gridy = 12;
		panel.add(lblNotes, gbc_lblNotes);
		
		ProjectNotestextField.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_notestextField = new GridBagConstraints();
		gbc_notestextField.anchor = GridBagConstraints.WEST;
		gbc_notestextField.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_notestextField.gridx = 1;
		gbc_notestextField.gridy = 12;
		panel.add(ProjectNotestextField, gbc_notestextField);
		ProjectNotestextField.setColumns(TEXT_FIELD_WIDTH);
		
		btnComplete.addActionListener(openProjectListener);
		
		GridBagConstraints gbc_btnPrintProjectsList = new GridBagConstraints();
		gbc_btnPrintProjectsList.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_btnPrintProjectsList.gridx = 0;
		gbc_btnPrintProjectsList.gridy = 15;
		btnPrintProjectsList.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		panel.add(btnPrintProjectsList, gbc_btnPrintProjectsList);
		
		btnPrintProjectsList.addActionListener(openProjectListener);
			
		btnComplete.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnComplete.setBackground(Color.RED);
		GridBagConstraints gbc_btnComplete = new GridBagConstraints();
		gbc_btnComplete.anchor = GridBagConstraints.EAST;
		gbc_btnComplete.insets = new Insets(INSETS, INSETS, INSETS, INSETS);
		gbc_btnComplete.gridx = 1;
		gbc_btnComplete.gridy = 19;
		panel.add(btnComplete, gbc_btnComplete);
	}
			
	/**
	 * 
	 * @author Mysti's PC
	 * This class is intended to capture the user inputs for the project, including the project name, number, scope and type; additionally, it will capture
	 * the BSC name, contact information and manager. Adjustments are allowed for optional values for Project Number, Scope and Notes.
	 */
	public class ProjectListener implements ActionListener {
		
		public void actionPerformed(ActionEvent input) { 
			if(input.getSource() == btnPrintProjectsList) {
				projectList.print();
			}
			else 
				if(BSCNametextField.getText().isEmpty() || BSCPhonetextField.getText().isEmpty() || BSCEmailtextField.getText().isEmpty() || BSCMgrtextField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "BSC Name, Phone, Email and Manager are required to proceed.");
			}
			if(input.getSource() == btnComplete && ProjectNumbertextField.getText().isEmpty() && ProjectScopetextField.getText().isEmpty() && ProjectNotestextField.getText().isEmpty()) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, ispr));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}	
			else if(input.getSource() == btnComplete && ProjectNumbertextField.getText().isEmpty() && ProjectScopetextField.getText().isEmpty()) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					String pnotes = ProjectNotestextField.getText();
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn + "\n    Project Notes: " + pnotes);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, ispr, pnotes));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					ProjectNotestextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}
			else if(input.getSource() == btnComplete && ProjectNumbertextField.getText().isEmpty() && ProjectNotestextField.getText().isEmpty()) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					String pscope = ProjectScopetextField.getText();
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn + "\n    Project Scope: " + pscope);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, pscope, ispr));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					ProjectScopetextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}
			else if(input.getSource() == btnComplete && ProjectScopetextField.getText().isEmpty() && ProjectNotestextField.getText().isEmpty()) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					String a = ProjectNumbertextField.getText();
					Integer prnum = Integer.parseInt(a);
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn + "\n    Project Number: " + prnum);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, prnum, ispr));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					ProjectNumbertextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}
			else if(input.getSource() == btnComplete && ProjectNumbertextField.getText().isEmpty()) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					String pscope = ProjectScopetextField.getText();
					String pnotes = ProjectNotestextField.getText();
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn + "\n    Project Scope: " + pscope + "\n    Project Notes: " + pnotes);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, pscope, ispr, pnotes));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					ProjectScopetextField.setText("");
					ProjectNotestextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}
			else if(input.getSource() == btnComplete && ProjectScopetextField.getText().isEmpty()) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					String a = ProjectNumbertextField.getText();
					Integer prnum = Integer.parseInt(a);
					String pnotes = ProjectNotestextField.getText();
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn + "\n    Project Number: " + prnum + "\n    Project Notes: " + pnotes);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, prnum, ispr, pnotes));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					ProjectNumbertextField.setText("");
					ProjectNotestextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}
			else if(input.getSource() == btnComplete && ProjectNotestextField.getText().isEmpty()) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					String a = ProjectNumbertextField.getText();
					Integer prnum = Integer.parseInt(a);
					String pscope = ProjectScopetextField.getText();
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn + "\n    Project Number: " + prnum + "\n    Project Scope: " + pscope);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, prnum, pscope, ispr));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					ProjectNumbertextField.setText("");
					ProjectScopetextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}
			else if(input.getSource() == btnComplete) {
				try {
					boolean temp = false;
					String bscn = BSCNametextField.getText();
					String bscp = BSCPhonetextField.getText();
					String bsce = BSCEmailtextField.getText();
					String bscm = BSCMgrtextField.getText();
					String prn = ProjectNametextField.getText();
					String a = ProjectNumbertextField.getText();
					Integer prnum = Integer.parseInt(a);
					String pscope = ProjectScopetextField.getText();
					String pnotes = ProjectNotestextField.getText();
					if(projectchckbxNewCheckBox.isSelected()) {
						temp = true;
					}
					boolean ispr = temp;
					JOptionPane.showMessageDialog(null, "Is the information provided correct? If no, please re-enter.");
					JOptionPane.showMessageDialog(null, "Name: " + bscn + "\n    Phone: " + bscp + "\n    Email: " + bsce + "\n    Manager: " + bscm);
					JOptionPane.showMessageDialog(null, "Project Name: " + prn + "\n    Project Number: " + prnum + "\n    Project Scope: " + pscope + "\n    Project Notes: " + pnotes);
					JOptionPane.showMessageDialog(null, "Project? " + ispr);
					projectList.enqueue(new Project(bscn, bscp, bsce, bscm, prn, prnum, pscope, ispr, pnotes));
					BSCNametextField.setText("");
					BSCPhonetextField.setText("");
					BSCEmailtextField.setText("");
					BSCMgrtextField.setText("");
					ProjectNametextField.setText("");
					ProjectNumbertextField.setText("");
					ProjectScopetextField.setText("");
					ProjectNotestextField.setText("");
					projectchckbxNewCheckBox.setSelected(false);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Project Number must be digits only.");
				}
			}
			
		}
	}
}




