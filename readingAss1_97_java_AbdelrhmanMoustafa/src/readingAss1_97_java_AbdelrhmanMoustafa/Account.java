/**
 * 
 */
package readingAss1_97_java_AbdelrhmanMoustafa;
import java.util.Date;

/**
 * @author granzer
 *
 */
public class Account extends Account_Ex {
	private int id;
	private double balance;
	private static double annualIntrestRate;
	private Date dateCreated;
	
	
	Account(){
		id = 0;
		balance = 0;
		annualIntrestRate = 0;
		dateCreated = new Date();
	}
	
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public void setAnnualIntrestRate(double newAnndualIntrestRate){
		annualIntrestRate = newAnndualIntrestRate;
	}
	
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualIntrestRate(){
		return getAnnualIntrestRate();
	}
	
	public String getDateCreated(){
		return dateCreated.toString();
	}
	
	public double getMonthlyIntrestRate(){
		return annualIntrestRate / 12;
	}
	
	public double getMonthlyIntrest(){
		return balance * (getMonthlyIntrestRate() / 100);
	}
	
	public void withdraw(double amount){
		balance -= amount;
	}
	
	public void deposit(double amount){
		balance += amount;
	}

}