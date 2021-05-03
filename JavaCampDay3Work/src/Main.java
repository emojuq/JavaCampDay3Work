
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("Emre");
		user.setLastName("Aydın");
		user.setId(1);
		user.setUserName("emojuq");
		user.setPassword("111111");
		
		UserManager userManager= new UserManager();
		userManager.login(user);
		userManager.logout(user);
		
		
		Student student = new Student();
		student.setFirstName("Yunus");
		student.setLastName("Keleş");
		student.setId(2);
		student.setUserName("yunusss");
		student.setPassword("2222");
		student.setEducationlevel("College");
		
		StudentManager studentManager= new StudentManager();  
		studentManager.doWork(student);
		studentManager.registerTheCourse(student);
		
		
		Instructor instructor=new Instructor();
		instructor.setId(3);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setUserName("engin123");
		instructor.setPassword("12345");
		instructor.setDepartment("C#,Java");
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addWork(instructor);
		
		
	}

}
