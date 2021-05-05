package Entities;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerLastName;
	private String nationalityId;
	private int dateOfBirth;
	private double balance;
	private Game[] customerGames;

	public Customer(int customerId, String customerName, String customerLastName, String nationalityId, int dateOfBirth,
			double balance, Game[] customerGames) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLastName = customerLastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.balance = balance;
		this.customerGames = customerGames;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Game[] getCustomerGames() {
		return customerGames;
	}

	public void setCustomerGames(Game[] customerGames) {
		this.customerGames = customerGames;
	}

}
