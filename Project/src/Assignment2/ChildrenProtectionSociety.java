package Assignment2;

public abstract class ChildrenProtectionSociety { //2.4 abstraction

	protected String organizationName; 
	
	ChildrenProtectionSociety(String organizationName) { // constructor one argument
		this.organizationName = organizationName;
	
	}
	
	public abstract void printInfo(); //2.2 Polymorphism
	
}
