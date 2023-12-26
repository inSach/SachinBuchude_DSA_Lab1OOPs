package lib.com.departments;

public class HrDepartment extends SuperDepartment{

	String deptName = "Hr Department";
	
	public String departmentName() {
//		System.out.println("Welcome to "+this.deptName);
		return this.deptName;
	}
	
	public String getTodaysWork() {
//		System.out.println("Fill today’s timesheet and mark your attendance");
		return "Fill today’s timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
//		System.out.println("Complete by EOD");
		return "Complete by EOD";
	}
	
	public String doActivity() {
//		System.out.println("Team Lunch");
		return "Team Lunch";
	}
}
