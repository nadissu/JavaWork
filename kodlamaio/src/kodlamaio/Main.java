package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setCourseName("Java");
		
		Student student=new Student();
		student.setStudentNumber("16-701-015");
		
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.getDetail(student);
		
		User[] users= {instructor,student};
			}

}
