package Exercise;

import klas11g.Account;

public class SavingAccaunt extends Account{
	
	public SavingAccaunt(int _id, double _balance) {
		super(_id, _balance);
	}
	
	@Override
	public void withdraw(double _withdraw) {
		if(super.getBalance() -  _withdraw> 0) {
			super.setBalance(super.getBalance() - _withdraw);
		}
		
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
}
