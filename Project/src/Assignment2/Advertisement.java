package Assignment2;

public class Advertisement extends EventDescription { //2.1 inheritance

	protected String prize, eventWebsite;
	
	Advertisement(String organizationName, int eventType) { // constructor with two argument
		super(organizationName, eventType);
		
		switch(eventType) {
		case 1: System.out.println("We will also play a mini game with orphans, the prizes of the mini game are :");
				setPrize("1st prize-Luxury gift basket + RM150 \n\t\t  2nd prize-Gift basket + RM100 \n\t\t  3rd prize-RM50");
				setEventWebsite("https://www.cps.org/event/2021/06/event-visit-to-orphanage");
				break;
			
		case 2: System.out.println("We have a lucky draw as entertainment!");
				setPrize("Mystery jackpot and some prizes!");
				setEventWebsite("https://www.cps.org/event/2021/06/event-child-protection-is-the-reponsibility");
				break;
			
		}
 	}
	
	//2.3 Encapsulation (setter method)
	public void setPrize(String prize) {
		this.prize = prize;
	}
	
	public void setEventWebsite(String eventWebsite) {
		this.eventWebsite = eventWebsite;
	}
	
	//2.3 Encapsulation (getter method)
	public String getPrize() {
		return this.prize;
	}
	
	public String getEventWebsite() {
		return this.eventWebsite;
	}
	
	public static void Website() {
		System.out.println("Need to know more about us! Come to visit the following website: ");
		System.out.println("Facebook: https://www.facebook.com/cps/");
		System.out.println("website: https://www.cps.org/event");
	}
	
	public void printInfo() { //2.2 polymorphism
		System.out.println("Prize\t\t: " + getPrize() +
				"\nEvent Website\t: " + getEventWebsite() + 
				"\nWe have a session of donate is to help orphans and poor children." +
				"If you donate MORE THAN RM200, you can get a 10% discount!");
	}
}
