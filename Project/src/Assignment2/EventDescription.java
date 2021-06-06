package Assignment2;

public class EventDescription extends ChildrenProtectionSociety { //2.1 Inheritance

	protected int eventType;
	protected String location, eventName, date, organizationName, time;
	protected double fee;
	
	EventDescription(String organizationName, int eventType) { //constructor with two argument
		super(organizationName);
		this.organizationName = organizationName;
		this.eventType = eventType;
		
		switch(eventType) {
		case 1: setEventName("Visit To Orphanage");
				setLocation("Penang Shan Children's Home");
				setDate("30 June 2021");
				setTime("8:00 a.m.");
				setFee(4);
				break;
			
		case 2: this.eventName = "Seminar: Child Protection Is The Responsibility";
				this.location = "Island Plaza Mall";
				this.date = "28 June 2021";
				this.time = "10:00 a.m.";
				this.fee = 3.50;
				break;
		}
	}
	
	//2.3 Encapsulation (setter method)
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public  void setLocation(String location) {
		this.location = location;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	// Encapsulation (getter method)
	public String getEventName() {
		return eventName;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public double getFee() {
		return this.fee;
	}
	
	public void printInfo() { //2.2 Polymorphism
		System.out.println("++++++++++Event Details++++++++++" + 
				"\nEvent Name\t: " + getEventName() +
				"\nDate\t\t: " + getDate() + 
				"\nTime\t\t: " + getTime() + 
				"\nLocation\t: " + getLocation() + 
				"\nFee\t\t: RM" + getFee());
	}
}
