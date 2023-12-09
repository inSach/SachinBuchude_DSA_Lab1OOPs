package lib.com;

public class CredentialSrvc {

	private String email;
	private String pwd;

	
	/*
	 * public CredentialSrvc() {
	 * 
	 * }
	 */
	
	public CredentialSrvc(Employee objEmp) {
		Organization objDepartment = objEmp.getOrg();
		this.generateEmail(objEmp.getEmpFName(), objEmp.getEmpLName(), objDepartment.getDepartmentName(), objDepartment.getOrgName());
		this.generatePwd(this.email);
	}

	private void generateEmail(String fName, String lName, String dept, String orgName) {
//		email = fName.toLowerCase() + lName.toLowerCase()+ "@" + dept + "." + orgName + ".com";
		this.email = String.format("%s%s@%s.%s.com", fName.toLowerCase(), lName.toLowerCase(), dept.toLowerCase(),orgName);
	}

	private void generatePwd(String email) {
		this.pwd = "empPwd";
	}

	public void restePwd(String email) { 
		this.generatePwd(email);
	}
	 
	public void showCredentials() {
		System.out.println("Email    ----- > " + this.email);
		System.out.println("Password ----- > " + this.pwd);
	}
}
