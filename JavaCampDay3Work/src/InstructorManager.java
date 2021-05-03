
public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println("Sayýn" + " " +instructor.getFirstName() + " " + instructor.getLastName() + " " + "Sisteme yeni Kurs baþarýyla eklediniz!");
	}
	
	public void addWork(Instructor instructor) {
		System.out.println("Sayýn" + " " +instructor.getFirstName() + " " + instructor.getLastName() + " " + "Sisteme yeni ödev baþarýyla eklediniz!");
	}
}
