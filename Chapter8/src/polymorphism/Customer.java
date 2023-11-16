package polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public int bonusPoint;
	public double bonusRatio;

	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	private void initCustomer() {// init은 초기화의 약어 //private=이 생성자들 안에서만 사용하기 위함
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + " 이며, " + "보너스 포인트는 " + bonusPoint + " 입니다.";
	}

}
