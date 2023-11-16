package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(1001,"이순신");
		Customer kim = new VIPCustomer(1002,"김유신",1002);
		Customer gold = new GoldCustomer(1003,"Gold");
		Customer bronze = new BronzeCustomer(1003,"Bronze");
		customerTest(bronze, 10000);
			customerTest(lee, 10000);
			customerTest(gold, 10000);
			customerTest(kim, 10000);
			
	}
	public static void customerTest(Customer customer, int price) {
		System.out.println(customer.customerName+"님이 "+customer.calcPrice(price)+"원을 지불하셨습니다.");
		System.out.println(customer.showCustomerInfo());
	}
}
