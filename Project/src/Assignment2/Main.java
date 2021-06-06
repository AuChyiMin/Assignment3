package Assignment2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		int eventType;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========WELCOME TO CHILDREN'S PROTECTION SOCIETY==========");
		System.out.println("Organization Name: Children's Protection Society");
		System.out.println("Address          : Penang, Malaysia");
		System.out.println("Contact Number   : 04-829 4046");
		System.out.println("Website          : https://www.cps.org.my");
		System.out.println("Organization Goal: " +
				"\nThe Objectives of CPS are both immediate and longer-term." + 
				"\ni. The immediate objective is to provide children at risk with " +
				"\n   a safe and supportive environment conducive to their healthy development." +
				"\nii.In the longer-term we seek to support projects that enhance community-based " +
				"\n   facilities for childcare and development in areas where such facilities are lacking. ");
		System.out.println();
		
		while(option < 4) {
			System.out.println("Select your option: " + 
							"1. Admin" + 
							"\n\t\t    2. Participant" + 
							"\n\t\t    3. Exit");
			System.out.print("Option: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1: System.out.println("==========Finance ==========");
					Finance f = new Finance("Children's Protection Society", 10000, 900, 3000, 1500);
					f.setTotalFees(5000);
					f.printInfo();
					System.out.println();
					break;
			
			case 2: System.out.println("Event 1: Visit To Orphanage" +
									"\nEvent 2: Seminar: Child Protection Is The Reponsibility");
					System.out.print("Select the event you wish to participate: ");
					eventType = sc.nextInt();
					System.out.println();
					
					EventDescription ed = new EventDescription("Children's Protection Society", eventType);
					ed.printInfo();
					Advertisement ads = new Advertisement("Children's Protection Society", eventType);
					ads.printInfo();
					Participant pReg = new Participant("Children's Protection Society", eventType);
					pReg.printInfo();
					System.out.println();
					break;
				
			case 3: Advertisement.Website();
					System.out.println("Thanks For Visiting Children's Protection Society");
					System.exit(0);
			}
		}
	}

}

