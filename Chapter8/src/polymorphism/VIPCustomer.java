package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;//직접적으로 불러올 수 없는 상태가 됨
	public double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상속 문구 필요함 public class에 extends 상위클래스명 입력
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원의 번호는" + agentID + " 입니다.";
	}

	public int getAgentId() {
		return agentID;
	}
}
