package classtest;
class Order{
	// 주문번호, 주문자 ID, 주문 날짜, 주문자 이름, 주문 상품 번호, 배송 주소
	//201803120001, abc123, 2018년3월12일, 홍길동, PD0345-12 서울시 영등포구 여의도동 20
	// 멤버변수 선언하고, 기능 : 모든 내용을 출력하는 기능 (showOrderInfo)
	//멤버변수
	String orderNumber;
	String userID;
	String orderDate;
	String username;
	String goodsID;
	String orderAddress;
	
	
	public Order() {} //기본생성자 : 작성하지 않더라도 실행 가능(프로그램이 생성될 때 컴퓨터가 생성해주기 때문에
	//여러개의 생성자 작성 방법 (메서드 오버로드)
	//생성자 : 인스턴스를 생성할 때 사용되는 메서드
	public Order(String orderNumber, String userID,	
			String orderDate, String username, 
			String goodsID, String orderAddress) {
		this.orderNumber = orderNumber;
		this.userID = userID;
		this.orderDate = orderDate;
		this.username= username;
		this.goodsID = goodsID;
		this.orderAddress = orderAddress;
	}
	
	//생성자의 매개변수의 갯수를 다르게 한다.
	//생성자의 매개변수 자료형을 다르게 한다. (같은 자료형에 대개변수 이름만 다른 것을 만드는 것은 불가능)
	//									   (ex. string 오더넘버, long 오더넘버 는 자료형이 달라서 다른 메서드로 인식)
	int add(int x) {
		return x+x;
	}
	long add(long x) {
		return x+x;
	}
	int add(int x, int y) {
		return x+y;
	}
	long add(long x, int y) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+x+z;
	}
	
	
	
	void showOrderInfo(){
		System.out.println("주문번호 :"+ orderNumber);
		System.out.println("주문자 아이디 :" + userID);
		System.out.println("주문 날짜 :" + orderDate);
		System.out.println("주문자 이름 :" + username);
		System.out.println("주문 상품 번호 :" + goodsID);
		System.out.println("배송 주소 :" + orderAddress);
	}
}
public class OrederTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order(); // new 생성자();
		order1.orderNumber ="201803120001";
		order1.userID = "abc123"; 
		order1.orderDate = "2018년3월12일";
		order1.username = "홍길동";
		order1.goodsID = "PD0345-12";
		order1.orderAddress = "서울시 영등포구 여의도동 20";
		//ctrl + 메서드 이름 클릭 : 메서드가 선언되어 있는 코드로 이동
		order1.showOrderInfo();
		
		
		System.out.println();
		Order order2 = new Order("201803120001", "def123", "2023년11월03일", 
												"이순신", "PD7890-54", "부산시 부산진구" ); 
		order2.showOrderInfo();
	}

}
