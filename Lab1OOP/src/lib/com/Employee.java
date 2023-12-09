package lib.com;

public class Employee {
	
	private String empFName;
	private String empLName;
	private Organization objOrg;
	
	public Employee(String firstName, String lastName, int deptCode) {
		setEmpFName(firstName);
		setEmpLName(lastName);
		setOrgData(deptCode);
	}

	public String getEmpFName() {
		return empFName;
	}

	private void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	public String getEmpLName() {
		return empLName;
	}

	private void setEmpLName(String empLName) {
		this.empLName = empLName;
	}

	public Organization getOrg() {
		return objOrg;
	}

	public void setOrgData(int deptCode) {
		Organization objOrg = new Organization(deptCode);
		this.objOrg = objOrg;
	}
	
}
