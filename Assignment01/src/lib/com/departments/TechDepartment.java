package lib.com.departments;

public class TechDepartment extends SuperDepartment{
	
	String deptName = "Tech Department";
	
	public String departmentName() {
//		System.out.println("Welcome to "+this.deptName);
		return this.deptName;
	}
	
	public String getTodaysWork() {
//		System.out.println("Complete coding of module 1");
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
//		System.out.println("Complete by EOD");
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
//		System.out.println("Core Java");
		return "Core Java";
	}

}
