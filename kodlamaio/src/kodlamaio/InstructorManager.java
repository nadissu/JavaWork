package kodlamaio;

public class InstructorManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getCourseName()+"kaydedildi");
	}
	public void addMultiple (Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			add(instructor);
		}
	}

}
