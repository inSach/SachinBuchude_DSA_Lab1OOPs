package lib.com.departments;

public class AdminDepartment extends SuperDepartment{
	
	String deptName = "Admin Department";
	
	public String departmentName() {
//		System.out.println("Welcome to "+this.deptName);
		return this.deptName;
	}
	
	public String getTodaysWork() {
//		System.out.println("Complete your documents Submission");
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
//		System.out.println("Complete by EOD");
		return "Complete by EOD";
	}

}
