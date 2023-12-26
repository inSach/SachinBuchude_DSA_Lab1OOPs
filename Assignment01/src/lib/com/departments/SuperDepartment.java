package lib.com.departments;

abstract class SuperDepartment {

	String deptName = "Super Department";
	
	public String departmentName() {
//		System.out.println("This is "+this.deptName);
		return this.deptName;
	}
	
	public String getTodaysWork() {
//		System.out.println("No work as of now.");
		return "No work as of now.";
	}
	
	public String getWorkDeadline() {
//		System.out.println("Nil");
		return "Nil";
	}
	
	public String isTodayAHoliday() {
//		System.out.println("Today is not a holiday");
		return "Today is not a holiday";
	}
}
