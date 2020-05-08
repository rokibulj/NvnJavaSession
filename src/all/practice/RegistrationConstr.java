package all.practice;

public class RegistrationConstr {
	
	String fName;//m
	String lNmae;//m
	long phoneNum;//m
	String email;//m
	String pass;//m
	int opt;//m
	String ads;
	int dlNumber;
	String dob; 
	String gender;
	boolean ageLimit;
	
	
	// Contructor with all 
	public RegistrationConstr(String fName, String lNmae, long phoneNum, String email, String pass, String ads,
			int dlNumber, String dob, String gender, boolean ageLimit, int opt) {
		super();
		this.fName = fName;
		this.lNmae = lNmae;
		this.phoneNum = phoneNum;
		this.email = email;
		this.pass = pass;
		this.ads = ads;
		this.dlNumber = dlNumber;
		this.dob = dob;
		this.gender = gender;
		this.ageLimit = ageLimit;
		this.opt = opt;
	}


	// Contructor only for mandatory field
	public RegistrationConstr(String fName, String lNmae, long phoneNum, String email, String pass, int opt) {
		super();
		this.fName = fName;
		this.lNmae = lNmae;
		this.phoneNum = phoneNum;
		this.email = email;
		this.pass = pass;
		this.opt = opt;
	}
	
	
	
	

	

}
