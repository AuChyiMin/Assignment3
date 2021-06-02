package Assignment1;

public class Finance { //1.3 User Definen Class
	//1.2 Pre-Define Class
	double totalDonation, eventExpenses, otherExpenses, fees;
	int totalParticipant;
	
	Finance() { //construtor no argument
		System.out.println("==========Finance for Children's Protection Society==========");
	}
	
	Finance(double fees, int tp) { //constructor two argument
		this.fees = fees;
		this.totalParticipant = tp;
		System.out.println("Total Fees\t\t: RM" + calTotalFees());
		System.out.println("Total Participant\t: " + this.totalParticipant + "participants");
	}
	
	public void setTotalDonation(double totalDonation) {
		this.totalDonation = totalDonation;
	}
	
	public void setEventExpenses(double eventExpenses) {
		this.eventExpenses = eventExpenses;
	}
	
	public void setOtherExpenses(double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	
	public double getTotalDonation() {
		return this.totalDonation;
	}
	
	public double getEventExpenses() {
		return this.eventExpenses;
	}
	
	public double getOtherExpenses() {
		return this.otherExpenses;
	}
	
	public double getFees() {
		return this.fees;
	}
	
	public int getTotalParticipant() {
		return this.totalParticipant;
	}
	
	public double calTotalFees() { 
		return fees * totalParticipant;
	}
	
	public double calTotalExpenses() { 
		return eventExpenses + otherExpenses;
 	}
	
	public double calNetIncome() {
		return totalDonation + calTotalFees() - calTotalExpenses();
	}
}
