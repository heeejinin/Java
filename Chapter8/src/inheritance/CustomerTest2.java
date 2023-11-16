package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		VIPCustomer kim = new VIPCustomer();
//		kim.customerID = 10002;
//		kim.customerName="김유신";
//		System.out.println("상품의 가격은 "+kim.calcprice(10000)+"원 입니다.");

		Customer lee = new Customer(1001,"이순신");
		System.out.println("상품의 가격은 "+lee.calcprice(10000)+"원 입니다.");
		VIPCustomer kim = new VIPCustomer(1002,"김유신");
		System.out.println("상품의 가격은 "+kim.calcprice(10000)+"원 입니다.");
		
		//묵시적 클래스 형 변환
		Customer ahn = new VIPCustomer(1003,"Ahn");
		//agentID는 부모클래스인 Customer에 존재하지 않기 때문에 에러 발생
		//하위 클래스를 상위 클래스로 형변환 했을 경우 하위 클래스에만 존재하는 멤버변수나 메서드는 사용할 수 없음
		//System.out.println(ahn.agentID); // vip에서 사용된 것들
		//System.out.println(ahn.getAgentID()); // vip에서 사용된 것들
		
		//ahn은 vip로 불려왔지만, 상위 클래스 Customer에 존재하는 멤버변수, 메서드는 사용 가능
		System.out.println(ahn.customerGrade);
		System.out.println(ahn.customerID);
		System.out.println(ahn.getCustomerName());
		//가상 메서드 : 재정의 된 메서드(오버라이드)된 메서드는 하위 클래스의 메서드가 실행된다
		System.out.println("상품의 가격은 "+ahn.calcprice(10000)+"원 입니다.");
		
	}

}
