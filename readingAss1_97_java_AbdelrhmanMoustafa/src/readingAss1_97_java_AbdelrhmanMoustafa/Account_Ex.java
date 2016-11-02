/**
 * 
 */
package readingAss1_97_java_AbdelrhmanMoustafa;

/**
 * @author granzer
 *
 */
public class Account_Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualIntrestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("\n                  Account");
		System.out.println("AccountID: " + account.getId());
		System.out.println("Date created: "+ account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly intrest: $%.2f\n", account.getMonthlyIntrest());
		// TODO Auto-generated method stub

	}

}
