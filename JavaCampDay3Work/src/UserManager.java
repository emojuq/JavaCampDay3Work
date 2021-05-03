
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Adlý Kullanýcýyla Baþarýyla giriþ yapýldý!");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Adlý Kullanýcýyla Baþarýyla çýkýþ yapýldý!");
	}
}
