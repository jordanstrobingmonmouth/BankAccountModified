import java.util.Scanner;



public class BankAccountTesterModified {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Amount to Start Your Account: ");
		double newAmt = input.nextDouble();
		System.out.println("");
		
		System.out.println("Enter Interest Percent: ");
		double interest = input.nextDouble();
		System.out.println("");
		
		BankAccount myBankAccount = new BankAccount(newAmt, interest);
		
		System.out.println("Enter Amount to The Amount You Want to Deposit: ");
		double newDeposit = input.nextDouble();
		myBankAccount.deposit(newDeposit);
		
		System.out.println("Enter Amount to The Amount You Want to Withdraw: ");
		double newWithdrawal = input.nextDouble();
		myBankAccount.withdraw(newWithdrawal);
		
		myBankAccount.calcInterest();
		
		
		System.out.println("Your balance is: " + myBankAccount.getBalance());

	}

}
