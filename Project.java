/**
 * 
 * @author Mysti's PC
 * This class is intended to capture a project, including the project name, number, scope and type; additionally, it will capture
 * the BSC name, contact information and manager.
 */
public class Project extends BSC {
//Mysti Freed
	
	private String projectName;
	private int projectNumber;
	private String scopeStatement;
	private boolean prOrEnhancement = false;
	private String notes;
	
	/**
	 * Default constructor for the project class.
	 */
	public Project() { //default constructor
	}
	
	/**
	 * Constructor for the project class where all fields are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * @param pr - project name
	 * @param pn - project number
	 * @param ss - scope statement for the project
	 * @param pe - type (either project or enhancement)
	 * @param n - notes section
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, int pn, String ss, boolean pe,  String n) { //all info available
		super(bscn, bscp, bsce, bscm);		
		projectName = pr;
		projectNumber = pn;
		scopeStatement = ss;
		prOrEnhancement = pe;
		notes = n;
	}
	
	/**
	 * Constructor for the project class where all fields except for project number are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * @param pr - project name
	 * @param ss - scope statement for the project
	 * @param pe - type (either project or enhancement)
	 * @param n - notes section
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, String ss, boolean pe, String n) { //no PR#
		super(bscn, bscp, bsce, bscm);
		projectName = pr;
		scopeStatement = ss;
		prOrEnhancement = pe;
		notes = n;
	}
	
	/**
	 * Constructor for the project class where all fields except for scope statement are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * @param pr - project name
	 * @param pn - project number
	 * @param pe - type (either project or enhancement)
	 * @param n - notes section
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, int pn, boolean pe, String n) { //no scope statement
		super(bscn, bscp, bsce, bscm);
		projectName = pr;
		projectNumber = pn;
		prOrEnhancement = pe;
		notes = n;
	}
	
	/**
	 * Constructor for the project class where all fields except for project number and scope statement are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * @param pr - project name
	 * @param pn - project number
	 * @param ss - scope statement for the project
	 * @param pe - type (either project or enhancement)
	 * @param n - notes section
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, boolean pe, String n) { //no PR# or scope statement
		super(bscn, bscp, bsce, bscm);
		projectName = pr;
		prOrEnhancement = pe;
		notes = n;	
	}
	
	/**
	 * Constructor for the project class where all fields except notes are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * @param pr - project name
	 * @param pn - project number
	 * @param ss - scope statement for the project
	 * @param pe - type (either project or enhancement)
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, int pn, String ss, boolean pe) { //no notes
		super(bscn, bscp, bsce, bscm);
		projectName = pr;
		projectNumber = pn;
		scopeStatement = ss;
		prOrEnhancement = pe;
	}
	
	/**
	 * Constructor for the project class where all fields except project number and notes are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * @param pr - project name
	 * @param ss - scope statement for the project
	 * @param pe - type (either project or enhancement)
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, String ss, boolean pe) { //no PR# or notes
		super(bscn, bscp, bsce, bscm);
		projectName = pr;
		scopeStatement = ss;
		prOrEnhancement = pe;
	}
	
	/**
	 * Constructor for the project class where all fields except scope statement and notes are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * @param pr - project name
	 * @param pn - project number
	 * @param pe - type (either project or enhancement)
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, int pn, boolean pe) { //no scope statement or notes
		super(bscn, bscp, bsce, bscm);
		projectName = pr;
		projectNumber = pn;
		prOrEnhancement = pe;
	}
	
	/**
	 * Constructor for the project class where all fields except project number, scope statement and notes are completed.
	 * @param bscn - BSC name
	 * @param bscp - BSC phone number
	 * @param bsce - BSC email address
	 * @param bscm - BSC manager name
	 * 
	 * @param pr - project name
	 * @param pe - type (either project or enhancement)
	 */
	public Project(String bscn, String bscp, String bsce, String bscm, String pr, boolean pe) { //no PR#, scope statement or notes
		super(bscn, bscp, bsce, bscm);
		projectName = pr;
		prOrEnhancement = pe;
	}
	
	/**
	 * getter for the Project Name
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	
	/**
	 * setter for the Project Name
	 * @param projectName - project name
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	/**
	 * getter for Project Number
	 * @return projectNumber
	 */
	public int getProjectNumber() {
		return projectNumber;
	}
	
	/**
	 * setter for Project Number
	 * @param projectNumber - Project Number
	 */
	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}
	
	/**
	 * getter for Scope Statement
	 * @return scopeStatement
	 */
	public String getScopeStatement() {
		return scopeStatement;
	}
	
	/**
	 * setter for Scope Statement
	 * @param scopeStatement - Scope Statement
	 */
	public void setScopeStatement(String scopeStatement) {
		this.scopeStatement = scopeStatement;
	}
	
	/**
	 * getter for Project or Enhancement selection
	 * @return prOrEnhancement
	 */
	public boolean getPrOrEnhancement() {
		return prOrEnhancement;
	}
	
	/**
	 * setter for Project or Enhancement selection
	 * @param prOrEnhancement - Project or Enhancement
	 */
	public void setPrOrEnhancement(boolean prOrEnhancement) {
		this.prOrEnhancement = prOrEnhancement;
	}
	
	/**
	 * getter for Notes Section
	 * @return notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * setter for Notes Section
	 * @param notes - Notes Section
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * To String for all appropriate fields in the Project Class and BSC Class
	 */
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectNumber=" + projectNumber + ", scopeStatement="
				+ scopeStatement + ", prOrEnhancement=" + prOrEnhancement + ", notes=" + notes + ", getBscName()="
				+ getBscName() + ", getBscPhone()=" + getBscPhone() + ", getBscEmail()=" + getBscEmail()
				+ ", getBscMgr()=" + getBscMgr() + "]";
	}

	
	
	
	}


