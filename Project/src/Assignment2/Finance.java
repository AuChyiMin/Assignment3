package Assignment2;

public class Finance extends ChildrenProtectionSociety { //2.1 inheritance

	protected double totalDonation, totalExpenses, totalFees, totalDiscount, eventExpenses, otherExpenses;
	
	
	Finance(String organizationName, double totalDonation, double totalDiscount, double eventExpenses, double otherExpenses) { //constructor five argument
		super(organizationName);
		this.totalDonation = totalDonation;
		this.totalDiscount = totalDiscount;
		this.eventExpenses = eventExpenses;
		this.otherExpenses = otherExpenses;
		
		Payment totalExpenses = new FinanceGetPayment();
		this.totalExpenses = totalExpenses.getPayment(eventExpenses, otherExpenses, totalDiscount);
	}
	
	//2.3 Encapsulation (setter method)
	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}

	//2.3 Encapsulation (getter method)
	public double getTotalFees() {
		return this.totalFees;
	}
	
	public double calNetIncome() {
		return totalDonation + totalFees - totalExpenses;
	}
	
	public void printInfo() { //2.2 polymorphism
		System.out.println("Organization\t: " + organizationName +
				"\nTotal Fees\t: RM" + getTotalFees() +
				"\nTotal Donation\t: RM" + totalDonation +
				"\nTotal Discount\t: RM" + totalDiscount +
				"\nTotal Expenses\t: RM" + totalExpenses +
				"\nNet Income\t: RM" + calNetIncome());
	}
}
