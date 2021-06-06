package Assignment2;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Participant  extends EventDescription {  //2.1 inheritance

	protected String name, email, address, contact;
	protected int age;
	protected char gender;
	protected double fee, donation;
	protected double totalPrice;
	Scanner sc = new Scanner(System.in);  //Pre-Define Class
	DecimalFormat dp = new DecimalFormat("0.00"); //Pre-Define Class
	
	Participant(String organizationName, int eventType) { // constructor with two argument
		super(organizationName, eventType);
		System.out.println("Registration for " + super.getEventName()); //method from super class
		System.out.print("Name\t\t: ");
		this.name = sc.nextLine();
		System.out.print("Age\t\t: ");
		this.age = sc.nextInt();
		System.out.print("Gender\t\t: ");
		this.gender = sc.next().charAt(0);
		System.out.print("Contact Number\t: ");
		this.contact = sc.next();
		sc.nextLine();
		System.out.print("Address\t\t: ");
		this.address = sc.nextLine();
		System.out.print("Email\t\t: ");
		this.email = sc.next();
		this.fee = super.getFee(); //method from super class
		System.out.print("Donation\t: RM");
		donation = sc.nextDouble();
		
		if(this.donation <= 200) {
			Payment totalPrice = new ParticipantGetPayment();
			this.totalPrice = totalPrice.getPayment(fee, donation, 0);
			
		}
		else {
			double discount = 0.1; //if donation more than RM200 got 10% discount
			Payment totalPrice = new ParticipantGetPayment();
			this.totalPrice = totalPrice.getPayment(fee, donation, discount);
			
		}
	}
	
	//2.3 Encapsulation (getter method)
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String getContact() {
		return this.contact;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public double getFee() {
		return this.fee;
	}
	
	public double getDonation() {
		return this.donation;
	}
	
	public double totalPrice() {
		return fee + donation;
	}
	
	public void printInfo() { //2.2 polymorphism
		System.out.println("\nCongratulation!!! You have successful registered!");
		System.out.println("Name\t\t: " + this.name +
				"\nAge\t\t: " + this.age + 
				"\nGender\t\t: " + this.gender +
				"\nContact Number\t: " + this.contact +
				"\nAddress\t\t: " + this.address + 
				"\nEmail\t\t: " + this.email +
				"\nTotal Price\t: RM" + dp.format(totalPrice));
	}
}
