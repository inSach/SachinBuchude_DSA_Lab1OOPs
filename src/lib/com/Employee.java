package lib.com;

public class Employee {
	
	private String empFName;
	private String empLName;
	private Organization objOrg;
	
	public Employee(String firstName, String lastName, Organization employeeDept) {
		setEmpFName(firstName);
		setEmpLName(lastName);
		setDept(employeeDept);
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

	public void setDept(Organization objOrg) {
		this.objOrg = objOrg;
	}
	
}
