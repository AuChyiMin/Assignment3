package Assignment1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========WELCOME TO CHILDREN'S PROTECTION SOCIETY==========");
		ChildrenProtectionSociety cps = new ChildrenProtectionSociety();
		ChildrenProtectionSociety cpsInfo = new ChildrenProtectionSociety("Penang, Malaysia");
		ChildrenProtectionSociety cpsWeb = new ChildrenProtectionSociety( "04-829 4046", "https://www.cps.org.my");
		cps.objective();
		
		while(option < 4) {
			System.out.println("Select your option: " + 
							"1. Admin" + 
							"\n\t\t    2. Participant" + 
							"\n\t\t    3. Exit");
			System.out.print("Option: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1: Finance f = new Finance();
					Finance Tfees = new Finance(4, 200);
					f.setEventExpenses(500);
					f.setOtherExpenses(300);
					f.setTotalDonation(2000);
					System.out.println("Total Donation\t\t: RM" + f.getTotalDonation());
					System.out.println("Total Expenses\t\t: RM" + f.calTotalExpenses());
					System.out.println("Net Income\t\t: RM" + f.calNetIncome());
					System.out.println();
					break;
			
			case 2: EventDescription EvtName = new EventDescription("Visit To Orphanage");
					EventDescription EvtInfo = new EventDescription( "30 June 2021","9:00 a.m.", "Georgetown, Penang", 4);
					EventDescription Ed = new EventDescription();
					Advertisement prizeTax = new Advertisement("1st prize-RM300 \n\t  2nd prize-RM200 \n\t  3rd prize-RM100", 10);
					Advertisement ads = new Advertisement();
					System.out.println();
					
					Participant pReg = new Participant("Visit To Orphanage");
					Participant p = new Participant();
					Participant pfee = new Participant(4, 50);
					p.printInfo();
					System.out.println("Total money paid: RM" + pfee.totalPrice());
					System.out.println();
					break;
				
			case 3: Advertisement adsEvent = new Advertisement("Children's Protection Society");
					System.out.println("Thanks For Visiting Children's Protection Society");
					System.exit(0);
			}
		}
	}

}
