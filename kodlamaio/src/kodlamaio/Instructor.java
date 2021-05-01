package kodlamaio;

public class Instructor extends User {
	private String courseName;
	private String department;
	
	public Instructor() {}
	
	public Instructor (String courseName , String department) {
		this.courseName=courseName;
		this.department=department;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
