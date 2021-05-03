
public class StudentManager {
		public void registerTheCourse(Student student) {
			System.out.println("Sayın" + " " + student.getFirstName() + " " + student.getLastName()  + " " + "Kursa başarıyla kayıt oldunuz.");
		}
		
		public void doWork(Student student) {
			System.out.println("Sayın" + " " + student.getFirstName() + " " + student.getLastName()  + " " + "Ödevinizi başarıyla tamamladınız.");
		}

}
