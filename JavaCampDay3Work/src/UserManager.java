
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Adl� Kullan�c�yla Ba�ar�yla giri� yap�ld�!");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Adl� Kullan�c�yla Ba�ar�yla ��k�� yap�ld�!");
	}
}
