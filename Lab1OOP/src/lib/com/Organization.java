package lib.com;

public class Organization {

	private String departmentName;
	private final String orgName = "abcLabs";
	
	public Organization(int deptCode) {
		this.setDepartmentName(deptCode);
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(int deptCode) {
		String department = "";
		switch (deptCode) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		}
		this.departmentName = department;
	}
	
	public String getOrgName() {
		return orgName;
	}
}
