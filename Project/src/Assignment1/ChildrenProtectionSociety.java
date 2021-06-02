package Assignment1;

public class ChildrenProtectionSociety { //1.3 User Define Class

	String organizationName, address, contact, website; //1.2 Pre-Define Class
	
	ChildrenProtectionSociety() { // constructor no argument
		this.organizationName = "Children's Protection Society";
		System.out.println("Organization Name: " + organizationName);
	}
	
	ChildrenProtectionSociety(String address) { // constructor one argument
		this.address = address;
		System.out.println("Address: " + this.address);
	}
	
	ChildrenProtectionSociety(String contact, String website) { // constructor two argument
		this.contact = contact;
		this.website = website;
		System.out.println("Contact Number: " + this.contact);
		System.out.println("Website: " + this.website);
	}
	
	public String getOrganizationName() {
		return this.organizationName;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getContact() {
		return this.contact;
	}
	
	public String getWebsite() {
		return this.website;
	}
	
	void objective () {
		System.out.println("Organization Goal: " + 
				"\nThe Objectives of CPS are both immediate and longer-term." + 
				"\ni. The immediate objective is to provide children at risk with " +
				"\n   a safe and supportive environment conducive to their healthy development." +
				"\nii.In the longer-term we seek to support projects that enhance community-based " +
				"\n   facilities for childcare and development in areas where such facilities are lacking. ");
	}
}
