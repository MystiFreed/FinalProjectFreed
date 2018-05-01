/**
 * This is the super class BSC, which houses the required information about the BSC, including
 * name, phone number, email address and manager. This class will be used by the Project class
 * to build the full project inclusive of BSC contact information.
 * @author Mysti's PC
 *
 */
public class BSC {
	
	private String bscName;
	private String bscPhone;
	private String bscEmail;
	private String bscMgr;
	
	/**
	 * Default constructor for the BSC class
	 */
	public BSC() {
	}
	
	/**
	 * Constructor for the BSC class
	 * @param bscn - BSC Name
	 * @param bscp - BSC Phone Number
	 * @param bsce - BSC Email
	 * @param bscm - BSC Manager Name
	 */
	public BSC(String bscn, String bscp, String bsce, String bscm) {
		bscName = bscn;
		bscPhone = bscp;
		bscEmail = bsce;
		bscMgr = bscm;
	}

	/**
	 * Getter for the bscName
	 * @return bscName
	 */
	public String getBscName() {
		return bscName;
	}

	/**
	 * Setter for the bscName
	 * @param bscName - BSC Name
	 */
	public void setBscName(String bscName) {
		this.bscName = bscName;
	}

	/**
	 * Getter for the bscPhone
	 * @return bscPhone
	 */
	public String getBscPhone() {
		return bscPhone;
	}

	/**
	 * Setter for the bscPhone
	 * @param bscPhone - BSC Phone Number
	 */
	public void setBscPhone(String bscPhone) {
		this.bscPhone = bscPhone;
	}

	/**
	 * Getter for the bscEmail
	 * @return bscEmail
	 */
	public String getBscEmail() {
		return bscEmail;
	}

	/**
	 * Setter for the bscEmail
	 * @param bscEmail - BSC Email Address
	 */
	public void setBscEmail(String bscEmail) {
		this.bscEmail = bscEmail;
	}

	/**
	 * Getter for bscMgr
	 * @return BSC Manager Name
	 */
	public String getBscMgr() {
		return bscMgr;
	}

	/**
	 * Setter for bscMgr
	 * @param bscMgr - BSC Manager
	 */
	public void setBscMgr(String bscMgr) {
		this.bscMgr = bscMgr;
	}

	/**
	 * To String for the BSC Class
	 */
	@Override
	public String toString() {
		return "BSC [bscName=" + bscName + ", bscPhone=" + bscPhone + ", bscEmail=" + bscEmail + ", bscMgr=" + bscMgr
				+ "]";
	}
	
	
}
