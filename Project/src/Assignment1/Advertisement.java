package Assignment1;

public class Advertisement{ //1.3 User Define Class

	//1.2 Pre-Define Class
	String organizationName, prize;
	double taxReduction;
	
	Advertisement() { //1.4 constructor with no argument
		eventWebsite();
 	}
	
	Advertisement(String organizationName) { //1.4 constructor with one argument
		this.organizationName = organizationName;
		ChildrenProtectionSociety();
 	}
	
	Advertisement(String prize, double taxReduction) { //1.4 constructor with two argument
		this.prize = prize;
		this.taxReduction = taxReduction;
		System.out.println("We will also play a mini game, the prizes of the mini game are divide into ");
		System.out.println("Prize\t: " + prize);
		System.out.println("If you donate MORE THAN RM600, you can get a " + taxReduction + "% tax reduction!");
 	}
	
	public String getOrganizationName() {
		return this.organizationName;
	}
	
	public String getPrize() {
		return this.prize;
	}
	
	public double getTaxReduction() {
		return this.taxReduction;
	}
	
	void ChildrenProtectionSociety() {
		System.out.println("Need to know about us! Can visit the following website: ");
		System.out.println(this.organizationName + " Facebook: https://www.facebook.com/cps/");
		System.out.println(this.organizationName + " website: https://www.cps.org/event");
	}
	
	void eventWebsite() { //for advertise poeple to participate
		System.out.println("Event Website: https://www.cps.org/event/2021/06/event-visit-to-orphanage");
	}
}
