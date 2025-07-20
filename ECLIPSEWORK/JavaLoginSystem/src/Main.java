
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDandPasswords idandPasswords = new IDandPasswords();
		
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
		
	}

}
