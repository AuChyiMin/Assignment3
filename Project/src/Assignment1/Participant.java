package Assignment1;

import java.util.*;

public class Participant { // 1.3 User Define Class

	String name, email, address, contact, event;
	int age;
	char gender;
	double fee, donation;
	Scanner sc = new Scanner(System.in); //1.2 Pre-Define Class

	
	Participant() { // 1.4 constructor with no argument
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
	}
	
	Participant(String event) { //1.4 constructor with one argument
		this.event = event;
		System.out.println("Registration for " + this.event + " :");
	}
	
	Participant(double fee, double donation) { //1.4 constructor with two argument
		this.fee = fee;
		this.donation = donation;
		System.out.print("Donation\t: RM");
		donation = sc.nextDouble();
	}
	
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
	
	void printInfo() {
		System.out.println("\nCongratulation!!! You have successful registered!");
		System.out.println("Name\t\t: " + this.name +
				"\nAge\t\t: " + this.age + 
				"\nGender\t\t: " + this.gender +
				"\nContact Number\t: " + this.contact +
				"\nAddress\t\t: " + this.address + 
				"\nEmail\t\t: " + this.email);
	}
}
