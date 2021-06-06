package Assignment2;

public interface Payment { //2.5 interface

	double getPayment(double f, double d, double dis);
}

class ParticipantGetPayment implements Payment {
	public double getPayment(double fee, double donation, double discount) {
		return (fee + donation) * (1 - discount);
	}
}

class FinanceGetPayment implements Payment {
	public double getPayment(double eExpenses, double oExpenses, double tDiscount) {
		return eExpenses + oExpenses + tDiscount;
	}
}