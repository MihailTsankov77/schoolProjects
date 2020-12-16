package Exercise;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccaunt sa = new SavingAccaunt(5, 500);
		CheckingAccount chek = new CheckingAccount(5, 500, -500);
		System.out.print("" + sa + chek);
	}
	

}
