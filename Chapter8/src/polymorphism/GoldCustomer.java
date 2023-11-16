package polymorphism;

public class GoldCustomer extends Customer {
	public double saleRatio;

	public GoldCustomer(int customerID, String customerName) {//생성자
		super(customerID, customerName);//상위 생성자의 내용을 포함하겠다.
		this.customerGrade = "Gold";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.05;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
}

