package Assignment1;

public class EventDescription { //1.3 User Define Class

	//String info;
	String location, eventName, date, organization, time;
	double fee;
	
	EventDescription() { //1.4 constructor with no argument
		Description();
	}
	
	EventDescription(String en) { //1.4 constructor with one argument
		this.eventName = en;
		System.out.println("Event Name\t: " + this.eventName);
	}
	
	EventDescription(String l, String d, String t, double f) { //1.4 constructor with four argument
		this.location = l;
		this.date = d;
		this.time = t;
		this.fee = f;
		System.out.println("==========Event Detail==========");
		System.out.println("Date\t: " + this.date + 
				"\nTime\t: " + this.time + 
				"\nLocation: " + this.location + 
				"\nFee\t: RM" + this.fee);
	}
	
	void Description() {
		System.out.println("Event Description: " + 
				"Give warmth and happiness to children in children’s orphanages, cultivate parents to care for children, care for "
				+ "\nchildren’s groups, actively participate in spiritual dedication, and those who pass the activities will go to the children’s group.");
	}	
}
