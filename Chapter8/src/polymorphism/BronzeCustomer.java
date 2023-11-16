package polymorphism;

public class BronzeCustomer extends Customer {

	public BronzeCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Bronze";
		bonusRatio = 0.0;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
}